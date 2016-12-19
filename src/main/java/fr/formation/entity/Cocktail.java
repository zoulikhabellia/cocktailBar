package fr.formation.entity;

import java.io.Serializable;

public class Cocktail implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer  id;
	private String name;
	private double price;	
	private Integer withalcohol;

	
	public Cocktail() {
	}

	public Cocktail(String name, double price, Integer withalcohol) {
		this.name = name;
		this.price = price;
		this.withalcohol = withalcohol;
	}

	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Integer getWithalcohol() {
		return withalcohol;
	}

	public void setWithalcohol(Integer withalcohol) {
		this.withalcohol = withalcohol;
	}


	
}
