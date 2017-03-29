package by.htp.coffeetruck.launcher;

import by.htp.coffeetruck.entity.Coffee;
import by.htp.coffeetruck.entity.Merchandiser;
import by.htp.coffeetruck.entity.Truck;
import by.htp.coffeetruck.pack.PackFactory;

public class Main {
	public static void main(String[] args) {
		PackFactory packFactory = new PackFactory();
		Truck truck = new Truck(1300);
		Merchandiser merchandiser = new Merchandiser();

		Coffee lavazza = new Coffee(25, "Beans", "Arabica", "Lavazza");
		Coffee jacobs = new Coffee(15, "Instant", "Arabica", "Jacobs");
		Coffee amato = new Coffee(20, "Grind", "Arabica", "Amato");
		Coffee nescafe = new Coffee(15, "Grind", "Robusta", "Nescafe");
		Coffee jardin = new Coffee(12, "Beans", "Robusta", "Jardin");
		Coffee illy = new Coffee(18, "Instant", "Robusta", "Illy");

		System.out.println("Current load: " + truck.getLoadWeight());

		truck.loadNewPack(packFactory.createPack("medium bag", lavazza));
		truck.loadNewPack(packFactory.createPack("large bag", jacobs));
		truck.loadNewPack(packFactory.createPack("small bag", amato));
		truck.loadNewPack(packFactory.createPack("medium tin", nescafe));
		truck.loadNewPack(packFactory.createPack("small tin", jardin));
		truck.loadNewPack(packFactory.createPack("large tin", illy));

		System.out.println("Current load: " + truck.getLoadWeight());

		merchandiser.showPacksInRange(truck, 15, 45);
		System.out.println("Primary truck:");
		merchandiser.showAllCoffeeInTruck(truck);
		System.out.println("Sorted truck:");
		merchandiser.sortCoffeeByMoneyForGram(truck);
		merchandiser.showAllCoffeeInTruck(truck);
	}

}
