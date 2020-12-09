/*
  Created by IntelliJ IDEA.
  User: Adarsh Mishra (MeAdarshMishra)
  Date: 09-12-2020
  Time: 22:33
*/
import java.util.Scanner;
public class conditions {
    public static void main(String[] args){
        int age;
        System.out.println("Enter your age");
        Scanner sc=new Scanner(System.in);
        age=sc.nextInt();
        switch(age)
        {
            case 12:
                System.out.println("Your are an Adult");
                break;
            case 18:
                System.out.println("Good to go!!");
                break;
            case 60:
                System.out.println("Aged");
            default:
                System.out.println("This age never accept by company");
        }
    }
}
