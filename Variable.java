/*
  Created by IntelliJ IDEA.
  User: Adarsh Mishra (MeAdarshMishra)
  Date: 16-07-2020
  Time: 10:48
*/
import java.util.*;
public class Variable {
    public static void main(String[] args){
        String Name;
        int rollNumber;
        int rank=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Name,your Roll Number and Rank.");
        Name=sc.next();
        rollNumber=sc.nextInt();
        rank=sc.nextInt();
        System.out.println(Name+" Whose Roll Number is "+rollNumber+" Got "+rank+" Rank!!");



    }
}
