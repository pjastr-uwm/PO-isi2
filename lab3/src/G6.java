import java.util.ArrayList;
import java.util.Arrays;

public class G6 {

    public static void main(String[] args) {
        ArrayList<Integer> lt = new ArrayList<>();
        lt.add(3);
        lt.add(-4);
        lt.add(77);
        lt.add(-12);
        System.out.println(lt);
        ArrayList<Integer> lt2 = reverseArray(lt);
        System.out.println(lt);
        System.out.println(lt2);
        //ArrayList<Integer> lt3 = null;
        //ArrayList<Integer> lt4 = reverseArray(lt3);
        ArrayList<Integer> lt5 = new ArrayList<>();
        ArrayList<Integer> lt6 = reverseArray(lt5);
    }

    public static ArrayList<Integer> reverseArray(ArrayList<Integer> arg)
    {
        /*if (arg == null)
        {
            throw new IllegalArgumentException(" Argument jest nullem");
        }*/
        ArrayList<Integer> temp = new ArrayList<>();
        for(int i=arg.size()-1;i>=0;i--)
        {
            temp.add(arg.get(i));
        }
        return temp;
    }
}
