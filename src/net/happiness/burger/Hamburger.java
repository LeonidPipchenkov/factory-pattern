package net.happiness.burger;

import java.util.List;

public abstract class Hamburger {

    protected String name;
    protected List<String> composition;
    protected int calories;

    public String getName() {
        return name;
    }

    public List<String> getComposition() {
        return composition;
    }

    public int getCalories() {
        return calories;
    }

}
