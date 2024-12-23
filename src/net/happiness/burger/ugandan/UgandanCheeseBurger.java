package net.happiness.burger.ugandan;

import net.happiness.burger.Hamburger;

import java.util.List;

public class UgandanCheeseBurger extends Hamburger {

    public UgandanCheeseBurger() {
        name = "Ugandan Style CheeseBurger";
        composition = List.of(
                "Perch fillet",
                "Carrot",
                "Ginger",
                "Garlic",
                "Eggs",
                "Cheese",
                "Herbaceous yogurt sauce",
                "Wheat buns"
        );
        calories = 550;
    }

}
