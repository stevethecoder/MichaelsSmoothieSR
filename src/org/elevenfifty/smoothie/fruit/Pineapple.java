package org.elevenfifty.smoothie.fruit;

public final class Pineapple extends Fruit implements Coreable {

	boolean cored;

	public Pineapple() {
		super("Pineapple");
	}

	@Override
	public void core() {
		if (!cored) {
			cored = true;
			System.out.println("Cored an " + getName());
		}
	}

	@Override
	public boolean isCored() {
		return cored;
	}

}
