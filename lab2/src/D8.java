public class D8 {
    public static void main(String[] args) {
        System.out.println(foo(3));
    }

    public static int foo(int n)
    {
        int temp=0;
        for(int i=n;i<=2*n;i++)
        {
            temp+=i;
        }
        return temp;
    }
}
