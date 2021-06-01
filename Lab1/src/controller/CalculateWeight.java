package controller;

import model.Storage;
import model.Weight;

public class CalculateWeight {
	public Weight calculateHumanWeightInMars(Weight weight) {
		double w = 0.38 * weight.getWeightInEarth();
		weight.setWeightInMars(w);
		Storage storage = new Storage();
		storage.addToStoredList(weight);
		return weight;
	}
}
