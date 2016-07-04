package br.com.vendaprodutos.bean;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.event.ActionEvent;

import org.omnifaces.util.Messages;

import br.com.vendaprodutos.dao.CidadeDAO;
import br.com.vendaprodutos.dao.EstadoDAO;
import br.com.vendaprodutos.domain.Cidade;
import br.com.vendaprodutos.domain.Estado;

@ManagedBean
@ViewScoped
public class CidadeBean{
	
	private Cidade cidade;
	private CidadeDAO cidadedao;

	
	public void init(){
		
		cidade = new Cidade();
	}


	public Cidade getCidade() {
		return cidade;
	}


	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}
	
	public void salvar(){
		cidadedao = new CidadeDAO();
		cidadedao.salvar(cidade);
	}
	
}

