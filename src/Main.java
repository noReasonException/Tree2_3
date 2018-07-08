import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Tree23<Integer,String> h=new Tree23<>();
        for (int i = 1; i <=10; i++) {
            h.insert(i,"je");
        }
        h.insert(11,"hoa");

        h.print();

    }
}
