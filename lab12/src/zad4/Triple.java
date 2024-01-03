package zad4;

public class Triple <T,U,V>{

    private T element1;
    private U element2;
    private V element3;

    public T getFirst(){
        return  element1;
    }

    public U getSecond(){
        return  element2;
    }

    public V getThird(){
        return  element3;
    }

    public Triple(){

    }

    public Triple(T element1, U element2, V element3) {
        this.element1 = element1;
        this.element2 = element2;
        this.element3 = element3;
    }

    @Override
    public String toString() {
        return "Triple{" +
                "element1=" + element1 +
                ", element2=" + element2 +
                ", element3=" + element3 +
                '}';
    }
}
