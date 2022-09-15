package org.eclipse.model;

public class Adress {

	
	private int id;
	private String ville;
	
	
	
	
	public Adress(int id, String ville) {
		super();
		this.id = id;
		this.ville = ville;
	}




	public int getId() {
		return id;
	}




	public void setId(int id) {
		this.id = id;
	}




	public String getVille() {
		return ville;
	}




	public void setVille(String ville) {
		this.ville = ville;
	}




	@Override
	public String toString() {
		return "Adress [id=" + id + ", ville=" + ville + "]";
	}
	
	
	
	
	
}
