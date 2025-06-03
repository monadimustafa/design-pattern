package org.enset.Observer;

class User implements Observer {
    private String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println("Hey " + name + ", new message: " + message);
    }
}
