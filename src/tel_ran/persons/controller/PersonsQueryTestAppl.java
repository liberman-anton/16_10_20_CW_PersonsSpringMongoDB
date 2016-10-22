package tel_ran.persons.controller;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import tel_ran.persons.model.dao.PersonsMongoDB;
import tel_ran.persons.model.entities.Person;

public class PersonsQueryTestAppl {
	public static void main(String[] args) {
		AbstractApplicationContext ctx = new FileSystemXmlApplicationContext("beans.xml");
		PersonsMongoDB personsMongoDB = ctx.getBean(PersonsMongoDB.class);
		
//		displayPersons(personsMongoDB.getPersonByName("Vasya"));
		
//		displayPersons(personsMongoDB.getPersonsByCity("Rehovot"));
		
//		displayPersons(personsMongoDB.getPersonsByAge(2, 15));
		
		displayPersons(personsMongoDB.getEmploeesBySalaryLess(18000));
		
		ctx.close();
	}

	private static void displayPersons(Iterable<Person> persons) {
		for(Person person : persons)
			System.out.println(person);
	}
}
