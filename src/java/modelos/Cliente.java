package modelos;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "TB_CLIENTE")
public class Cliente implements Serializable, Teste {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ClienteID")
    private int codigo;
    private int status;    
    private String nome, endereco, telefone;
    private double limite;
    @OneToMany
    @PrimaryKeyJoinColumn(name = "numero")
    private List<Pedido> pedidos;

    //construtor
    public Cliente(int codigo, int status, String nome, String endereco, String telefone, double limite){
        this.pedidos = new ArrayList<>();
        this.codigo = codigo;
        this.status = status;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.limite = limite;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + this.codigo;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cliente other = (Cliente) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        return true;
    }
    
    public Cliente(){
            
    }
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
    
    public void addPedido(Pedido p){
        pedidos.add(p);
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    @Override
    public String toString() {
        return "Cliente{" + "codigo=" + codigo + ", status=" + status + ", nome=" + nome + ", endereco=" + endereco + ", telefone=" + telefone + ", limite=" + limite + ", pedidos=" + pedidos + '}';
    }

    @Override
    public boolean validar() {
        if(this == null){
          return false;
        }
        // Verifica se o cliente possui nome cadastrado
        if(this.getNome() == null){
          return false;
        }
        // Verifica se o cliente possui endereço cadastrado
        if(this.getEndereco() == null){
            return false;
        }
        // Verifica se o cliente possui telefone cadastrado
        if(this.getTelefone() == null){
            return false;
        }
        // Verifica se esta cadastrando o codigo certo
        if (this.getCodigo() < 0) {
            return false;
        }
        // Caso passe pelas verificações retorna true;
        else
        {
          return true;
        }
         //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
