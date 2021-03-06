package com.sunil.datafetcher.model;

public class Coin {
	private final String name;
	private final double value;

	public Coin(String name, double value) {
		this.name = name;
		this.value = value;
	}

	public String getName() {
		return name;
	}

	public double getValue() {
		return value;
	}

	@Override
	public String toString() {
		return name + " : " + value;
	}

}
