package FactoryMethod;

public class Main {
    public static void main(String[] args) {
        Book novel = BookFactory.createBook("novel");
        novel.read();

        Book textbook = BookFactory.createBook("textbook");
        textbook.read();
    }
}
