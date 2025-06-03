package org.enset.Dccorateur;

class ChocolateDecorator extends CoffeeDecorator {
    public ChocolateDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Chocolate";
    }

    @Override
    public double getCost() {
        return super.getCost() + 2.0;
    }
}

