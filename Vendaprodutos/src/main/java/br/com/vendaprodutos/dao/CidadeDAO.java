package br.com.vendaprodutos.dao;

import java.io.Serializable;
import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

import br.com.vendaprodutos.domain.Cidade;

public class CidadeDAO extends GenericDAO implements Serializable  {

	public CidadeDAO() {
        super(Cidade.class);
    }

	public List<Cidade> consultar(String texto) {
		TypedQuery q = getEm().createQuery("SELECT o FROM Cliente o WHERE o.nome " + "like ? ", Cidade.class);
		q.setParameter(1, "%" + texto + "%");
		return q.getResultList();
	}

}