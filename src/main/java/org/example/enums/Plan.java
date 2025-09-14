package org.example.enums;

public enum Plan {
    BASIC("Basic", 0),
    STANDARD("Standard", 149),
    PREMIUM("Premium", 299);

    private final String name;
    private final Integer price; // Test: Integer.class

    Plan(String name, Integer price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Integer getPrice() {
        return price;
    }

    public String toString() {
        return name + " (" + price + ")";
    }
}
