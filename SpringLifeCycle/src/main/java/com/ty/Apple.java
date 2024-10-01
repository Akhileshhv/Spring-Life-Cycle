package com.ty;

public class Apple {
	private int cost;
private String color;
	  
	public int getCost() {
	return cost;
}

public void setCost(int cost) {
	this.cost = cost;
}

public String getColor() {
	return color;
}

public void setColor(String color) {
	this.color = color;
}

	
	@Override
public String toString() {
	return "Apple [cost=" + cost + ", color=" + color + "]";
}
	
public void init() {
	
	System.out.println("Inside the init() method");
	
}
public void destroy() {
	System.out.println("Inside the destroy method");
}
}
