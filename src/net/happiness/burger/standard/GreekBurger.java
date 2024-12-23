package net.happiness.burger.standard;

import net.happiness.burger.Hamburger;

import java.util.List;

public class GreekBurger extends Hamburger {

    public GreekBurger() {
        name = "GreekBurger";
        composition = List.of(
                "Beef patty",
                "Onion",
                "Feta cheese",
                "Lettuce",
                "Tomato",
                "Tzatziki sauce",
                "Toasted buns"
        );
    }

}
