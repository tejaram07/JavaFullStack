// CODE 1
import java.util.*;
public class Test0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hey buddy how old are you");
        int age = sc.nextInt();
        System.out.println("Woha! You have really grown up! you are "+age+" years old);
    }
}

//CODE 2

import java.util.Scanner;
public class Test2 {
    int n1, n2, result;
    Scanner sc = new Scanner(System.in);

    void calculate() {
        try {
        System.out.println("Enter First Number");
        n1 = sc.nextInt();

        System.out.println("Enter Second Number");
        n2 = sc.nextInt();

        result = n1/n2;
        }
        catch(Exception e) {
            System.out.println("Ouch! Exception Detected!");
        }
        System.out.println("The Division is " +result);
    }
    public static void main (String[] args) {
        Test2 obj = new Test2();
        obj.calculate();
    }
} 