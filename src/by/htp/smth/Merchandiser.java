package by.htp.smth;

import by.htp.pack.Pack;

public class Merchandiser {

	public void sortCoffee(Truck truck) {
		Pack pack;
		for (int i = 0; i < truck.packs.length; i++) {
			for (int j = 0; j < truck.packs.length - 1; j++) {
				if (calculateValue(truck, j) < calculateValue(truck, j + 1)) {
					pack = truck.packs[j];
					truck.packs[j] = truck.packs[j + 1];
					truck.packs[j + 1] = pack;
				}
			}
		}
	}

	private double calculateValue(Truck truck, int elementNumber) {
		double mass = (double) truck.packs[elementNumber].coffeeMassInPack();
		double packPrice = (double) truck.packs[elementNumber].packPrice();
		double massPriceCorrelation = 0;
		massPriceCorrelation = mass / packPrice;
		return massPriceCorrelation;
	}
	
	

}

// скачать sonarqube?