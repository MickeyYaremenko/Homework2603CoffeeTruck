package by.htp.pack;

import by.htp.smth.Coffee;

public abstract class Pack {
	private int volume;
	private int packMass;
	protected Coffee coffee;
	protected static final double VOLUME_TO_MASS_COEFF_BEANS = 0.5;
	protected static final double VOLUME_TO_MASS_COEFF_GRIND = 0.8;
	protected static final double VOLUME_TO_MASS_COEFF_INSTANT = 0.4;

	public Pack(int volume, int packMass, Coffee coffee) {
		this.volume = volume;
		this.packMass = packMass;
		this.coffee = coffee;
	}

	public int getVolume() {
		return volume;
	}

	public abstract int coffeeMassInPack();

	public abstract int packPrice();

	public abstract int summaryMass();

	@Override
	public String toString() {
		return "Pack [volume=" + volume + ", pack price =" + Pack.packPrice() + ", coffee=" + coffee;
	}

	
}
