package eg.com.ibm.jaxrs.service;

import eg.com.ibm.jaxrs.model.Person;
import eg.com.ibm.jaxrs.model.Response;

public interface PersonService {

	public Response addPerson(Person p);
	
	public Response deletePerson(int id);
	
	public Person getPerson(int id);
	
	public Person[] getAllPersons();

}