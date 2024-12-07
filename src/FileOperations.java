import java.io.IOException;

interface FileOperations {
    /**
    Интерфейс для операций с файлами
     */
    void saveToFile(FamilyTree familyTree, String fileName) throws
            IOException;
    FamilyTree loadFromFile(String fileName) throws IOException,
            ClassNotFoundException;
}