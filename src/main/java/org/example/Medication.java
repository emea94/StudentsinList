package org.example;

// Step 1: Create a class 'Medication' with the methods 'getName', 'getPrice', and 'getAvailability'.
public class Medication {
    private String name;
    private String price;
    private int supply;

    public Medication(String name, String price, int supply) {
        this.name = name;
        this.price = price;
        this.supply = supply;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }
    public void setPrice(String price) {
        this.price = price;
    }

    public int getSupply() {
        return supply;
    }
    public void setSupply(int supply) {
        this.supply = supply;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", price='" + price + '\'' +
                ", supply=" + supply;
    }
}
