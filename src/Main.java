import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Map<Integer,String> h=new Tree23<>();
        for (int i = 1; i <20; i++) {
            h.put(i,"je");
        }
        h.remove(4);
        ((Tree23)h).print();

    }
}
