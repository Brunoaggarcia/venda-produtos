package br.com.vendaprodutos.dao;

import java.io.Serializable;
import java.util.List;

import javax.persistence.TypedQuery;

import br.com.vendaprodutos.domain.Produto;

public class ProdutoDAO extends GenericDAO implements Serializable  {

	public ProdutoDAO() {
        super(Produto.class);
    }

	public List<Produto> consultar(String texto) {
		TypedQuery q = getEm().createQuery("SELECT o FROM Cliente o WHERE o.nome " + "like ? ", Produto.class);
		q.setParameter(1, "%" + texto + "%");
		return q.getResultList();
	}

}
