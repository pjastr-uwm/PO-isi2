import java.util.ArrayList;

public class G1 {
    public static void main(String[] args) {
        ArrayList<Integer> lt1 = new ArrayList<>();
        for(int i=1;i<=10;i++)
        {
            lt1.add(i);
        }
        System.out.println(lt1);
        for(int i=lt1.size()-1;i>=0;i--)
        {
            System.out.println(lt1.get(i));
        }
    }

}
