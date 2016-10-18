package org.elevenfifty.smoothie;

import static org.apache.commons.lang3.StringUtils.equalsIgnoreCase;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

import org.apache.commons.lang3.StringUtils;
import org.elevenfifty.smoothie.fruit.Apple;
import org.elevenfifty.smoothie.fruit.Banana;
import org.elevenfifty.smoothie.fruit.Blueberry;
import org.elevenfifty.smoothie.fruit.Cherry;
import org.elevenfifty.smoothie.fruit.Grapefruit;
import org.elevenfifty.smoothie.fruit.Lemon;
import org.elevenfifty.smoothie.fruit.Orange;
import org.elevenfifty.smoothie.fruit.Pear;
import org.elevenfifty.smoothie.fruit.Pineapple;
import org.elevenfifty.smoothie.fruit.Raspberry;
import org.elevenfifty.smoothie.fruit.Strawberry;
import org.elevenfifty.smoothie.fruit.Watermelon;
import org.elevenfifty.smoothie.other.Chocolate;
import org.elevenfifty.smoothie.other.Honey;
import org.elevenfifty.smoothie.other.Ice;
import org.elevenfifty.smoothie.other.Milk;
import org.elevenfifty.smoothie.other.Nuts;
import org.elevenfifty.smoothie.other.PeanutButter;
import org.elevenfifty.smoothie.other.ProteinPowder;
import org.elevenfifty.smoothie.other.Rum;
import org.elevenfifty.smoothie.other.Sugar;
import org.elevenfifty.smoothie.other.Vodka;
import org.elevenfifty.smoothie.other.Water;
import org.elevenfifty.smoothie.other.Yogurt;

public class ReadRecipes {

	public static void main(String[] args) {
		ReadRecipes readRecipes = new ReadRecipes();

		final Collection<Recipe> recipes = readRecipes.loadRecipes("recipes.csv");

		System.out.println(recipes);
	}

	public Collection<Recipe> loadRecipes(String filename) {
		final File recipeFile = new File(filename);
		final Collection<Recipe> recipes = new ArrayList<>();

		final InputStream recipeStream;
		try {
			recipeStream = new FileInputStream(recipeFile);
		} catch (FileNotFoundException e) {
			System.out.println("Couldn't find the file: " + recipeFile.getAbsolutePath());
			return recipes;
		}

		try (Scanner input = new Scanner(recipeStream)) {
			while (input.hasNextLine()) {
				String[] items = input.nextLine().split(",");
				recipes.add(buildRecipe(items));
			}
		}
		return recipes;
	}

	public Recipe buildRecipe(String[] items) {
		Recipe recipe = new Recipe(items[0]);

		for (int i = 1; i < items.length; i++) {
			recipe.addIngredient(createIngredient(items[i]));
		}

		return recipe;
	}

	public Ingredient createIngredient(String ingredientName) {
		if (equalsIgnoreCase("Banana", ingredientName)) {
			return new Banana();
		} else if ("Strawberry".equalsIgnoreCase(ingredientName)) {
			return new Strawberry();
		} else if("Rum".equalsIgnoreCase(ingredientName)) {
			return new Rum();
		} else if("Apple".equalsIgnoreCase(ingredientName)) {
			return new Apple();
		} else if("Lemon".equalsIgnoreCase(ingredientName)) {
			return new Lemon();
		} else if("Orange".equalsIgnoreCase(ingredientName)) {
			return new Orange();
		} else if("Watermelon".equalsIgnoreCase(ingredientName)) {
			return new Watermelon();
		} else if("Pear".equalsIgnoreCase(ingredientName)) {
			return new Pear();
		} else if("Blueberry".equalsIgnoreCase(ingredientName)) {
			return new Blueberry();
		} else if("Pineapple".equalsIgnoreCase(ingredientName)) {
			return new Pineapple();
		} else if("Grapefruit".equalsIgnoreCase(ingredientName)) {
			return new Grapefruit();
		} else if("Cherry".equalsIgnoreCase(ingredientName)) {
			return new Cherry();
		} else if("Raspberry".equalsIgnoreCase(ingredientName)) {
			return new Raspberry();
		} else if("Nuts".equalsIgnoreCase(ingredientName)) {
			return new Nuts();
		} else if("Ice".equalsIgnoreCase(ingredientName)) {
			return new Ice();
		} else if("Water".equalsIgnoreCase(ingredientName)) {
			return new Water();
		} else if("Milk".equalsIgnoreCase(ingredientName)) {
			return new Milk();
		} else if("Yogurt".equalsIgnoreCase(ingredientName)) {
			return new Yogurt();
		} else if("Sugar".equalsIgnoreCase(ingredientName)) {
			return new Sugar();
		} else if("Honey".equalsIgnoreCase(ingredientName)) {
			return new Honey();
		} else if("Vodka".equalsIgnoreCase(ingredientName)) {
			return new Vodka();
		} else if("Peanut Butter".equalsIgnoreCase(ingredientName)) {
			return new PeanutButter();
		} else if("Chocolate".equalsIgnoreCase(ingredientName)) {
			return new Chocolate();
		} else if("Protein Powder".equalsIgnoreCase(ingredientName)) {
			return new ProteinPowder();
		} else;
//
//		switch (fruitName.toLowerCase()) {
//		case "banana": //NOTE: This is lower case!
//			return new Banana();
//		case "strawberry":
//			return new Strawberry();
//		}
//		// ADVANCED OPTION (Cannot 100% implement here)
//		new HashMap<String, Fruit>();
//		return fruitMap.get(fruitName.toLowerCase());

		return null;
		}
	}

