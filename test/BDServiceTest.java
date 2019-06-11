/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import generico.BDService;
import modelos.Cliente;
import modelos.Categoria;
import modelos.Pedido;
import modelos.Produto;
import modelos.ItemPedido;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import services.ClienteService;
import services.CategoriaService;
import services.PedidoService;
import services.ProdutoService;
import services.ItemPedidoService;

import testes.BDServiceMSG;

/**
 *
 * @author W10
 */
public class BDServiceTest {
    
    @Before
    public void setUp(){
        BDService instance = new BDService() {};
    }
    
    @Test
    public void testeSalvar(){
        // Testando Save do Cliente
        System.out.println("Salvar Cliente");
        ClienteService instance = new ClienteService();
        Cliente cliente = new Cliente();
        Cliente result = instance.salvar(cliente);
        assertNull(result);
        
        // Testando Save da Categoria
        System.out.println("Salvar Categoria");
        CategoriaService instanceCS = new CategoriaService();
        Categoria categoria = new Categoria();
        Categoria categoriaSalvar = instanceCS.salvar(categoria);
        assertNull(categoriaSalvar);
        
        // Testando Save do Pedido
        System.out.println("Salvar Pedido");
        PedidoService instancePS = new PedidoService();
        Pedido pedido = new Pedido();
        Pedido pedidoSalvar = instancePS.salvar(pedido);
        assertNull(pedidoSalvar);
        
        // Testando Save do Produto
        System.out.println("Salvar Produto");
        ProdutoService instancePrS = new ProdutoService();
        Produto produto = new Produto();
        Produto produtoSalvar = instancePrS.salvar(produto);
        assertNull(produtoSalvar);
        
        // Testando ItemPedido
        System.out.println("ItemPedido");
        ItemPedidoService instanceIPS = new ItemPedidoService();
        ItemPedido itemPedido = new itemPedido();
        ItemPedido itemPedidoSalvar = instanceIPS.salvar(itemPedido);
        assertNull(itemPedidoSalvar);
        
        
    }
    
}
