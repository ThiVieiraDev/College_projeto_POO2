package modelos;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "TB_ITEMPEDIDO")
public class ItemPedido implements Serializable, Teste {
    @Id
    private int numero;
    private int quantidade;
//    @OneToMany
//    @JoinColumn(name = "codigo")
    private List<Produto> produtos = new ArrayList<>();
    
//    public double totalItem(){
//        if(this.produto != null)
//            return produto.getPreco()*quantidade;
//        return 0;
//    }

    public ItemPedido(int numero, int quantidade) {
        this.numero = numero;
        this.quantidade = quantidade;
    }

    public ItemPedido() {
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.numero;
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
        final ItemPedido other = (ItemPedido) obj;
        if (this.numero != other.numero) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ItemPedido{" + "numero=" + numero + '}';
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public boolean validar() {
        // Verifica se o ItemPedido incrementou Numero
        if(this.getNumero() < 0){
            return false;
        }
        // Verifica se o ItemPedido incrementou Quantidade
        if(this.getQuantidade() < 0){
            return false;
        }
        // Retorna True;
        else
        {
            return true; //To change body of generated methods, choose Tools | Templates.
        }
    }
}
