package org.enset.Dccorateur;

public class App {
    public static void main(String[] args) {
        Coffee simpleCoffee = new SimpleCoffee();
        System.out.println(simpleCoffee.getDescription() + " $" + simpleCoffee.getCost());

        Coffee milkCoffee = new MilkDecorator(simpleCoffee);
        System.out.println(milkCoffee.getDescription() + " $" + milkCoffee.getCost());

        Coffee milkSugarCoffee = new SugarDecorator(milkCoffee);
        System.out.println(milkSugarCoffee.getDescription() + " $" + milkSugarCoffee.getCost());

        Coffee fullCoffee = new ChocolateDecorator(milkSugarCoffee);
        System.out.println(fullCoffee.getDescription() + " $" + fullCoffee.getCost());
    }
}
