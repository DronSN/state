package ru.skvrez.state;

public class ReviewState implements State {
    @Override
    public void print(Document document) {
        System.out.println("Document content in review state: " + document.getText());
    }

    @Override
    public void send(Document document) {
        System.out.println("The document has been sent for publishing");
        document.changeState(new PublishedState());
    }
}
