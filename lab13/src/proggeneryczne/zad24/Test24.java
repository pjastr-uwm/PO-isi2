package proggeneryczne.zad24;

public class Test24 {

    public static void main(String[] args) {
        Triple<Bird> t1 = new Triple<>(new Bird(), new Bird(), new Bird());
        System.out.println(findMin(t1));
        Triple<Eagle> t2 = new Triple<>(new Eagle(), new Eagle(), new Eagle());
        System.out.println(findMin(t2));
    }

    public static Bird findMin(Triple<? extends Bird> arg){
        return arg.getElem2();
    }

    public static Object findMin2(Triple<? super Eagle> arg){
        return arg.getElem2();
    }
}
