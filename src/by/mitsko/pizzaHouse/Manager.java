package by.mitsko.pizzaHouse;

public class Manager {
	
		public String name;
		

		public Manager(String name) {
			this.name = name;
		}
		public  void InfoAboutOrder (Pizza pizza) {
			System.out.println("Order is acepted: " + pizza.pizzaName + "," + pizza.pizzaSize + "sm");
		     System.out.println("Order is ready: "+ pizza.pizzaName + "," + pizza.pizzaSize + "sm");
		     System.out.println("Order is delivered: "+ pizza.pizzaName + "," + pizza.pizzaSize + "sm");
		     
		     System.out.println("Total price: " + pizzaHouse.price(pizza));
		}
}
