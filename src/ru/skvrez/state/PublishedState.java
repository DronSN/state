package ru.skvrez.state;

public class PublishedState implements State {
    @Override
    public void print(Document document) {
        System.out.println("Document content in published state: " + document.getText());
    }

    @Override
    public void send(Document document) {
        System.out.println("Document already is published");
    }
}
