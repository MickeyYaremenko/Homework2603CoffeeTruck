package by.htp.pack;

import by.htp.smth.Coffee;

public class PackFactory {

	public PackFactory() {
	}

	public Pack createPack(String packSizeType, Coffee coffee) {
		switch (packSizeType.toLowerCase()) {
		case "small bag":
			return new SmallBag(coffee);
		case "medium bag":
			return new MediumBag(coffee);
		case "large bag":
			return new LargeBag(coffee);
		case "small tin":
			return new SmallTin(coffee);
		case "medium tin":
			return new MediumTin(coffee);
		case "large tin":
			return new LargeTin(coffee);
		default:
			System.out.println("Entered size or type is incorrect");
			return null;
		}

	}

}
