package modelos;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "TB_CATEGORIA")
public class Categoria implements Serializable, Teste {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int codigo;
    private String descricao;

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + this.codigo;
        return hash;
    }

    @Override
    public String toString() {
        return "Categoria{" + "codigo=" + codigo + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Categoria other = (Categoria) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        return true;
    }

    public Categoria(String descricao) {
        this.descricao = descricao;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Categoria() {

    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public boolean validar() {

        // Verifica se foi cadastrado a descrição
        if (this.getDescricao() == null) {
            return false;
        } 
        // Verifica se esta cadastrando o codigo certo
        if (this.getCodigo() < 0){
            return false;
        }
        // Caso passe pelas verificações retorna true;
        else {
            return true;
        }
    }
}
