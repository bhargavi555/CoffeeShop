package edu.purduecal.cs;

public abstract class CondimentDecorator {
	//private String description;
	private boolean houseblend,darkroast,decaf,espresso= false;
	public abstract String getDescription();
	
	public abstract double cost();

}
