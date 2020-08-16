public class Demo1StringBuffer {
    public static void main(String[] args){
        StringBuffer sb =new StringBuffer();
        StringBuffer sb1 = new StringBuffer(20);
        StringBuffer sb3 = new StringBuffer("Hello");
        System.out.println("capacity of sb="+sb.capacity()
        +"\t"+"length of sb"+sb.length());
        System.out.println("capacity of sb1="+sb1.capacity()
                +"\t"+"length of sb1"+sb1.length());
        System.out.println("capacity of sb3="+sb3.capacity()
                +"\t"+"length of sb3"+sb3.length());



    }
}
