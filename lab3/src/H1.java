public class H1 {

    public static void main(String[] args) {
        String n1 = "Hello";
        System.out.println(n1);
        System.out.println(reverse(n1));
        String n2 = "";
        System.out.println(reverse(n2)+".");
        String n3 = null;
        System.out.println(reverse(n3));
    }

    public static String reverse(String arg)
    {
        if (arg == null)
        {
            return null;
        }
        StringBuilder temp = new StringBuilder(arg);
        temp.reverse();
        return temp.toString();
    }
}
