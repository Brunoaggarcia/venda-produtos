package br.com.vendaprodutos.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GerenciadorPersistencia {
    
     private static EntityManagerFactory emf;

    static {
        emf = Persistence.createEntityManagerFactory("sia");
    }

    public static EntityManager getEntityManager() {
        return emf.createEntityManager();
    }
    
}
