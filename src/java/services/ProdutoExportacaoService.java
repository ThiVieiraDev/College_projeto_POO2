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
import modelos.ProdutoExportacao;

/**
 *
 * @author W10
 */
public class ProdutoExportacaoService extends BDService {
//    private EntityManagerFactory emf;
//
//    public ProdutoExportacaoService() {
//        emf = Persistence.createEntityManagerFactory("Projeto_POO2PU");
//    }
//    
//    public void salvar(ProdutoExportacao prod){
//        EntityManager em = emf.createEntityManager();
//        em.getTransaction().begin();
//        em.merge(prod);
//        em.getTransaction().commit();
//        em.close();
//    }
//    
//    public List<ProdutoExportacao> getProdutos(){
//        EntityManager em = emf.createEntityManager();
//        List<ProdutoExportacao> produtos = em.createQuery("Select produto from ProdutoExportacao produto")
//                .getResultList();
//        em.close();
//        
//        return produtos;
//    }
//    
//        public ProdutoExportacao excluir(ProdutoExportacao produto){
//        EntityManager em = emf.createEntityManager();
//        em.getTransaction().begin();
//        em.remove(em.find(ProdutoExportacao.class, produto.getCodigo()));
//        em.close();
//        return produto;        
//    }
//    
//    public ProdutoExportacao findItemByNumero(int numero){
//        EntityManager em = emf.createEntityManager();
//        ProdutoExportacao prod = em.find(ProdutoExportacao.class, numero);
//        return prod;
//    }
//    
    
}