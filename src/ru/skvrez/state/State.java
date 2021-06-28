package ru.skvrez.state;

public interface State {
    void print(Document document);
    void send(Document document);
}
