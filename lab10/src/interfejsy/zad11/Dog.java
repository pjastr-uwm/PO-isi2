package interfejsy.zad11;

public class Dog implements DomesticAnimalSound{
    @Override
    public String makeSound() {
        return "Woof";
    }

    @Override
    public String makeHappySound() {
        return "Wag tail";
    }
}
