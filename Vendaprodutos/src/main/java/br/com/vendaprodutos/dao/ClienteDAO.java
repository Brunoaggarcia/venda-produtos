package br.com.vendaprodutos.dao;

import java.io.Serializable;
import java.util.List;

import javax.persistence.TypedQuery;

import br.com.vendaprodutos.domain.Cliente;

public class ClienteDAO extends GenericDAO implements Serializable  {

	public ClienteDAO() {
        super(Cliente.class);
    }

	public List<Cliente> consultar(String texto) {
		TypedQuery q = getEm().createQuery("SELECT o FROM Cliente o WHERE o.nome " + "like ? ", Cliente.class);
		q.setParameter(1, "%" + texto + "%");
		return q.getResultList();
	}

}
