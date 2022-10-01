package arrayListWithClass;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		ArrayList<Customer> customers = new ArrayList<>();

		Customer enes = new Customer(1, "Enes", "Aksüt");

		customers.add(enes);
		customers.add(new Customer(2, "Şule", "Alkan"));
		customers.add(new Customer(3, "Engin", "Demiroğ"));

		customers.remove(enes);

		for (Customer customer : customers) {
			System.out.println(customer.firstName + " " + customer.lastName);
		}
	}

}
