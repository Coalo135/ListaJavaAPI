package com.clienteapi.model;
 
import jakarta.validation.constraints.NotEmpty;
import jakarta.persistence.*;
 
@Entity
public class Cliente {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@NotEmpty(message = "Informe um nome")
	private String nome;
	private String cnpj;
	private String endereco;
	private String telefone;
	private String email;
	private String formapgt;
	private String status;

	public Cliente(){
	}

	public Cliente(long id, @NotEmpty(message = "Informe um nome") String nome, String cnpj, String endereco,
			String telefone, String email, String formapgt, String status) {
		this.id = id;
		this.nome = nome;
		this.cnpj = cnpj;
		this.endereco = endereco;
		this.telefone = telefone;
		this.email = email;
		this.formapgt = formapgt;
		this.status = status;
	}

	public String getFormapgt() {
		return formapgt;
	}

	public void setFormapgt(String formapgt) {
		this.formapgt = formapgt;
	}


	 public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
}
