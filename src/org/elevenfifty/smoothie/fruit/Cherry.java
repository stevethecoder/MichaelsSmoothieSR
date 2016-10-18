package org.elevenfifty.smoothie.fruit;

public final class Cherry extends Fruit implements Coreable {

	boolean cored;

	public Cherry() {
		super("Cherry");
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
