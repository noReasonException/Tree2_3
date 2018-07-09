import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Tree23<Integer,String> h=new Tree23<>();
        for (int i = 1; i <=100000; i++) {
            h.insert(i,"je");
        }
        for (int i = 1; i < 100000; i++) {
            System.out.println(h.search(i));
        }

        h.print();

    }
}
