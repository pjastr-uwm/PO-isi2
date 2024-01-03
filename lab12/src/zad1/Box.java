package zad1;

public class Box<T> {

    private T element;

    public void set(T element){
        this.element = element;
    }

    public T get(){
        return element;
    }

    @Override
    public String toString(){
        return getClass().getSimpleName()+" "+element.toString();
    }

    public Box(T element){
        this.element = element;
    }

    public Box(){

    }
}
