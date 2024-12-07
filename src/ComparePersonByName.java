import java.util.Comparator;

public class ComparePersonByName<R extends StudyPerson> implements Comparator<R> {

    @Override
    public int compare(R o1, R o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
