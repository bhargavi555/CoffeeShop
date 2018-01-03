package edu.purduecal.cs;

public class Decaf {
	private CondimentDecorator cd;

	public CondimentDecorator getcondimentdecorator() {
		return cd;
	}

	public void setcondimentdecorator(CondimentDecorator cd) {
		this.cd=cd;
	}

	public double cost()
	{
		return 1.5;
		
	}

	 public String getDescription(){
			return "Decaf";
			

}
}
