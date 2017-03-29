package by.htp.smth;

import by.htp.pack.Pack;

public class Truck {
	private final int capacity;
	private int loadWeight;
	protected Pack[] packs = new Pack[0];

	public Truck(int capacity) {
		this.capacity = capacity;
	}

	private boolean ensureCapacity(Pack pack) {
		if ((loadWeight + pack.summaryMass()) < capacity) {
			return true;
		} else {
			return false;
		}
	}

	public void loadNewPack(Pack pack) {
		if (ensureCapacity(pack)) {
			Pack[] tempPacks = new Pack[packs.length + 1];
			for (int i = 0; i < packs.length; i++) {
				tempPacks[i] = packs[i];
			}
			tempPacks[tempPacks.length - 1] = pack;
			packs = tempPacks;
			this.loadWeight += pack.summaryMass();
		} else {
			System.out.println("Our truck is full! Sorry.");
		}
	}

	public int getCapacity() {
		return capacity;
	}

	public int getLoadWeight() {
		return loadWeight;
	}

}
