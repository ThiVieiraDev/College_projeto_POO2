/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generico;

/**
 *
 * @author glauc
 */
import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import modelos.Teste;

public abstract class BDService<T extends Teste, I extends Serializable> {

    private static EntityManagerFactory emf;
    private EntityManager em;

    public BDService() {

        emf = Persistence.createEntityManagerFactory("Projeto_POO2PU");

    }

    public T salvar(T entity) throws Exception {

        T saved = null;
        if(entity.validar())
        {
                getEntityManager().getTransaction().begin();
                saved = getEntityManager().merge(entity);
                getEntityManager().getTransaction().commit();
                return saved;
        }
        else{
            //alterar
            throw new Exception("Objeto inválido!");
        }
     
    }
    
    public void excluir(T entity) {
        getEntityManager().getTransaction().begin();
        getEntityManager().remove(entity);
        getEntityManager().getTransaction().commit();

    }

    public T getById(Class<T> classe, I pk) {

        try {
            return getEntityManager().find(classe, pk);
        } catch (NoResultException e) {
            return null;
        }

    }

    @SuppressWarnings("unchecked")
    public List<T> getAll(Class<T> classe) {

        return getEntityManager().
                createQuery(
                        "select o from "
                        + classe.getSimpleName() + " o")
                .getResultList();
    }

    public EntityManager getEntityManager() {

        if (em == null) {
            em = emf.createEntityManager();
        }

        return em;
    }

    public void closeEntityManager() {

        if (em != null) {
            em.close();
        }

        em = null;
    }

}
