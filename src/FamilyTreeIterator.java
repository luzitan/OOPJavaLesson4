import java.util.Iterator;
import java.util.List;

public class FamilyTreeIterator implements Iterator<Person> {
    private int index;
    private List<Person> people;

    public FamilyTreeIterator(List<Person> list) {
        this.people = list;
    }

    @Override
    public boolean hasNext() {
        return index < people.size();
    }

    @Override
    public Person next() {
        return people.get(index++);
    }
}
