/*
  Created by IntelliJ IDEA.
  User: Adarsh Mishra (MeAdarshMishra)
  Date: 29-07-2020
  Time: 14:29
*/
import java.awt.*;
import java.util.Scanner;

public class doWhileImplimentation {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Welcome to Magical Numbers");
        int magicalNumber=278;
        int number;
        do{
            System.out.println("Enter a positive integer");
            number=sc.nextInt();
            if(number==magicalNumber){
                System.out.println("you win the game");
                break;
            }
            else if(number!=0){
            System.out.println("Try again");
        }while(number!=0 && number!=magicalNumber);
        System.out.println("Thanks for Playing");

}
