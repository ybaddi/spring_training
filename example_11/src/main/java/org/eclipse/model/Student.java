package org.eclipse.model;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class Student {
	
//	private int id;
//	private String name;
//	private List<String> villes;
	
	@Autowired
	private Adress adress;
	
	
	public Student() {
//		super();
		System.out.println("Singleton Student default");
	}
	
//	public Student(int id, String name, Adress adress) {
//		super();
//		System.out.println("Student");
//		this.id = id;
//		this.name = name;
////		this.villes = villes;
//		this.adress = adress;
//	}
//	
	
	
	

//	public int getId() {
//		return id;
//	}
//
//	public void setId(int id) {
//		this.id = id;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public List<String> getVilles() {
//		return villes;
//	}
//
//	public void setVilles(List<String> villes) {
//		this.villes = villes;
//	}
//
//	
//
//	@Override
//	public String toString() {
//		return "Student [id=" + id + ", name=" + name + ", villes=" + villes + ", adress=" + adress + "]";
//	}
//
	
	@Lookup
	public Adress getAdress() {
		return adress;
	}
//
//	public void setAdress(Adress adress) {
//		this.adress = adress;
//	}

	

}
