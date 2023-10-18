import java.util.Scanner;

public class H5m {

    public static void main(String[] args) {
        System.out.println("Podaj znak");
        Scanner input = new Scanner(System.in);
        char znak = input.nextLine().charAt(0);
        System.out.println("Podaj zdanie");
        String zdanie = input.nextLine();
        System.out.println("Znak "+znak+" wystepuje "+ ileZnak(znak, zdanie)+" razy.");
    }

    public static int ileZnak(char znak, String zdanie)
    {
        int licznik=0;
        for(int i=0;i<zdanie.length(); i++)
        {
            if( znak == zdanie.charAt(i))
            {
                licznik++;
            }
        }
        return licznik;
    }
}
