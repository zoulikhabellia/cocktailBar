package fr.formation.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.formation.entity.Ingredient;

@Repository
public interface IngredientDao extends JpaRepository<Ingredient, Integer> {

	// public List<Ingredient> readAll() {
	// return Arrays.asList(
	// new Ingredient("Rhum", 0),
	// new Ingredient("Tequila", 0),
	// new Ingredient("Whiskey", 0),
	// new Ingredient("Ice cubes", 1),
	// new Ingredient("Sugar",1),
	// new Ingredient("CO2",2));
	//
	// }

}
