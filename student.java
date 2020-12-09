/*
  Created by IntelliJ IDEA.
  User: Adarsh Mishra (MeAdarshMishra)
  Date: 09-12-2020
  Time: 23:34
*/

import java.util.Scanner;

public class student {
    public static void main(String[] args){
        byte p,c,m;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Physics marks");
        p=sc.nextByte();
        System.out.println("Enter Chemistry Marks");
        c=sc.nextByte();
        System.out.println("Enter Maths Marks");
        m=sc.nextByte();
        float avg=(p+c+m)/0.3f;
        if(avg>=40 && p>=33 && c>=33 && m>=33){
            System.out.println("Congo!You are selected for Us");
        }
        else
        {
            System.out.println("Sorry!!Better luck next time");
        }

    }
}

