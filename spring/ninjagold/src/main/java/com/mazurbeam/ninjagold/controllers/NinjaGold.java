package com.mazurbeam.ninjagold.controllers;

import java.util.ArrayList;

public class NinjaGold {
	private int gold;
	private ArrayList<String> activities;
	
	public int getGold() {
		return gold;
	}
	public void setGold(int gold) {
		this.gold = gold;
	}
	public ArrayList<String> getActivities() {
		return activities;
	}
	public void setActivities(ArrayList<String> activities) {
		this.activities = activities;
	}
	
	public void addActivity(String activity) {
		this.activities.add(activity);
	}
	
	public NinjaGold() {
		this.setGold(0);
	}
}
