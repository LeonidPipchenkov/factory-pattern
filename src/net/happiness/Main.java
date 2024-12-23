package net.happiness;

import net.happiness.burger.BurgerType;
import net.happiness.burger.Hamburger;
import net.happiness.factory.SimpleHamburgerFactory;
import net.happiness.store.HamburgerStore;
import net.happiness.store.impl.PortugueseHamburgerStore;
import net.happiness.store.impl.UgandanHamburgerStore;

public class Main {

    public static void main(String[] args) {
        SimpleHamburgerFactory hamburgerFactory = new SimpleHamburgerFactory();
        Hamburger greekBurger = hamburgerFactory.createHamburger(BurgerType.GREEK);
        System.out.printf("James Burger has created his \"%s\"", greekBurger.getName());
        System.out.println("\n");

        HamburgerStore ugandanBurgerStore = new UgandanHamburgerStore();
        Hamburger cheeseBurger = ugandanBurgerStore.takeHamburgerOrder(BurgerType.CHEESE);
        System.out.printf("Leonid has taken his \"%s\"", cheeseBurger.getName());
        System.out.println("\n");

        HamburgerStore portugueseBurgerStore = new PortugueseHamburgerStore();
        Hamburger veggieBurger = portugueseBurgerStore.takeHamburgerOrder(BurgerType.VEGGIE);
        System.out.printf("James Bond has taken his \"%s\"", veggieBurger.getName());
        System.out.println();
    }

}
