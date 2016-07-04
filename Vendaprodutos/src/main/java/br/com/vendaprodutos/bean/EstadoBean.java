package br.com.vendaprodutos.bean;

import java.awt.event.ActionEvent;
import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.omnifaces.util.Messages;

import br.com.vendaprodutos.dao.CidadeDAO;
import br.com.vendaprodutos.dao.EstadoDAO;
import br.com.vendaprodutos.domain.Estado;



@ManagedBean
@ViewScoped
public class EstadoBean{
	private Estado estado;
	private EstadoDAO estadodao;
	
	public Estado getEstado() {
		return estado;
	}
	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	public EstadoDAO getEstadodao() {
		return estadodao;
	}
	public void setEstadodao(EstadoDAO estadodao) {
		this.estadodao = estadodao;
	}

	public void salvar(){
		estadodao = new EstadoDAO();
		estadodao.salvar(estado);
	}
}