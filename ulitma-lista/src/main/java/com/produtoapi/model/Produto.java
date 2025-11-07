package com.produtoapi.model;
 
import jakarta.validation.constraints.NotEmpty;
import jakarta.persistence.*;
 
@Entity
public class Produto {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@NotEmpty(message = "Informe um nome")
	private String nome;
	private int qtd;
	private double preco;
	private String status;
	
	public Produto(String nome, int qtd, double preco, String status) {
		this.setNome(nome);
		this.setQtd(qtd);
		this.setPreco(preco);
		this.setStatus(status);
	}
	
	public Produto() {
		
	}
 
	public long getId() {
		return id;
	}
 
	public void setId(long id) {
		this.id = id;
	}
 
	public String getStatus() {
		return status;
	}
 
	public void setStatus(String status) {
		this.status = status;
	}
 
	public String getNome() {
		return nome;
	}
 
	public void setNome(String nome) {
		this.nome = nome;
	}
 
	public double getPreco() {
		return preco;
	}
 
	public void setPreco(double preco) {
		this.preco = preco;
	}
 
	public int getQtd() {
		return qtd;
	}
 
	public void setQtd(int qtd) {
		this.qtd = qtd;
	}
	
	
	
}