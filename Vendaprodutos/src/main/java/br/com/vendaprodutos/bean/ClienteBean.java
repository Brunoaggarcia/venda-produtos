package br.com.vendaprodutos.bean;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.persistence.CascadeType;
import javax.persistence.OneToOne;

import org.omnifaces.util.Messages;

import br.com.vendaprodutos.dao.CidadeDAO;
import br.com.vendaprodutos.dao.ClienteDAO;
import br.com.vendaprodutos.dao.PessoaDAO;
import br.com.vendaprodutos.domain.Cidade;
import br.com.vendaprodutos.domain.Cliente;
import br.com.vendaprodutos.domain.Pessoa;

@ManagedBean
@ViewScoped
public class ClienteBean{
	
	private Cliente cliente;
	private ClienteDAO clientedao;
	private Pessoa pessoa;
	
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public ClienteDAO getClientedao() {
		return clientedao;
	}
	public void setClientedao(ClienteDAO clientedao) {
		this.clientedao = clientedao;
	}
	public Pessoa getPessoa() {
		return pessoa;
	}
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	
	@OneToOne(cascade=CascadeType.ALL)
	public void salvar(){
		clientedao = new ClienteDAO();
		cliente.setPessoa(pessoa);
		clientedao.salvar(cliente);
		
	}
}