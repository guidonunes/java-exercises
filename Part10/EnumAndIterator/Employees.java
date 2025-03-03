package Part10.EnumAndIterator;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class Employees {
    private List<Person> employee;


    public Employees() {
        this.employee = new ArrayList<>();

    }

    public void add(Person personToAdd) {
        this.employee.add(personToAdd);
    }

    public void add(List<Person> peopleToAdd) {
        if (peopleToAdd != null) { // Check for null to avoid NullPointerException
            this.employee.addAll(peopleToAdd);
        }
    }

    public void print() {
        Iterator<Person> iterator = this.employee.iterator();

        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public void print(Education education) {
        Iterator<Person> iterator = this.employee.iterator();

        while(iterator.hasNext()) {
            Person person = iterator.next();

            if (person.getEducation() == education) {
                System.out.println(person);
            }
        }
    }

    public void fire(Education education) {
        Iterator<Person> iterator = this.employee.iterator();

        while(iterator.hasNext()) {
            Person person = iterator.next();

            if(person.getEducation() == education) {
                iterator.remove();
            }
        }
    }

}
