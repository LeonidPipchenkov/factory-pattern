package net.happiness.factory;

import net.happiness.burger.BurgerType;
import net.happiness.burger.standard.CheeseBurger;
import net.happiness.burger.standard.GreekBurger;
import net.happiness.burger.Hamburger;
import net.happiness.burger.standard.MeatLoverBurger;
import net.happiness.burger.standard.SmallBunBurger;
import net.happiness.burger.standard.VeggieBurger;

public class SimpleHamburgerFactory {

    public Hamburger createHamburger(BurgerType type) {
        return switch (type) {
            case CHEESE -> new CheeseBurger();
            case GREEK -> new GreekBurger();
            case MEAT_LOVER -> new MeatLoverBurger();
            case VEGGIE -> new VeggieBurger();
            case SMALL_BUN -> new SmallBunBurger();
        };
    }

}
