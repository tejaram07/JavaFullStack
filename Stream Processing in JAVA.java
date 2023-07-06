//CODE 1
import java.util.ArrayList;
public class Test0 {

  public static void change(String m) {
    System.out.println(m.toUpperCase());
  }

  public static void main(String[] args) {
    ArrayList<String> languages = new ArrayList<String>();

    languages.add("Java");
    languages.add("CSharp");
    languages.add("Python");
    languages.add("PHP");

    lang.forEach(Test0::change);

    for(String t : lang) {
      change(t);
    }

    change(lang.get(0));
    change(lang.get(1));
    change(lang.get(2));
    change(lang.get(3));
  }
}


//CODE 2
import java.util.Arrays;
import java.util.List;

class Program {
  static void Converter(int arg) {
    System.out.println(Math.abs(arg));
  }
  void doAction() {

    List<Integer> numbers = Arrays.asList(5,-3,6,7,8,-9,2);
    numbers.forEach(Program:Converter);
  }
}

public class Test1 {
  public static void main(String[] args) {
    Program obj = new Program();
    obj.doAction();
  }
}



//CODE 3

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test2 {
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

    List<Integer> result = myList.stream().map(e -> e+e).collect(Collectors.toList());
    System.out.println(result);
  }
}



//CODE 4

interface mathX {
  void add(int n1, int n2);
  void subtract(int n1, int n2);
}

class ProgramOne implements mathX {
  public void add(int n1, int n2) {
    System.out.println(n1+n2);
  }
}

public class Test3 {
  public static void main(String[] args) {
    mathX obj = (int x, int y)->{
      System.out.println(x+y);
    }
    o1.add(10, 20);
  }
}


