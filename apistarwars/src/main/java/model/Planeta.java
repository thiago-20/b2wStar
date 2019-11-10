package model;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Planeta  {
	
	@Id
	private ObjectId _id;
	private String nome;
	private String clima;
	private String terreno;
	private String aparicoesFilmes;
	
	
	
	public Planeta() {
	
		
	}
	public ObjectId getId() {
		return _id;
	}
	public void setId(Long id, ObjectId _id) {
		this._id = _id;
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
