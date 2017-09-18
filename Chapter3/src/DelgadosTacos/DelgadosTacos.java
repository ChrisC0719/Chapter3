package DelgadosTacos;

import java.util.Scanner;

public class DelgadosTacos {

	public static void main(String[] args) 
	{
		double tacoPrice = 2.55;
		double softDrinkPrice = 1.50;
		double nachoPrice = 3.00;
		double enchiladasPrice = 4.50;
		double frenchFriesPrice = 1.99;
		double walkingTacoPrice = 3.99;
		double saladPrice = 1.50;
		double pretezelPrice = 3.05;
		double fruitSnacksPrice = 1.00;
		double chipsPrice = 1.59;
		
		double tacoAmountOrder = 10;
		double chipAmountOrder = 11;
		double saladAmountOrder = 3;
		double fruitSnacksAmountOrder = 6;
		double softDrinkAmountOrder = 15;
		double nachoAmountOrder = 4;
		double pretezelAmountOrder = 3;
		double walkingTacoAmountOrder = 11;
		double enchiladasAmountOrder = 22;
		double frenchFriesAmountOrder = 42;
		
		double tacoPriceTotal;
		double chipPriceTotal;
		double saladPriceTotal;
		double fruitSnacksPriceTotal;
		double softDrinkPriceTotal;
		double nachoPriceTotal;
		double pretezelPriceTotal;
		double walkingPriceTotal;
		double enchiladasPriceTotal;
		double frenchFriesPriceTotal;
		
		
		
		 
		menu();
	}
	public static void menu()
	{
		System.out.print("How many tacos do you want? >>>> ");
		tacoAmountOrder = input.nextDouble();
		tacoPriceTotal = tacoAmountOrder * tacoPrice;
		
	}
		

}
