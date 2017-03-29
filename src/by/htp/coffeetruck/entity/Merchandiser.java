package by.htp.coffeetruck.entity;

import by.htp.coffeetruck.pack.Pack;

public class Merchandiser {

	public void sortCoffeeByMoneyForGram(Truck truck) {
		Pack pack;
		for (int i = 0; i < truck.packs.length; i++) {
			for (int j = 0; j < truck.packs.length - 1; j++) {
				if (calculateValue(truck, j) > calculateValue(truck, j + 1)) {
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
		massPriceCorrelation = packPrice / mass;
		return massPriceCorrelation;
	}

	public void showPacksInRange(Truck truck, int bottomBoundary, int upperBoundary) {
		System.out.println("Coffee packs in desirable range:");
		for (int i = 0; i < truck.packs.length - 1; i++) {
			if (calculateValue(truck, i) > bottomBoundary && calculateValue(truck, i) < upperBoundary) {
				System.out.println(truck.packs[i]);
			}
		}
	}
	
	public void showAllCoffeeInTruck(Truck truck){
		for (int i = 0; i < truck.packs.length - 1; i++){
			System.out.println(truck.packs[i] + " Gram price: " + calculateValue(truck, i));
		}
	}
}

