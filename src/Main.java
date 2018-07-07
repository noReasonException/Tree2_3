import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Tree23<Integer,String> h=new Tree23<>();
        h.insert(10,"he");
        h.insert(9,"ho!");
        h.insert(8,"he");
        h.insert(7,"hw");
        h.insert(6,"hw");

        h.print();

    }
}
