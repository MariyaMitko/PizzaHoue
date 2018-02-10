package by.mitsko.pizzaHouse;

import java.util.Scanner;

public class mainApp {
	public static void main(String[] args) {
	String name;
	int size;
	int price;
     pizzaHouse ord = new pizzaHouse();
     Pizza pizza = ord.orderPizza();
     Manager mn = new Manager ("Ivan Petrov");
     
     
     mn.InfoAboutOrder(pizza);
     
      
}
}