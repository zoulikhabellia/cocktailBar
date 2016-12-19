package fr.formation.entity;

import java.io.Serializable;

public class Ingredient implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer  id;
	private int etat;

	private String name;

	
	public Ingredient() {
	}

	public Ingredient(String name, int etat) {
		this.etat = etat;
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public int getEtat() {
		return etat;
	}

	public void setEtat(int etat) {
		this.etat = etat;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
