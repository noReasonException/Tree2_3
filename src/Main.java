import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Tree23<Integer,String> h=new Tree23<>();
        ArrayList<Integer> e=new ArrayList<>();
        Random r=new Random();
        int j;
        for (int i = 0; i < 3000; i++) {
            e.add(j=r.nextInt());
            h.insert(j,String.valueOf(r.nextInt()));
        }
        for (Integer key:e) {
            System.out.println(h.search(key));
        }
        h.print();

    }
}
