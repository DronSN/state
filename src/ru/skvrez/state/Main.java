package ru.skvrez.state;

public class Main {

    public static void main(String[] args) {
        Document document = new Document("123");
        document.print();
        document.send();
        document.print();
        document.send();
        document.print();
        document.send();
    }
}
