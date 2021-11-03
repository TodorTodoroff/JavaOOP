package EncapsulationT2.Exercise.shoppingSpree;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private double money;
    private List<Product> products;

    public Person(String name, double money) {
        this.setName(name);
        this.setMoney(money);
        this.products = new ArrayList<>();
    }

    private void setName(String name) {
        if (name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
        this.name = name;
    }

    private void setMoney(double money) {
        if (money < 0) {
            throw new IllegalArgumentException("Money cannot be negative");
        }
        this.money = money;
    }

    public void buyProduct(Product product) {
        String message;
        if (this.money >= product.getCost()) {
            this.products.add(product);
            this.money -= product.getCost();
            message = String.format("%s bought %s", this.name, product.getName());
            System.out.println(message);
        } else {
            message = String.format("%s can't afford %s", this.name, product.getName());
            throw new IllegalArgumentException(message);
        }
    }

    public String getName() {
        return name;
    }

    public List<Product> getProducts() {
        return products;
    }
}
