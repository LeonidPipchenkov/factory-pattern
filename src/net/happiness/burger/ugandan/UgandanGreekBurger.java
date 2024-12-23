package net.happiness.burger.ugandan;

import net.happiness.burger.Hamburger;

import java.util.List;

public class UgandanGreekBurger extends Hamburger {

    public UgandanGreekBurger() {
        name = "Ugandan Style GreekBurger";
        composition = List.of(
                "Ground beef",
                "Onion",
                "Garlic",
                "Fresh parsley",
                "Egg",
                "Lettuce leaves",
                "Tzatziki Sauce",
                "Lightly toasted buns"
        );
        calories = 600;
    }

}
