import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {

    private int parts(Person person) {
        String parts = person.getSurname();
        return parts.split(" ").length;

    }

    @Override
    public int compare(Person o1, Person o2) {
        if (parts(o1) != parts(o2)) {
            return Integer.compare(parts(o2), parts(o1));
        } else {
            return Integer.compare(o2.getAge(), o1.getAge());
        }
    }
}


