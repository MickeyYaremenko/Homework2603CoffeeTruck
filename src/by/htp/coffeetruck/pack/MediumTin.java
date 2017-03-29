package by.htp.coffeetruck.pack;

import by.htp.coffeetruck.entity.Coffee;
import by.htp.coffeetruck.lockingmechanism.Lid;

public class MediumTin extends Pack{

	private static final int MEDIUM_VOLUME = 250;
	private static final int PACK_MASS = 75;
	private Lid lid;
	
	public MediumTin(Coffee coffee) {
		super(MEDIUM_VOLUME, PACK_MASS, coffee);
	}

	@Override
	public int coffeeMassInPack() {
		int coffeeMass = 0;
		if (super.coffee.getState().equalsIgnoreCase("beans")) {
			coffeeMass = (int) (VOLUME_TO_MASS_COEFF_BEANS * MEDIUM_VOLUME);
		} else if (super.coffee.getState().equalsIgnoreCase("grind")) {
			coffeeMass = (int) (VOLUME_TO_MASS_COEFF_GRIND * MEDIUM_VOLUME);
		} else if (super.coffee.getState().equalsIgnoreCase("instant")) {
			coffeeMass = (int) (VOLUME_TO_MASS_COEFF_INSTANT * MEDIUM_VOLUME);
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
