package net.happiness.store.impl;

import net.happiness.burger.BurgerType;
import net.happiness.burger.Hamburger;
import net.happiness.burger.portuguese.PortugueseCheeseBurger;
import net.happiness.burger.portuguese.PortugueseMeatLoverBurger;
import net.happiness.burger.portuguese.PortugueseVeggieBurger;
import net.happiness.store.HamburgerStore;

public class PortugueseHamburgerStore extends HamburgerStore {

    @Override
    public Hamburger createHamburger(BurgerType type) {
        return switch (type) {
            case CHEESE -> new PortugueseCheeseBurger();
            case VEGGIE -> new PortugueseVeggieBurger();
            case MEAT_LOVER -> new PortugueseMeatLoverBurger();
            default -> null;
        };
    }

}
