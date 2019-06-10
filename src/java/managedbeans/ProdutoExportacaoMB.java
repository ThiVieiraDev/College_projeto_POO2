/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managedbeans;

import java.util.ArrayList;
import java.util.List;
import modelos.ProdutoExportacao;
import services.ProdutoExportacaoService;

/**
 *
 * @author W10
 */
public class ProdutoExportacaoMB {
    private ProdutoExportacao prod = new ProdutoExportacao();
    private ProdutoExportacaoService servico = new ProdutoExportacaoService();
    List<ProdutoExportacao> produtos = new ArrayList<>();
    
     public void salvar(){
        servico.salvar(prod);
        prod = new ProdutoExportacao();
    }
     
    public void excluir(ProdutoExportacao p){
        servico.excluir(p);
    }

    public ProdutoExportacao getProd() {
        return prod;
    }

    public void setProd(ProdutoExportacao prod) {
        this.prod = prod;
    }

    public ProdutoExportacaoService getServico() {
        return servico;
    }

    public void setServico(ProdutoExportacaoService servico) {
        this.servico = servico;
    }

    public List<ProdutoExportacao> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<ProdutoExportacao> produtos) {
        this.produtos = produtos;
    }
    
    
}
