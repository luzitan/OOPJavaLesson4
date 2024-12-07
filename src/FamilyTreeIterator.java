import java.util.Iterator;
import java.util.List;

public class FamilyTreeIterator<E extends StudyPerson> implements Iterator<E> {
    private int index;
    private List<E> people;

    public FamilyTreeIterator(List<E> list) {
        this.people = list;
    }

    @Override
    public boolean hasNext() {
        return index < people.size();
    }

    @Override
    public E next() {
        return people.get(index++);
    }
}
