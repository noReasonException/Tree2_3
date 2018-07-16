import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Map<Integer,String> h=Tree23.testcase();

        h.remove(13);
        ((Tree23)h).print();

    }
}
