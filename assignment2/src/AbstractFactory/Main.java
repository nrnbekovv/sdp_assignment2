package AbstractFactory;

public class Main {
    public static void main(String[] args) {
        BookFactory fictionFactory = new FictionFactory();
        FictionBook novel = fictionFactory.createFictionBook();
        EducationBook workbook = fictionFactory.createEducationBook();

        novel.read();
        workbook.study();

        BookFactory educationFactory = new EducationFactory();
        FictionBook magazine = educationFactory.createFictionBook();
        EducationBook textbook = educationFactory.createEducationBook();

        magazine.read();
        textbook.study();
    }
}
