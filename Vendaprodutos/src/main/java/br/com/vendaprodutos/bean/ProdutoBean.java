package br.com.vendaprodutos.bean;

import java.io.IOException;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.event.ActionEvent;
import javax.persistence.CascadeType;
import javax.persistence.OneToOne;

import org.omnifaces.util.Messages;
import org.primefaces.event.FileUploadEvent;
import org.primefaces.model.UploadedFile;

import br.com.vendaprodutos.dao.CidadeDAO;
import br.com.vendaprodutos.dao.ClienteDAO;
import br.com.vendaprodutos.dao.EstadoDAO;
import br.com.vendaprodutos.dao.ProdutoDAO;
import br.com.vendaprodutos.domain.Estado;
import br.com.vendaprodutos.domain.Produto;

@ManagedBean
@ViewScoped
public class ProdutoBean {
	private Produto produto;
	private ProdutoDAO produtodao;

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public ProdutoDAO getProdutodao() {
		return produtodao;
	}

	public void setProdutodao(ProdutoDAO produtodao) {
		this.produtodao = produtodao;
	}
	
	public void salvar(){
		produtodao = new ProdutoDAO();
		produtodao.salvar(produto);
	}
	
}