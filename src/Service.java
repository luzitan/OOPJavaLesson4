//public class Service<T extends StudyPerson> {
//    FamilyTree familyTree;
//
//    public Service() {
//        familyTree = new FamilyTree();
//    }
//
//    public void addPerson(String name, int birthYear) {
//        T person = new T(name, birthYear);
//        familyTree.addPerson(person);
//    }
//
//    public String familyTreeInfo() {
//        StringBuilder stringBuilder = new StringBuilder();
//        stringBuilder.append("Список родственников:\n");
//        for(T person: familyTree) {
//            stringBuilder.append(person);
//            stringBuilder.append("\n");
//        }
//        return stringBuilder.toString();
//    }
//
//    public void sortByName() {
//        familyTree.sortByName();
//    }
//
//    public void sortByBirthYear() {
//        familyTree.sortByBirthYear();
//    }
//}
