package br.com.vendaprodutos.domain;

import java.util.Date;

import javax.faces.convert.BigDecimalConverter;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@SuppressWarnings("serial")
@Entity
public class Venda extends GenericDomain {
	@Column(nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date horario;
	
	@Column(nullable = false, precision = 12, scale = 4)
	private BigDecimalConverter precoTotal;
	
	@ManyToOne
	@JoinColumn(nullable = false)
	private Cliente cliente;

	public Date getHorario() {
		return horario;
	}

	public void setHorario(Date horario) {
		this.horario = horario;
	}

	public BigDecimalConverter getPrecoTotal() {
		return precoTotal;
	}

	public void setPrecoTotal(BigDecimalConverter precoTotal) {
		this.precoTotal = precoTotal;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	

}
