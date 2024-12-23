package net.happiness.burger.standard;

import net.happiness.burger.Hamburger;

import java.util.List;

public class VeggieBurger extends Hamburger {

    public VeggieBurger() {
        name = "VeggieBurger";
        composition = List.of(
                "Black beans",
                "Chickpeas",
                "Mushrooms",
                "Carrot",
                "Lettuce",
                "Tomato",
                "Ketchup",
                "Mustard",
                "Toasted buns"
        );
    }

}
