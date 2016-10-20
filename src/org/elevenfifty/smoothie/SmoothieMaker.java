package org.elevenfifty.smoothie;

import java.util.ArrayList;
import java.util.Collection;

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

public class SmoothieMaker {

	public static void main(String[] args) {
		Collection<Ingredient> fruit = new ArrayList<>();
		fruit.add(new Apple());
		fruit.add(new Banana());
		fruit.add(new Lemon());
		fruit.add(new Orange());
		fruit.add(new Pear());
		fruit.add(new Strawberry());
		fruit.add(new Watermelon());
		fruit.add(new Blueberry());
		fruit.add(new Pineapple());
		fruit.add(new Grapefruit());
		fruit.add(new Cherry());
		fruit.add(new Raspberry());
		fruit.add(new Rum());
		fruit.add(new Nuts());
		fruit.add(new Ice());
		fruit.add(new Water());
		fruit.add(new Milk());
		fruit.add(new Yogurt());
		fruit.add(new Sugar());
		fruit.add(new Honey());
		fruit.add(new Vodka());
		fruit.add(new PeanutButter());
		fruit.add(new Chocolate());
		fruit.add(new ProteinPowder());
		Recipe strawberryBanana = new Recipe("Strawberry Banana Smoothie", fruit);

		Recipe smoothie = new Recipe("Odds & Ends Smoothie");
		smoothie.addIngredient(new Apple());
		smoothie.addIngredient(new Orange());
		smoothie.addIngredient(new Watermelon());
		smoothie.addIngredient(new Lemon());
		smoothie.addIngredient(new Pear());
			
		printRecipe(strawberryBanana);
		printRecipe(smoothie);
		
//		smoothie.print();
	}
	
	public static void printRecipe(Recipe recipe) {
		System.out.println("Smoothie: " + recipe.toString());
	}

}
