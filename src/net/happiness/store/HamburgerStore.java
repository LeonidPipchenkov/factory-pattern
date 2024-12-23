package net.happiness.store;

import net.happiness.burger.BurgerType;
import net.happiness.burger.Hamburger;

public abstract class HamburgerStore {

    public abstract Hamburger createHamburger(BurgerType type);

    public Hamburger takeHamburgerOrder(BurgerType type) {
        Hamburger burger = createHamburger(type);
        prepare(burger);
        cook(burger);
        box(burger);
        return burger;
    }

    private void prepare(Hamburger burger) {
        System.out.printf("Preparing ingredients: %s.\n", burger.getComposition());
    }

    private void cook(Hamburger burger) {
        System.out.printf("Cooking burger - \"%s\".\n", burger.getName());
    }

    private void box(Hamburger burger) {
        System.out.printf("Boxing burger. Total calories is %s cal.\n", burger.getCalories());
    }

}
