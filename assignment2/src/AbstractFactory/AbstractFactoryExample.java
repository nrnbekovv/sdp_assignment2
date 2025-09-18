package AbstractFactory;

interface FictionBook {
    void read();
}

interface EducationBook {
    void study();
}

class AdventureNovel implements FictionBook {
    @Override
    public void read() {
        System.out.println("Reading an Adventure Novel.");
    }
}

class Magazine implements FictionBook {
    @Override
    public void read() {
        System.out.println("Flipping through a Magazine.");
    }
}

class SchoolTextbook implements EducationBook {
    @Override
    public void study() {
        System.out.println("Studying from a School Textbook.");
    }
}

class Workbook implements EducationBook {
    @Override
    public void study() {
        System.out.println("Practicing exercises in a Workbook.");
    }
}

interface BookFactory {
    FictionBook createFictionBook();
    EducationBook createEducationBook();
}

class FictionFactory implements BookFactory {
    @Override
    public FictionBook createFictionBook() {
        return new AdventureNovel();
    }

    @Override
    public EducationBook createEducationBook() {
        return new Workbook();
    }
}

class EducationFactory implements BookFactory {
    @Override
    public FictionBook createFictionBook() {
        return new Magazine();
    }

    @Override
    public EducationBook createEducationBook() {
        return new SchoolTextbook();
    }
}
