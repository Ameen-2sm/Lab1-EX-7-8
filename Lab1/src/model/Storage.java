package model;

import java.util.ArrayList;
import java.util.List;

public class Storage {
	private List<Weight> storedWeights = new ArrayList<>();

	public List<Weight> getStoredWeights() {
		return storedWeights;
	}

	public void setStoredWeights(List<Weight> storedWeights) {
		this.storedWeights = storedWeights;
	}
	
	public void addToStoredList(Weight weight) {
		getStoredWeights().add(weight);
	}
}
