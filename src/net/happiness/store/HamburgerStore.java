package net.happiness.store;

import net.happiness.burger.BurgerType;
import net.happiness.burger.Hamburger;

public abstract class HamburgerStore {

    public abstract Hamburger createHamburger(BurgerType type);

    public Hamburger orderHamburger(BurgerType type) {
        Hamburger burger = createHamburger(type);
        burger.prepare();
        burger.cook();
        burger.box();
        return burger;
    }

}
