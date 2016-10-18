package org.elevenfifty.smoothie.fruit;

public final class Pear extends Fruit implements Coreable {

	boolean cored;

	public Pear() {
		super("Pear");
	}

	@Override
	public void core() {
		if (!cored) {
			cored = true;
			System.out.println("Cored a " + getName());
		}
	}

	@Override
	public boolean isCored() {
		return cored;
	}

}
