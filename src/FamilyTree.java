import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

class FamilyTree<T extends StudyPerson> implements Serializable, Iterable<T> {
    private static final long serialVersionUID = 1L;
    private List<T> people;
    public FamilyTree() {
        this.people = new ArrayList<>();
    }
    public void addPerson(T person) {
        this.people.add(person);
    }
    public List<T> getChildren(T parent) {
        return parent.getChildren();
    }
    public T findPersonByName(String name) {
        for (T person : people) {
            if (person.getName().equals(name)) {
                return person;
            }
        }
        return null;
    }

    public List<T> getPeople() {
        return people;
    }

    @Override
    public Iterator<T> iterator() {
        return new FamilyTreeIterator(people);
    }

    public void sortByName(){
        people.sort(new ComparePersonByName());
    }
    public void sortByBirthYear(){
        people.sort(new ComparePersonByBirthYear());
    }
}
