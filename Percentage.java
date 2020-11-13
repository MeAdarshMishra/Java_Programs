/*
  Created by IntelliJ IDEA.
  User: Adarsh Mishra (MeAdarshMishra)
  Date: 27-09-2020
  Time: 19:32
*/

import com.sun.jdi.CharType;

import java.util.Scanner;
public class Percentage {
    public static void main(String[] args) {
        System.out.println("Enter Student name");
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        System.out.println("Enter English marks");
        float english=sc.nextFloat();
        System.out.println("Out of?");
        float eo=sc.nextFloat();
        System.out.println("Enter Physics marks");
        float physics=sc.nextFloat();
        System.out.println("Out of?");
        float po=sc.nextFloat();
        System.out.println("Enter Chemistry marks");
        float chemistry=sc.nextFloat();
        System.out.println("Out of?");
        float co=sc.nextFloat();
        System.out.println("Enter Maths marks");
        float maths=sc.nextFloat();
        System.out.println("Out of?");
        float mo=sc.nextFloat();
        System.out.println("Enter C++ marks");
        float cpp=sc.nextFloat();
        System.out.println("Out of?");
        float cppo=sc.nextFloat();
        float sum=english+physics+maths+chemistry+cpp;
        float so=eo+co+mo+cppo+po;
        float percent=((sum/so)*100);
        System.out.println(" Total = "+sum+"/"+so+" Marks obtain by "+a+" So Percentage is "+percent);
    }

            }


