package ru.skvrez.state;

public class DraftState implements State {

    Document document;

    @Override
    public void print(Document document) {
        System.out.println("Can't print document in Draft state");
    }

    @Override
    public void send(Document document) {
        System.out.println("The document has been sent for review");
        document.changeState(new ReviewState());
    }
}
