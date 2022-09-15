package org.eclipse.model;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.*;

@Component("etudiant")
public class Student {
	
	private int id;
	private String name;
	private List<String> villes;
	
	@Autowired
	@Qualifier("adress")
	private Adress adress;
	
	
	public Student() {
		super();
	}
	
	public Student(int id, String name, List<String> villes, Adress adress) {
		super();
		this.id = id;
		this.name = name;
		this.villes = villes;
		this.adress = adress;
	}







	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getVilles() {
		return villes;
	}

	public void setVilles(List<String> villes) {
		this.villes = villes;
	}

	public Adress getAdress() {
		return adress;
	}

	public void setAdress(Adress adress) {
		this.adress = adress;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", villes=" + villes + ", adress=" + adress + "]";
	}

//	@Override
//	public String toString() {
//		// TODO
////		this.adresses
////				.forEach((item) -> item.getVille()).reduce((a,b) -> a+b).get();
//		
////		this.villes.stream().forEach((item) -> {
////		    System.out.print(item);
////		});
//		
////		String vilesStr = this.villes.stream().collect(Collectors.joining(", ","{", "}"));
//		
////		List<Adress> adresses = new ArrayList<Adress>(Arrays.asList(this.adress,this.adress));
////		
////		String adressesVilleStr = adresses.stream()
////				.map(item -> item.getVille())
////				.collect(Collectors.joining(", ","{", "}"));
//
//		
//		String adressesStr = "";
////		for(String ville : this.villes){
//////			adressesStr += "[id : " + adr.getId()+", ville : "+ adr.getVille()+"],"; 
////			adressesStr += "[ville : " + ville+"],";  
////		}
//		return "Student [id=" + id + ", name=" + name +"]";
//	}
	
	
	
	

}
