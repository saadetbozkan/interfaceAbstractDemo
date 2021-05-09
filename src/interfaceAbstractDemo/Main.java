package interfaceAbstractDemo;

import interfaceAbstractDemo.abstracts.CustomerManager;
import interfaceAbstractDemo.adaptors.MernisServiceAdapter;
import interfaceAbstractDemo.concreate.NeroCustomerManager;
import interfaceAbstractDemo.concreate.StarbucksCustomerManager;
import interfaceAbstractDemo.entities.Customer;

public class Main {

	public static void main(String[] args) {
		
		CustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager.save(new Customer(1, "Saadet", "B", 1990, "111111111111"));
		System.out.println();
	}

}
