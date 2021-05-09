package interfaceAbstractDemo;

import interfaceAbstractDemo.abstracts.CustomerManager;
import interfaceAbstractDemo.adaptors.MernisServiceAdapter;
import interfaceAbstractDemo.concreate.NeroCustomerManager;
import interfaceAbstractDemo.concreate.StarbucksCustomerManager;
import interfaceAbstractDemo.entities.Customer;

public class Main {

	public static void main(String[] args) {
		
		CustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager.save(new Customer(1, "Saadet", "Bozkan", 1996, "39934448442"));
		System.out.println();
	}

}
