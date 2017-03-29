package by.htp.smth;

import by.htp.pack.PackFactory;
import by.htp.smth.Coffee;

public class Maintest {
	public static void main(String[] args) {

		Coffee lavazza = new Coffee(25, "Beans", "Arabica", "Lavazza");
		Coffee jacobs = new Coffee(15, "Instant", "Arabica", "Jacobs");
		Coffee amato = new Coffee(20, "Grind", "Arabica", "Amato");
		Coffee nescafe = new Coffee(15, "Grind", "Robusta", "Nescafe");
		Coffee jardin = new Coffee(12, "Beans", "Robusta", "Jardin");
		Coffee illy = new Coffee(18, "Instant", "Robusta", "Illy");

		PackFactory packFactory = new PackFactory();

		Truck truck = new Truck(15000);
		System.out.println("Current load: " + truck.getLoadWeight());

		truck.loadNewPack(packFactory.createPack("medium bag", lavazza));
		truck.loadNewPack(packFactory.createPack("large bag", jacobs));
		truck.loadNewPack(packFactory.createPack("small bag", amato));
		truck.loadNewPack(packFactory.createPack("medium tin", nescafe));
		truck.loadNewPack(packFactory.createPack("small tin", jardin));
		truck.loadNewPack(packFactory.createPack("large tin", illy));

		System.out.println("Current load: " + truck.getLoadWeight());
		
		System.out.println(truck.packs[1]);

	}

}
