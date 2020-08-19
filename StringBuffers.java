/*
  Created by IntelliJ IDEA.
  User: Adarsh Mishra (MeAdarshMishra)
  Date: 19-08-2020
  Time: 22:55
*/

public class StringBuffers {
    public static void main(String[] args)
    {
        StringBuffer sb=new StringBuffer();
        StringBuffer sb1=new StringBuffer(20);
        StringBuffer sb2=new StringBuffer("Hello");
        System.out.println("Capacity of sb="+sb.capacity()+",\t"+"Length of sb="+sb.length());
        System.out.println("Capacity of sb1="+sb1.capacity()+",\t"+"Length of sb1="+sb1.length());
        System.out.println("Capacity of sb2="+sb2.capacity()+",\t"+"Length of sb2="+sb2.length());
    }

}
