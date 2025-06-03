package org.enset.Observer;

public class App {
    public static void main(String[] args) {
        NewsPublisher newsPublisher = new NewsPublisher();

        User user1 = new User("Alice");
        User user2 = new User("Bob");
        User user3 = new User("Charlie");

        newsPublisher.registerObserver(user1);
        newsPublisher.registerObserver(user2);

        newsPublisher.publishNews("Breaking News: Observer Pattern in Java!");

        newsPublisher.registerObserver(user3);
        newsPublisher.publishNews("Update: Observer Pattern Example Expanded!");

        newsPublisher.removeObserver(user1);
        newsPublisher.publishNews("Final Update: Observer Pattern Complete!");
    }
}
