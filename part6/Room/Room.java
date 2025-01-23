package part6.Room;

import java.util.ArrayList;

public class Room {
    private ArrayList<Person> persons;

    public Room () {
        this.persons = new ArrayList<>();
    }

    public void add(Person person) {
        this.persons.add(person);
    }

    public boolean isEmpty() {
        if(this.persons.isEmpty()) {
            return true;
        }
        return false;
    }

    public ArrayList<Person> getPersons() {
        return this.persons;
    }

    public Person shortest() {
        if(this.persons.isEmpty()) {
            return null;
        }

        Person shortestPerson = this.persons.get(0);

        for(Person person : persons) {
            if(person.getHeight() < shortestPerson.getHeight()) {
                shortestPerson = person;
            }

        }
        return shortestPerson;
    }

    public Person take() {
        if(this.persons.isEmpty()) {
            return null;
        }

        Person shortestPerson = this.persons.get(0);
        int shortestIndex = 0;

        for (int i = 0; i < this.persons.size(); i++) {
            Person person = this.persons.get(i);
            if(person.getHeight() < shortestPerson.getHeight()) {
                shortestPerson = person;
                shortestIndex = i;
            }
        }
        return this.persons.remove(shortestIndex);
    }
}
