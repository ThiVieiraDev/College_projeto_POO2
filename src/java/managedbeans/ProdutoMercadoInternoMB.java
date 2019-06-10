/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managedbeans;

import java.util.ArrayList;
import java.util.List;
import modelos.ProdutoMercadoInterno;
import services.ProdutoMercadoInternoService;

/**
 *
 * @author W10
 */
public class ProdutoMercadoInternoMB {
    private ProdutoMercadoInterno prod = new ProdutoMercadoInterno();
    private ProdutoMercadoInternoService servico = new ProdutoMercadoInternoService();
    List<ProdutoMercadoInterno> produtos = new ArrayList<>();
    
     public void salvar(){
        servico.salvar(prod);
        prod = new ProdutoMercadoInterno();
    }
     
    public void excluir(ProdutoMercadoInterno p){
        servico.excluir(p);
    }

    public ProdutoMercadoInterno getProd() {
        return prod;
    }

    public void setProd(ProdutoMercadoInterno prod) {
        this.prod = prod;
    }

    public ProdutoMercadoInternoService getServico() {
        return servico;
    }

    public void setServico(ProdutoMercadoInternoService servico) {
        this.servico = servico;
    }

    public List<ProdutoMercadoInterno> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<ProdutoMercadoInterno> produtos) {
        this.produtos = produtos;
    }  
}
