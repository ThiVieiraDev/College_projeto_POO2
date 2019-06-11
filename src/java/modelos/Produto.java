package modelos;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "TB_PRODUTO")
public class Produto implements Serializable, Teste {
    @Id
    private int codigo;
    private int moeda;
    private String nome;
    @OneToOne
    private Categoria categoria;
    private double preco, imposto;

    public Produto(int codigo, int moeda, String nome, Categoria categoria, double preco, double imposto){
        this.codigo = codigo;
        this.moeda = moeda;
        this.nome = nome;
        this.categoria = categoria;
        this.preco = preco;
        this.imposto = imposto;
    }
    
    public Produto()
    {
    
    }
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getMoeda() {
        return moeda;
    }

    public void setMoeda(int moeda) {
        this.moeda = moeda;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getImposto() {
        return imposto;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }

    @Override
    public String toString() {
        return "Produto{" + "codigo=" + codigo + ", moeda=" + moeda + ", nome=" + nome + ", categoria=" + categoria + ", preco=" + preco + ", imposto=" + imposto + '}';
    }

    @Override
    public boolean validar() {
        
        // Verifica se o Produto possui nome
        if(this.getNome() == null){
            return false;
        }
        // Verifica se o Produto possui preço
        if(this.getPreco() > 0 ){
            return false;
        }
        // Verifica se o Produto tem codigo
        if(this.getCodigo() > 0){
            return false;
        }
        // Verifica se o Produto tem categoria
        if(this.getCategoria() == null){
            return false;
        }
        // Retorna true se estiver tudo preenchido
        else
        {
            return true;
        }
    }
    
    
}
