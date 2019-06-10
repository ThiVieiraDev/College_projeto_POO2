/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import generico.BDService;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import modelos.ItemPedido;

/**
 *
 * @author W10
 */
public class ItemPedidoService extends BDService {
//    private EntityManagerFactory emf;
//
//    public ItemPedidoService() {
//        emf = Persistence.createEntityManagerFactory("Projeto_POO2PU");
//    }
//    
//    public void salvar(ItemPedido item){
//        EntityManager em = emf.createEntityManager();
//        em.getTransaction().begin();
//        em.merge(item);
//        em.getTransaction().commit();
//        em.close();
//    }
//    
//    public List<ItemPedido> getItens(){
//        EntityManager em = emf.createEntityManager();
//        List<ItemPedido> itens = em.createQuery("Select item from ItemPedido item")
//                .getResultList();
//        em.close();
//        
//        return itens;
//    }
//    
//        public ItemPedido excluir(ItemPedido item){
//        EntityManager em = emf.createEntityManager();
//        em.getTransaction().begin();
//        em.remove(em.find(ItemPedido.class, item.getNumero()));
//        em.close();
//        return item;        
//    }
//    
//    public ItemPedido findItemByNumero(int numero){
//        EntityManager em = emf.createEntityManager();
//        ItemPedido item = em.find(ItemPedido.class, numero);
//        em.close();
//        return item;
//    }
}
