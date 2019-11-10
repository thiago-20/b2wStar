package br.star.api.resource.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PlanetaResource {
	
	@JsonProperty("id")
	private String id;
	
	@JsonProperty("nome")
	private String nome;
	
	@JsonProperty("clima")
	private String clima;
	
	@JsonProperty("terreno")
	private String terreno;
	
	@JsonProperty("aparicoesFilmes")
	private String aparicoesFilmes;
	
	

	public PlanetaResource(String id, String nome) {
		
		this.id = id;
		this.nome = nome;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}
	

	
	public String getClima() {
		return clima;
	}


	public void setClima(String clima) {
		this.clima = clima;
	}


	public String getTerreno() {
		return terreno;
	}


	public void setTerreno(String terreno) {
		this.terreno = terreno;
	}


	public String getAparicoesFilmes() {
		return aparicoesFilmes;
	}


	public void setAparicoesFilmes(String aparicoesFilmes) {
		this.aparicoesFilmes = aparicoesFilmes;
	}

	
	
}
