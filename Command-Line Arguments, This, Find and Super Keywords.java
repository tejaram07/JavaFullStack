//CODE 1
public class Test1 {
    int arg = 5;
    Test1 () {
        System.out.println("Hi ! I am default constructor");
    }
    Test1(int arg) {
        this();
        this.arg = arg;
    }
    public static void main (String[] args) {
        int arg = 10;
        Test1 obj = new Test1(10);
        System.out.println(obj.arg);
    }
}


//CODE 2
class App {
    App() {
        System.out.println("Constructor of App");
    }
    App (int num) {
        System.out.println(num);
    }
}

public class Test2 extends App {
    Test2() {
        super(20);
        System.out.println("Constructor of Test2");
    }
    public static void main (String[] args) {
        new Test2();
    }
}



