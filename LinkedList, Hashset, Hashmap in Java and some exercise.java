//CODE 1
import java.util.Iterator;
import java.util.LinkedList;

public class Test0 {

    public static void main(String[] args) {

        LinkedList<String> myll = new LinkedList<>();

        myll.add("Ironman");
        myll.add("Thor");
        myll.add("Hulk");
        myll.add("Loki");
        System.out.println(myll.get(1));

        myll.addLast("Gamora");
        myll.addFirst("AntMan");
        myll.add(2, "Natasha");

        Iterator<String> it = myll.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("__________");
        System.out.println("who is at the top: " + myll.peek());
        System.out.println("hey first one, get out: " + myll.poll());

        it = myll.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}


//CODE 2
import java.util.LinkedList;
import java.util. LinkedList;
public class Test1 {
public static void main(String[] args) {
LinkedList myll = new LinkedList();
myll.push("ironman");
myll.push("thor");
myll.push("thanos");
System.out.println(myll.pop());
     }
}



//CODE 3
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> myList = new ArrayList<>();
        Set<String> uniqueItems = new HashSet<>();

        for (int i = 1; i <= 5; i++) {
            String item = sc.next();

            if (uniqueItems.contains(item)) {
                continue;
            }

            uniqueItems.add(item);
            myList.add(item);
        }

        System.out.println(myList);
    }
}


//CODE 4
import java.util.HashSet;

public class Test3 {
    public static void main(String[] args) {
        HashSet<String> mySet = new HashSet<>();
        mySet.add("red");
        mySet.add("orange");
        mySet.add("red");
        mySet.add("orange");
        mySet.add("green");
        System.out.println(mySet);
    }
}


//CODE 5
import java.util.HashMap;
import java.util.Map;

public class Test4 {

    public static void main(String[] args) {

        HashMap<String, String> states = new HashMap<String, String>();

        // put() method
        states.put("Tx", "Texas");
        states.put("AL", "Alabama");
        states.put("Ar", "Arizona");
        states.put("Ca", "California");

        System.out.println(states);

        for (Map.Entry<String, String> e : states.entrySet()) {
            System.out.println(e.getKey() + " - " + e.getValue());
        }
    }
}