import java.util.*;
public class functionMethod{

    //1.  function
    public static void calSum(int a, int b){
        int sum = a + b;
        System.out.print("Sum of total : " + sum);
       // return sum;
    }
    // 2. swap function
    public static void swap(int num1, int num2){
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("Before swaping numbers num1 is 50 and num2 is 75");
        System.out.println("After swaping numbers num1 is "+ num1 + " and num2 is "+ num2);

    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        /* System.out.print("Enter First Number : " ); int num1 = sc.nextInt();
        System.out.print("Enter First Number : "); int num2 = sc.nextInt();
        calSum(num1, num2); */

        //2.  swap - values || call by value
     /* 
        int a=5;
        int b=8;

        int temp = a;
        a = b;
        b = temp;
        System.out.println("Value is now change, original val of a is 5, Now A :" + a);
        System.out.println("Value is now change, original val of b is 8, Now A :" + b);
    */

        //Swap Number || call by reference
        int a = 50;
        int b = 75;
        swap(a, b);
       

    }
}