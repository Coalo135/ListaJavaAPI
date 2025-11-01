package com.api.model;

public class Model {
	private long id;
	private String nome;
	private String cnpj;
	private String endereco;
	private String telefone;
	private String email;
	private String formapgmto;
	private String status;
	
	public Model(long id, String nome, String cnpj, String endereco, String telefone, String email, String formapgmto, String status) {
		this.id = id;
	    this.nome = nome;
	    this.cnpj = cnpj;
	    this.endereco = endereco;
	    this.telefone = telefone;
	    this.email = email;
	    this.formapgmto = formapgmto;
	    this.status = status;
	}
	
	public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFormapgmto() {
        return formapgmto;
    }

    public void setFormapgmto(String formapgmto) {
        this.formapgmto = formapgmto;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
