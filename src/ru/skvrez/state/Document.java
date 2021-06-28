package ru.skvrez.state;

public class Document {
    private String text;
    private State state;

    public Document(String text) {
        this.text = text;
        this.state = new DraftState();
    }

    public void changeState(State state) {
        this.state = state;
    }

    public String getText() {
        return text;
    }

    public void print() {
        state.print(this);
    }

    public void send() {
        state.send(this);
    }
}
