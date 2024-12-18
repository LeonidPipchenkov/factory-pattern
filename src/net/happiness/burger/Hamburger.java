package net.happiness.burger;

public abstract class Hamburger {

    String name;
    String meat;
    String vegetables;
    String cheese;
    String sauce;
    String buns;

    public void prepare() {
        System.out.printf("Preparing ingredients: Meat - %s, Vegetables - %s, Cheese - %s, Sauce - %s, Buns - %s", meat, vegetables, cheese, sauce, buns);
    }

    public void cook() {
        System.out.println("Cooking burger - " + name);
    }

    public void box() {
        System.out.println("Boxing burger");
    }

}
