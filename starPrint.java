/*
  Created by IntelliJ IDEA.
  User: Adarsh Mishra (MeAdarshMishra)
  Date: 11-12-2020
  Time: 22:31
*/

import java.util.Scanner;

public class starPrint {
    public static void main(String[] args){
        int n;
        System.out.println("Enter number of star print");
        Scanner sc =new Scanner(System.in);
        n=sc.nextInt();

        for(int i=1; i<=n; i++){

            for(int j=1; j<=i;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
