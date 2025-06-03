package org.enset.Strategy;

public class App {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        cart.setPaymentStrategy(new CreditCardPayment("John Doe", "1234567890123456", "786", "12/23"));
        cart.checkout(100);

        cart.setPaymentStrategy(new PayPalPayment("john.doe@example.com", "password123"));
        cart.checkout(200);

        cart.setPaymentStrategy(new BitcoinPayment("myBitcoinWallet"));
        cart.checkout(300);
    }
}
