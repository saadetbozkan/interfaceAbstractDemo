package interfaceAbstractDemo.abstracts;

import interfaceAbstractDemo.entities.Customer;
public class CustomerCheckManager implements CustomerCheckService {
	public boolean CheckIfRealPerson(Customer customer) {
		
		return true;
	}

}
