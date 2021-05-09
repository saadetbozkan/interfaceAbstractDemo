package interfaceAbstractDemo.entities;

import interfaceAbstractDemo.abstracts.Entity;

public class Customer implements Entity {
	private int id;
	private String firstName;
	private String lastName;
	private int dataOfBirth;
	private String nationalityId;

	public Customer() {
		super();
	}

	public Customer(int id, String firstName, String lastName, int dataofBirth, String nationalityId) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dataOfBirth = dataofBirth;
		this.nationalityId = nationalityId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getDataOfBirth() {
		return dataOfBirth;
	}

	public void setDataOfBirth(int dataOfBirth) {
		this.dataOfBirth = dataOfBirth;
	}

	public String getNationalityId() {
		return nationalityId;
	}

	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}

}
