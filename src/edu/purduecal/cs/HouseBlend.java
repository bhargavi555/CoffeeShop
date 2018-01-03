package edu.purduecal.cs;



	public class HouseBlend extends Beverage {
		private CondimentDecorator cd;

		public CondimentDecorator getcondimentdecorator() {
			return cd;
		}

		public void setcondimentdecorator(CondimentDecorator cd) {
			this.cd =cd;
		}

		public double cost()
		{
			return 2.0;
			
		}

		 public String getDescription(){
				return "HouseBlend";
				
			}
	}



