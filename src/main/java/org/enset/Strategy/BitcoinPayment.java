package org.enset.Strategy;

public class BitcoinPayment implements PaymentStrategy {
    private String bitcoinWallet;

    public BitcoinPayment(String bitcoinWallet) {
        this.bitcoinWallet = bitcoinWallet;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using Bitcoin.");
    }
}