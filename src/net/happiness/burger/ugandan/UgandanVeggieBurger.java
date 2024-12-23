package net.happiness.burger.ugandan;

import net.happiness.burger.Hamburger;

import java.util.List;

public class UgandanVeggieBurger extends Hamburger {

    public UgandanVeggieBurger() {
        name = "Ugandan Style VeggieBurger";
        composition = List.of(
                "Prepared beans",
                "Green onion",
                "Green pepper",
                "Wheat flour",
                "Flax eggs",
                "Lettuce leaves",
                "Spicy sauce",
                "Lightly toasted buns"
        );
        calories = 550;
    }

}
