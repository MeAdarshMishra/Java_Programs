import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter three no.");
        int a=in.nextInt();
        int b=in.nextInt();
        int c=in.nextInt();
        if(a>b && a>c)
        {
            if(b>c)
            {
                System.out.print("2nd Largest no. is"+ b);
            }
            else
            {
                System.out.print("2nd Largest no. is"+ c);
            }
        }

        if(b>a && b>c)
        {
            if(a>c)
            {
                System.out.print("2nd Largest no. is"+ a);
            }
            else
            {
                System.out.print("2nd Largest no. is"+ c);
            }
        }

        if(c>b && c>a)
        {
            if(b>a)
            {
                System.out.print("2nd Largest no. is"+ b);
            }
            else
            {
                System.out.print("2nd Largest no. is"+ a);
            }
        }
    }
}
