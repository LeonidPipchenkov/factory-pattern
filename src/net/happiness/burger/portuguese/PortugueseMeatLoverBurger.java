package net.happiness.burger.portuguese;

import net.happiness.burger.Hamburger;

import java.util.List;

public class PortugueseMeatLoverBurger extends Hamburger {

    public PortugueseMeatLoverBurger() {
        name = "Portuguese Style Meat LoverBurger";
        composition = List.of(
                "Ground beef",
                "Portuguese chorizo sausage",
                "Bacon slices",
                "Salt",
                "Pepper",
                "Red wine",
                "Bread rolls"
        );
        calories = 650;
    }

}
