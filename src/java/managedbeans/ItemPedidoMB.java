/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managedbeans;

import java.util.List;
import modelos.ItemPedido;
import services.ItemPedidoService;

/**
 *
 * @author W10
 */
public class ItemPedidoMB {
    private ItemPedidoService servico = new ItemPedidoService();
    private ItemPedido item = new ItemPedido();
    private List<ItemPedido> itens;
    
    public void salvar(){
        servico.salvar(item);
        item = new ItemPedido();
    }
    
     public void excluir(ItemPedido item){
        servico.excluir(item);
    }

    public ItemPedidoService getServico() {
        return servico;
    }

    public void setServico(ItemPedidoService servico) {
        this.servico = servico;
    }

    public ItemPedido getItem() {
        return item;
    }

    public void setItem(ItemPedido item) {
        this.item = item;
    }

    public List<ItemPedido> getItens() {
        return itens;
    }

    public void setItens(List<ItemPedido> itens) {
        this.itens = itens;
    }   
     
}
