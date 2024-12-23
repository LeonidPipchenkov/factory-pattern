package net.happiness.burger.standard;

import net.happiness.burger.Hamburger;

import java.util.List;

public class MeatLoverBurger extends Hamburger {

    public MeatLoverBurger() {
        name = "MeatLoverBurger";
        composition = List.of(
                "Beef patty",
                "Pork sausage",
                "Pepperoni",
                "Onion",
                "Lettuce",
                "Tomato",
                "Barbecue sauce",
                "Toasted buns"
        );
    }

}
