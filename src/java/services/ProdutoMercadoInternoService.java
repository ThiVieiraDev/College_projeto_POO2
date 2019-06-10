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
import modelos.ProdutoMercadoInterno;


/**
 *
 * @author W10
 */
public class ProdutoMercadoInternoService extends BDService {
//    private EntityManagerFactory emf;
//
//    public ProdutoMercadoInternoService() {
//        emf = Persistence.createEntityManagerFactory("Projeto_POO2PU");
//    }
//    
//    public void salvar(ProdutoMercadoInterno prod){
//        EntityManager em = emf.createEntityManager();
//        em.getTransaction().begin();
//        em.merge(prod);
//        em.getTransaction().commit();
//        em.close();
//    }
//    
//    public List<ProdutoMercadoInterno> getProdutos(){
//        EntityManager em = emf.createEntityManager();
//        List<ProdutoMercadoInterno> produtos = em.createQuery("Select produto from ProdutoMercadoInterno produto")
//                .getResultList();
//        em.close();
//        
//        return produtos;
//    }
//    
//        public ProdutoMercadoInterno excluir(ProdutoMercadoInterno produto){
//        EntityManager em = emf.createEntityManager();
//        em.getTransaction().begin();
//        em.remove(em.find(ProdutoMercadoInterno.class, produto.getCodigo()));
//        em.close();
//        return produto;        
//    }
//    
//    public ProdutoMercadoInterno findItemByNumero(int numero){
//        EntityManager em = emf.createEntityManager();
//        ProdutoMercadoInterno prod = em.find(ProdutoMercadoInterno.class, numero);
//        return prod;
//    }
//    
//    
}
