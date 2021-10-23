package Exams.MineOct23.hotel;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
    public String name;
    public int capacity;
    public List<Person> roster;

    public Hotel(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.roster = new ArrayList<>();
    }

    public void add(Person person) {
        if (this.roster.size() < capacity) {
            roster.add(person);
        }
    }

    public boolean remove(String name) {
        return roster.removeIf(p -> p.getName().equals(name));
    }

    public Person getPerson(String name, String hometown) {
        for (Person p : roster) {
            if (p.getName().equals(name) && p.getHometown().equals(hometown)) {
                return p;
            }
        }
        return null;
    }

    public int getCount() {
        return roster.size();
    }

    public String getStatistics() {
        StringBuilder out = new StringBuilder();
        out.append(String.format("The people in the hotel %s are:%n", this.name));
        for (Person person : roster) {
            out.append(String.format("%s%n", person));
        }
        return out.toString().trim();
    }

}
