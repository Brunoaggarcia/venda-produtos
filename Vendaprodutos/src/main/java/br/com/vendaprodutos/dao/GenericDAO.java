package br.com.vendaprodutos.dao;

import java.lang.reflect.ParameterizedType;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

import br.com.vendaprodutos.util.GerenciadorPersistencia;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;

public abstract class GenericDAO<T extends Serializable> {

    private final EntityManager em = GerenciadorPersistencia.getEntityManager();

    private final Class<T> clazz;

    public GenericDAO(Class<T> clazz) {
        this.clazz = clazz;
    }

    public EntityManager getEm() {
        return em;
    }
    
    public T getById(Long id) {
        return em.find(clazz, id);
    }

    public List<T> findAll() {
        TypedQuery<T> q = em.createQuery(" FROM " + clazz.getSimpleName(), clazz);
        return q.getResultList();
    }

    public void salvar(T clazz) {
        getTransaction().begin();
        em.persist(clazz);
        getTransaction().commit();
    }

    public T update(T clazz) {
        getTransaction().begin();
        T obj = em.merge(clazz);
        getTransaction().commit();
        return obj;
    }

    public void excluir(T clazz) {
        getTransaction().begin();
        em.remove(clazz);
        getTransaction().commit();
    }

    public void excluir(Long id) {
        excluir(getById(id));
    }

    private EntityTransaction getTransaction() {
        return em.getTransaction();
    }

}
