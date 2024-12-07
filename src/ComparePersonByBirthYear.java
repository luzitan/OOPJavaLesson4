import java.util.Comparator;

public class ComparePersonByBirthYear<P extends StudyPerson> implements Comparator<P> {

    @Override
    public int compare(P o1, P o2) {
        return o1.getBirthYear() - o2.getBirthYear();
    }
}
