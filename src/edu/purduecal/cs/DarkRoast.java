package edu.purduecal.cs;

public class DarkRoast {
	private CondimentDecorator cd;

	public CondimentDecorator getcondimentdecorator() {
		return cd;
	}

	public void setcondimentdecorator(CondimentDecorator cd ) {
		this.cd =cd;
	}

	public double cost()
	{
		return 2.5;
		
	}

	 public String getDescription(){
			return "DarkRoast";
			

}}
