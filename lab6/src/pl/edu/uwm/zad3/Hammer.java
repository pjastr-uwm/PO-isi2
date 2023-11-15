package pl.edu.uwm.zad3;

public class Hammer extends Tool{
    protected Hammer(String name) {
        super(name);
    }
    public static Hammer createHammer(String name)
    {
        return new Hammer("name");
    }

}
