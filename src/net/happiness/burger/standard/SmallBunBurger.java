package net.happiness.burger.standard;

import net.happiness.burger.Hamburger;

import java.util.List;

public class SmallBunBurger extends Hamburger {

    public SmallBunBurger() {
        name = "SmallBunBurger";
        composition = List.of(
                "Beef patty",
                "Garlic",
                "Onion",
                "Cheese",
                "Lettuce",
                "Tomato",
                "Ketchup",
                "Mayonnaise",
                "Mini buns"
        );
    }

}
