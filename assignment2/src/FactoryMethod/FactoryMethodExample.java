package FactoryMethod;

interface Book {
    void read();
}

class Novel implements Book {
    @Override
    public void read() {
        System.out.println("Reading a Novel full of adventures.");
    }
}

class Textbook implements Book {
    @Override
    public void read() {
        System.out.println("Studying from a Textbook.");
    }
}

class BookFactory {
    public static Book createBook(String type) {
        if (type.equalsIgnoreCase("novel")) {
            return new Novel();
        } else if (type.equalsIgnoreCase("textbook")) {
            return new Textbook();
        }
        throw new IllegalArgumentException("Unknown book type: " + type);
    }
}
