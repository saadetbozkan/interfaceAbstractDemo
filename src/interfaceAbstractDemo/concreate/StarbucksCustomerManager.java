package interfaceAbstractDemo.concreate;

import interfaceAbstractDemo.abstracts.CustomerCheckService;
import interfaceAbstractDemo.abstracts.CustomerManager;
import interfaceAbstractDemo.entities.Customer;

public class StarbucksCustomerManager extends CustomerManager   {
	
	private CustomerCheckService customerCheckService;
	
	
	
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}

	@Override
	public void save(Customer customer){
		
		if(this.customerCheckService.CheckIfRealPerson(customer)) {
			super.save(customer);
		}else {
			//throw new Exception("Not a valid person.");
		}

	}

}
