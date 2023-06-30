import java.util.ArrayList;
import java.util.List;

public class Test0 {
    public static void main (String[] args) {
        ArrayList<String> states= new ArrayList<String>();
        states.add("california");
        states.add("Alabama");
        states.add("Alaska");
        states.add("Arkansas");
        System.out.println("ArrayList: "+states);
        String s = states.get(2);
        System.out.println("I got "+s);
        states.set(2, "Texas");
        System.out.println("After Updation : "+states);
    }
}