/*
  Created by IntelliJ IDEA.
  User: Adarsh Mishra (MeAdarshMishra)
  Date: 03-08-2020
  Time: 17:31
*/
import java.util.Scanner;
public class WordQuiz {
    public static void main(String[] args){
        for (int i = 1; i <=100; i++) {
            if (i%2!=0) {
                if(i % 5 == 0 )
                {
                    System.out.print("FizzBuzz");
                }
                else{
                    System.out.print(i);
                }
            }else {
                if(i % 10 !=0) {
                    System.out.print("Fizz");
                }
                else
                {
                    System.out.print("Buzz");
                }
            }
            if (i != i - 1) {
                System.out.print(" ");
            }
        }



    }


}

