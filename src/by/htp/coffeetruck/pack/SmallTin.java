package by.htp.coffeetruck.pack;

import by.htp.coffeetruck.entity.Coffee;
import by.htp.coffeetruck.lockingmechanism.Lid;

public class SmallTin extends Pack{

	private static final int SMALL_VOLUME = 125;
	private static final int PACK_MASS = 50;
	private Lid lid;
	
	public SmallTin(Coffee coffee) {
		super(SMALL_VOLUME, PACK_MASS, coffee);
	}

	@Override
	public int coffeeMassInPack() {
		int coffeeMass = 0;
		if (super.coffee.getState().equalsIgnoreCase("beans")) {
			coffeeMass = (int) (VOLUME_TO_MASS_COEFF_BEANS * SMALL_VOLUME);
		} else if (super.coffee.getState().equalsIgnoreCase("grind")) {
			coffeeMass = (int) (VOLUME_TO_MASS_COEFF_GRIND * SMALL_VOLUME);
		} else if (super.coffee.getState().equalsIgnoreCase("instant")) {
			coffeeMass = (int) (VOLUME_TO_MASS_COEFF_INSTANT * SMALL_VOLUME);
		}
		return coffeeMass;
	}

	@Override
	public int packPrice() {
		int packPrice = coffeeMassInPack() * super.coffee.getGramPrice();
		return packPrice;
	}
	
	@Override
	public int summaryMass() {
		int summaryMass = PACK_MASS + coffeeMassInPack();
		return summaryMass;
	}

}
