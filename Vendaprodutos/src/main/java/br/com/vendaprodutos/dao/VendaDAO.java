package br.com.vendaprodutos.dao;

import java.io.Serializable;
import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.Transaction;

import br.com.vendaprodutos.domain.Venda;

public class VendaDAO extends GenericDAO implements Serializable  {

	public VendaDAO() {
        super(Venda.class);
    }

	public List<Venda> consultar(String texto) {
		TypedQuery q = getEm().createQuery("SELECT o FROM Cliente o WHERE o.nome " + "like ? ", Venda.class);
		q.setParameter(1, "%" + texto + "%");
		return q.getResultList();
	}

}
