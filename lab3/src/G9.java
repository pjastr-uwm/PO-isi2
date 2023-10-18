import java.util.ArrayList;

public class G9 {

    public static void main(String[] args) {
        ArrayList<Integer> lt1 = new ArrayList<>();
        lt1.add(4);
        lt1.add(-5);
        lt1.add(3);
        lt1.add(11);
        System.out.println(oddElementsSum(lt1));
        System.out.println(oddElementsSum2(lt1));
    }

    public static int oddElementsSum(ArrayList<Integer> arg)
    {
        int temp=0;
        for(int elem : arg)
        {
            if(elem % 2 !=0)
            {
                temp += elem;
            }
        }
        return temp;
    }

    public static Integer oddElementsSum2(ArrayList<Integer> arg)
    {
        Integer temp=0;
        for(int elem : arg)
        {
            if(elem % 2 !=0)
            {
                temp += elem;
            }
        }
        return temp;
    }
}
