//CODE 1
import java.util.InputMismatchException;
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
        catch(InputMismatchException ime) {
            System.out.println("IME Detected");
        }
        catch(ArithmeticException ae) {
            System.out.println("AE Detected");
        }
        catch(Exception e) {
            System.out.println("Ouch! Exception Detected! " + e.getMessage());
            e.PrintStackTrace();
        }
        finally {
            System.out.println("The Division is " +result);
        }
    public static void main (String[] args) {
        Test2 obj = new Test2();
        obj.calculate();
    }
} 


//CODE 2

public class Test3{
    int getNextNo (int n) {
        if (n==5) {
            return n+1; 
        }
    }
    finally {
        System.out.println("This is Important CODE");
    }
    return n-1;
}
public static void main (String[] args) {
    Test3 obj = new Test3();
    System.out.println(obj.getNextNo(5));
}


//CODE 3

import java.io.File;
import java.io.IOException;

public class Test4 {
    public static void main(String[] args) throws IOException {
        File f = new File("d?:\\abc.txt");
        f.createNewFile();
    }
}
