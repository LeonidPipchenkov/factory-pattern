package net.happiness.burger.portuguese;

import net.happiness.burger.Hamburger;

import java.util.List;

public class PortugueseCheeseBurger extends Hamburger {

    public PortugueseCheeseBurger() {
        name = "Portuguese Style CheeseBurger";
        composition = List.of(
                "Ground beef",
                "Portuguese chorizo sausage",
                "Portuguese cheese",
                "Garlic powder",
                "Red wine",
                "Bread rolls"
        );
        calories = 600;
    }

}
