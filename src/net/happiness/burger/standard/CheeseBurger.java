package net.happiness.burger.standard;

import net.happiness.burger.Hamburger;

import java.util.List;

public class CheeseBurger extends Hamburger {

    public CheeseBurger() {
        name = "CheeseBurger";
        composition = List.of(
                "Beef patty",
                "Cheese",
                "Lettuce",
                "Tomato",
                "Ketchup",
                "Mustard",
                "Buns"
        );
    }

}
