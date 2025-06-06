package org.enset.Observer;

import java.util.ArrayList;
import java.util.List;

class NewsPublisher implements Subject {
    private List<Observer> observers;
    private String message;

    public NewsPublisher() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(message);
        }
    }

    public void publishNews(String message) {
        this.message = message;
        notifyObservers();
    }
}

