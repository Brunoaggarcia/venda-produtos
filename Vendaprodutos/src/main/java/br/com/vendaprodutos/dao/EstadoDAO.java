package br.com.vendaprodutos.dao;

import java.io.Serializable;
import java.util.List;

import javax.persistence.TypedQuery;

import br.com.vendaprodutos.domain.Estado;

public class EstadoDAO extends GenericDAO implements Serializable  {

	public EstadoDAO() {
        super(Estado.class);
    }

	public List<Estado> consultar(String texto) {
		TypedQuery q = getEm().createQuery("SELECT o FROM Cliente o WHERE o.nome " + "like ? ", Estado.class);
		q.setParameter(1, "%" + texto + "%");
		return q.getResultList();
	}

}
