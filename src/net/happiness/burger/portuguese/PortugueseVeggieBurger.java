package net.happiness.burger.portuguese;

import net.happiness.burger.Hamburger;

import java.util.List;

public class PortugueseVeggieBurger extends Hamburger {

    public PortugueseVeggieBurger() {
        name = "Portuguese Style VeggieBurger";
        composition = List.of(
                "Cooked chickpeas",
                "Cooked black beans",
                "Red bell pepper",
                "Garlic",
                "Breadcrumbs",
                "Fresh parsley",
                "Piri-piri sauce",
                "Bread rolls"
        );
        calories = 550;
    }

}
