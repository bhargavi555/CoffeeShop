package edu.purduecal.cs;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double total = 0;
		String str="";
		
		System.out.println("WELCOME TO THE COFFEE WORLD \n");
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please Select your Coffee: \n" + "1.HouseBlend\n" + "2.DarkRoast\n" + "3.Decaf\n"
				+ "4.Espresso\n" + "5.Exit");
		int choice = keyboard.nextInt();
		while (choice != 5) {

			switch (choice) {
			case 1:
			{
				HouseBlend hb = new HouseBlend();
				System.out.println("Please Choose your Add-ons: \n" + "1.Milk\n" + "2.Mocha\n" + "3.Soy\n" + "4.Whip\n"
						+ "5.Exit");
				int ch = keyboard.nextInt();
				while (ch != 5) {
					if (ch == 1) {
						CondimentDecorator milk = new Milk();
						hb.setcondimentdecorator(milk);
						total = total + milk.cost();
						 str=str + milk.getDescription();

					}
					if (ch == 2) {
						CondimentDecorator mocha = new Mocha();
						hb.setcondimentdecorator(mocha);
						total = total + mocha.cost();
						  str=str + mocha.getDescription();
					
					}
					if (ch == 3) {
						CondimentDecorator soy = new Soy();
						hb.setcondimentdecorator(soy);
						total = total + soy.cost();
						str=str + soy.getDescription();
					}
					if (ch == 4) {
					 CondimentDecorator whip = new Whip();
						hb.setcondimentdecorator(whip);
						total = total + whip.cost();
						str=str + whip.getDescription();
					}

					if (ch == 5) {
						System.exit(0);
					}
					System.out.println("Please Choose your Add-ons: \n" + "1.Milk\n" + "2.Mocha\n" + "3.Soy\n"
							+ "4.Whip\n" + "5.Exit");
					ch = keyboard.nextInt();
				}
		
				System.out.println("coffee is:" + hb.getDescription()+ str);
				double fulltotal = total + hb.cost();
				System.out.println("your total is:" + fulltotal+"\n");
				str=" ";
				total=0;
				fulltotal=0;
				System.out.println("Please Select your Coffee: \n" + "1.HouseBlend\n" + "2.DarkRoast\n" + "3.Decaf\n"
						+ "4.Espresso\n" + "5.Exit");
				choice = keyboard.nextInt();
				break;
			}
			case 2:
			{
				DarkRoast dr = new DarkRoast();
				System.out.println("Please Choose your Add-ons: \n" + "1.Milk\n" + "2.Mocha\n" + "3.Soy\n" + "4.Whip\n"
						+ "5.Exit");
				int ch = keyboard.nextInt();
				while (ch != 5) {
					if (ch == 1) {
						CondimentDecorator milk = new Milk();
						dr.setcondimentdecorator(milk);
						total = total + milk.cost();
						str=str + milk.getDescription();

					}
					if (ch == 2) {
						CondimentDecorator mocha = new Mocha();
						dr.setcondimentdecorator(mocha);
						total = total + mocha.cost();
						str=str + mocha.getDescription();
						
					}
					if (ch == 3) {
						CondimentDecorator soy = new Soy();
						dr.setcondimentdecorator(soy);
						total = total + soy.cost();
						str=str + soy.getDescription();
					}
					if (ch == 4) {
					 CondimentDecorator whip = new Whip();
						dr.setcondimentdecorator(whip);
						total = total + whip.cost();
						str=str + whip.getDescription();
					}

					if (ch == 5) {
						System.exit(0);
					}
					System.out.println("Please Choose your Add-ons: \n" + "1.Milk\n" + "2.Mocha\n" + "3.Soy\n"
							+ "4.Whip\n" + "5.Exit");
					ch = keyboard.nextInt();
				}
			   
				System.out.println("coffee is:" +dr.getDescription()+ str);
				double fulltotal = total + dr.cost();
				System.out.println("your total is:" + fulltotal);
				str=" ";
				total=0;
				fulltotal=0;
				System.out.println("Please Select your Coffee: \n" + "1.HouseBlend\n" + "2.DarkRoast\n" + "3.Decaf\n"
						+ "4.Espresso\n" + "5.Exit");
				choice = keyboard.nextInt();
				break;
			}
			case 3:
			{
				Decaf dec = new Decaf();
				System.out.println("Please Choose your Add-ons: \n" + "1.Milk\n" + "2.Mocha\n" + "3.Soy\n" + "4.Whip\n"
						+ "5.Exit");
				int ch = keyboard.nextInt();
				while (ch != 5) {
					if (ch == 1) {
						CondimentDecorator milk = new Milk();
						dec.setcondimentdecorator(milk);
						total = total + milk.cost();
						str=str + milk.getDescription();

					}
					if (ch == 2) {
						CondimentDecorator mocha = new Mocha();
						dec.setcondimentdecorator(mocha);
						total = total + mocha.cost();
						str=str + mocha.getDescription();
						
					}
					if (ch == 3) {
						CondimentDecorator soy = new Soy();
						dec.setcondimentdecorator(soy);
						total = total + soy.cost();
						str=str + soy.getDescription();
					}
					if (ch == 4) {
					 CondimentDecorator whip = new Whip();
						dec.setcondimentdecorator(whip);
						total = total + whip.cost();
						str=str + whip.getDescription();
					}

					if (ch == 5) {
						System.exit(0);
					}
					System.out.println("Please Choose your Add-ons: \n" + "1.Milk\n" + "2.Mocha\n" + "3.Soy\n"
							+ "4.Whip\n" + "5.Exit");
					ch = keyboard.nextInt();
				}
	
				System.out.println("coffee is:" + dec.getDescription()+ str);
				double fulltotal = total + dec.cost();
				System.out.println("your total is:" + fulltotal);
				str=" ";
				total=0;
				fulltotal=0;
				System.out.println("Please Select your Coffee: \n" + "1.HouseBlend\n" + "2.DarkRoast\n" + "3.Decaf\n"
						+ "4.Espresso\n" + "5.Exit");
				choice = keyboard.nextInt();
				break;
			}
			case 4:
			{
				Espresso es = new Espresso();
				System.out.println("Please Choose your Add-ons: \n" + "1.Milk\n" + "2.Mocha\n" + "3.Soy\n" + "4.Whip\n"
						+ "5.Exit");
				int ch = keyboard.nextInt();
				while (ch != 5) {
					if (ch == 1) {
						CondimentDecorator milk = new Milk();
						es.setcondimentdecorator(milk);
						total = total + milk.cost();
						str=str + milk.getDescription();

					}
					if (ch == 2) {
						CondimentDecorator mocha = new Mocha();
						es.setcondimentdecorator(mocha);
						total = total + mocha.cost();
						str=str + mocha.getDescription();
					}
					if (ch == 3) {
						CondimentDecorator soy = new Soy();
						es.setcondimentdecorator(soy);
						total = total + soy.cost();
						str=str + soy.getDescription();
					}
					if (ch == 4) {
					 CondimentDecorator whip = new Whip();
						es.setcondimentdecorator(whip);
						total = total + whip.cost();
						str=str + whip.getDescription();
					}

					if (ch == 5) {
						System.exit(0);
					}
					System.out.println("Please Choose your Add-ons: \n" + "1.Milk\n" + "2.Mocha\n" + "3.Soy\n"
							+ "4.Whip\n" + "5.Exit");
					ch = keyboard.nextInt();
				}
				
				System.out.println("coffee is:" + es.getDescription()+ str);
				double fulltotal = total + es.cost();
				System.out.println("your total is:" + fulltotal);
				str=" ";
				total=0;
				fulltotal=0;
				System.out.println("Please Select your Coffee: \n" + "1.HouseBlend\n" + "2.DarkRoast\n" + "3.Decaf\n"
						+ "4.Espresso\n" + "5.Exit");
				choice = keyboard.nextInt();
				break;
			}
			case 5:
				System.exit(0);

			}

		}
		keyboard.close();
	}
}
