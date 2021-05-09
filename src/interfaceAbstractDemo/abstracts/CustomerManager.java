package interfaceAbstractDemo.abstracts;

import interfaceAbstractDemo.entities.Customer;

public  abstract class CustomerManager implements CustomerService {

	@Override
	public void save(Customer customer) {

		System.out.println("Veritabanýna kaydedildi." + customer.getFirstName());
	}

}
