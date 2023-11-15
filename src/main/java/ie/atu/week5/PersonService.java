package ie.atu.week5;

import org.springframework.stereotype.Service;

@Service
public class PersonService {
    //Placeholder method to save person until db lab
    public void savePerson(Person person) {
        System.out.println("Person saved: " + person);
    }

    //Placeholder method to retrieve a person by employeeId
    public Person getPersonByEmployeeId(String employeeId) {
        //fetch data from db in future lab
        //Dummy person returned until db lab
        return new Person();
    }
}
