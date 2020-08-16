/*print any given input string in following format.
input ->"Hello"
output
index: 0 1 2 3 4
chars: H e l l o
hint use \t for tab space . */
import java.util.Scanner;
public class helloPrint{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        char [] ch = a.toCharArray();
        System.out.print("index: ");
        for (int i=0;i<ch.length;i++)
        {
            System.out.print(i + "\t");
        }
        System.out.print("\n");
        System.out.print("chars:");
        for (char c: ch)
        {
            System.out.print( c + "\t");
        }
    }
}