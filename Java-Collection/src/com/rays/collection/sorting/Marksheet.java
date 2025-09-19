package com.rays.collection.sorting;

public class Marksheet implements Comparable<Marksheet> {

	public String rollNo;
	public String name;
	public int phy;

	public Marksheet(String rollNo, String name, int phy) {
		this.rollNo = rollNo;
		this.name = name;
		this.phy = phy;

	}

	@Override
	public int compareTo(Marksheet o) {

		return o.phy - this.phy;
	}

	@Override
	public String toString() {

		return "rollNo: " + rollNo + " name: " + name + " phy: " + phy;
	}

}
