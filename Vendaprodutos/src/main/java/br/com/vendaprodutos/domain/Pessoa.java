package br.com.vendaprodutos.domain;

import javax.persistence.Column;
import javax.persistence.Entity;

@SuppressWarnings("serial")
@Entity
public class Pessoa extends GenericDomain {

	@Column(length = 80, nullable = false)
	private String nome;

	@Column(length = 11, nullable = false)
	private String CPF;

	@Column(length = 8, nullable = false)
	private String RG;

	@Column(length = 50, nullable = false)
	private String rua;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

	public String getRG() {
		return RG;
	}

	public void setRG(String rG) {
		RG = rG;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public Short getNumero() {
		return numero;
	}

	public void setNumero(Short numero) {
		this.numero = numero;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Cidade getCidade() {
		return cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}

	@Column(nullable = false)
	private Short numero;

	@Column(length = 30, nullable = false)
	private String bairro;

	@Column(length = 8, nullable = false)
	private String cep;

	@Column(length = 15, nullable = false)
	private String telefone;

	@Column(length = 15, nullable = false)
	private String celular;

	@Column(length = 30, nullable = false)
	private String email;

	@Column(length = 30, nullable = false)
	private Cidade cidade;

}
