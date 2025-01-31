package modelos;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "TB_PRODUTOMERCADOINTERNO")
public class ProdutoMercadoInterno extends Produto {
    private boolean incentivo;
    
    public ProdutoMercadoInterno(int codigo, int moeda, String nome, Categoria categoria, 
            double preco, double imposto, boolean incentivo){
        
        super(codigo, moeda, nome, categoria, preco, imposto);
        this.incentivo = incentivo;
    }
    
    public ProdutoMercadoInterno(){
    
    }
    
    public boolean getIncentivo(){
        return this.incentivo;
    }
    
    public void setIncentivo(boolean incentivo){
        this.incentivo = incentivo;
    }

    @Override
    public String toString() {
        return "ProdutoMercadoInterno{" + "incentivo=" + incentivo + '}';
    }
    
    
    
}
