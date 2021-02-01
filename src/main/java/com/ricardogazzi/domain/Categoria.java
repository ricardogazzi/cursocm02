package com.ricardogazzi.domain;

import java.io.Serializable;

public class Categoria implements Serializable { //Serializable, import e número id abaixo.
	private static final long serialVersionUID = 1L;
	
	private Integer id; //Atribuições básicas
	private String nome;
	
	public Categoria() { //Construtor vazio. Instanciar objetos sem jogar nada para atributos
	}

	public Categoria(Integer id, String nome) { //Construtor com id e nome. 
		super();
		this.id = id;
		this.nome = nome;
	}

	public Integer getId() { //Getters and Setters
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public int hashCode() {  //hashCode
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {  //Equals
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Categoria other = (Categoria) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
	
}
