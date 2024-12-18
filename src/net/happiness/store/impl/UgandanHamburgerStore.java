package net.happiness.store.impl;

import net.happiness.burger.BurgerType;
import net.happiness.burger.Hamburger;
import net.happiness.burger.ugandan.UgandanCheeseBurger;
import net.happiness.burger.ugandan.UgandanGreekBurger;
import net.happiness.burger.ugandan.UgandanVeggieBurger;
import net.happiness.store.HamburgerStore;

public class UgandanHamburgerStore extends HamburgerStore {

    @Override
    public Hamburger createHamburger(BurgerType type) {
        return switch (type) {
            case CHEESE -> new UgandanCheeseBurger();
            case VEGGIE -> new UgandanVeggieBurger();
            case GREEK -> new UgandanGreekBurger();
            default -> null;
        };
    }

}
