package modelos;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;

@Entity
@Table(name = "TB_PEDIDO")
public class Pedido implements Serializable, Teste {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "PedidoID")
    private long numero;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date data;
    @ManyToOne
    @JoinColumn(name = "ClienteID")
    private Cliente cliente;

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + (int) (this.numero ^ (this.numero >>> 32));
        return hash;
    }

    public Pedido(long numero, Date data, Cliente cliente) {
        this.numero = numero;
        this.data = data;
        this.cliente = cliente;
    }    
    
    public Pedido(){
        
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pedido other = (Pedido) obj;
        if (this.numero != other.numero) {
            return false;
        }
        return true;
    }

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Pedido{" + "numero=" + numero + '}';
    }

    @Override
    public boolean validar() {
        // Verifica se o Pedido tem Cliente
        if(this.getCliente() == null) {
            return false;
        }
        // Verifica se o Pedido está incrementando o numero certo
        if(this.getNumero() < 0 ) {
            return false;
        }
        // Verifica se a Data está no formato Date
        if(this.getData() != data) {
            return false;
        }
        // Se tiver tudo ok, retorna true;
        else {
            return true;
        }
    }
        
}
