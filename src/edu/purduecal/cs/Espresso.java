package edu.purduecal.cs;

public class Espresso {
	private CondimentDecorator cd;

	public CondimentDecorator getcondimentdecorator() {
		return cd;
	}

	public void setcondimentdecorator(CondimentDecorator cd) {
		this.cd=cd;
	}

	public double cost()
	{
		return 3.0;
		
	}

	 public String getDescription(){
			return "Espresso";
	 }

}
