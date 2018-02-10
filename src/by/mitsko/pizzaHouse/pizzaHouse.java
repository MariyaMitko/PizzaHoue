package by.mitsko.pizzaHouse;

import java.util.Scanner;

public class pizzaHouse {
	public Pizza orderPizza() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Coose name: Margarita, Italiana, 4 seasons, Meaty");
		String c = sc.next();
		System.out.println("Coose size: 25, 30, 35");
		int x = sc.nextInt();
		return cookPizza(c, x);
	}

	public Pizza cookPizza(String name, int size) {
		Pizza pizza = new Pizza();
		pizza.pizzaSize = size;
		pizza.pizzaName = name;
		return pizza;
	}

	public static int price(Pizza pizza) {
		int price = 0;
		if (pizza.pizzaName != null) {
			switch (pizza.pizzaName) {
			case "Margarita":
				price = 20;
				switch (pizza.pizzaSize) {
				case 25:
					price = price + 3;
					break;
				case 30:
					price = price + 5;
					break;
				case 35:
					price = price + 10;
					break;
				}
				break;
			case "Italiana":
				price = 25;
				switch (pizza.pizzaSize) {
				case 25:
					price = price + 3;
					break;
				case 30:
					price = price + 5;
					break;
				case 35:
					price = price + 10;
					break;
				}
				break;
			case "4 seasons":
				price = 30;
				switch (pizza.pizzaSize) {
				case 25:
					price = price + 3;
					break;
				case 30:
					price = price + 5;
					break;
				case 35:
					price = price + 10;
					break;
				}
				break;
			case "Meaty":
				price = 35;
				switch (pizza.pizzaSize) {
				case 25:
					price = price + 3;
					break;
				case 30:
					price = price + 5;
					break;
				case 35:
					price = price + 10;
					break;
				}
				break;
			}

		}
		return price;

	}
}
