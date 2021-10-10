package com.example.demo;

public class Items {
	private int itemID;
	private String itemName;
	private double ratePerUnit;
	private String category;

public Items() {
	super();
}

public int getItemID() {
	return itemID;
}

public void setItemID(int itemID) {
	this.itemID = itemID;
}

public String getItemName() {
	return itemName;
}

public void setItemName(String itemName) {
	this.itemName = itemName;
}

public double getRatePerUnit() {
	return ratePerUnit;
}

public void setRatePerUnit(double ratePerUnit) {
	this.ratePerUnit = ratePerUnit;
}

public String getCategory() {
	return category;
}

public void setCategory(String category) {
	this.category = category;
}

public Items(int itemID, String itemName, double ratePerUnit, String category) {
	super();
	this.itemID = itemID;
	this.itemName = itemName;
	this.ratePerUnit = ratePerUnit;
	this.category = category;
}
}
