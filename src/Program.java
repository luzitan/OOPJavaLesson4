import java.io.IOException;
import java.util.Iterator;
import java.util.List;

public class Program {

    public static void main(String[] args) {
        FamilyTree familyTree = new FamilyTree();
// Создаем людей
        Person john = new Person("John", 1950);
        Person mary = new Person("Mary", 1955);
        Person susan = new Person("Susan", 1980);
// Устанавливаем родительские связи
        susan.setMother(mary);
        susan.setFather(john);
        john.addChild(susan);
        mary.addChild(susan);
// Добавляем людей в древо
//        familyTree.addPerson(john);
//        familyTree.addPerson(mary);
//        familyTree.addPerson(susan);
//
//        // Iterator
//        for (var people: familyTree) {
//            System.out.println(people);
//        }
//        Service service = new Service();
//        service.addPerson("Паша", 19);
//        service.addPerson("Даша", 60);
//        service.addPerson("Витя", 55);
//        service.addPerson("Юля", 20);
//        System.out.println(service.familyTreeInfo());
//
//        service.sortByName();
//        System.out.println("Сортировка по имени:");
//        System.out.println(service.familyTreeInfo());
//
//        service.sortByBirthYear();
//        System.out.println("Сортировка по году рождения:");
//        System.out.println(service.familyTreeInfo());




//        // Создаем объект для работы с файлами
//        FileOperations fileOps = new FileOperationsImpl();
//        // Сохраняем генеалогическое древо в файл
//        try {
//            fileOps.saveToFile(familyTree, "familyTree.dat");
//            System.out.println("Генеалогическое древо сохранено в файле.");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        // Загружаем генеалогическое древо из файла
//        FamilyTree loadedFamilyTree = null;
//        try {
//            loadedFamilyTree =
//                    fileOps.loadFromFile("familyTree.dat");
//            System.out.println("Генеалогическое древо загружено из файла.");
//        } catch (IOException | ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//        // Проверяем, что древо загрузилось правильно
//        if (loadedFamilyTree != null) {
//            for (Person person : loadedFamilyTree.getPeople()) {
//                System.out.println("Загруженный человек: " +
//                        person.getName() + ", родился в " + person.getBirthYear());
//            }
//        }

        // Пример получения всех детей Джона
        List<Person> johnsChildren = familyTree.getChildren(john);
        for (Person child : johnsChildren) {
            System.out.println("Дети John's: " + child.getName());
        }


    }

}
