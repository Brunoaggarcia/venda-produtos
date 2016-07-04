package br.com.vendaprodutos.dao;

import java.io.Serializable;
import java.util.List;

import javax.persistence.TypedQuery;

import br.com.vendaprodutos.domain.Pessoa;

public class PessoaDAO extends GenericDAO implements Serializable  {

	public PessoaDAO() {
        super(Pessoa.class);
    }

	public List<Pessoa> consultar(String texto) {
		TypedQuery q = getEm().createQuery("SELECT o FROM Cliente o WHERE o.nome " + "like ? ", Pessoa.class);
		q.setParameter(1, "%" + texto + "%");
		return q.getResultList();
	}

}