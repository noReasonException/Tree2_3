import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Tree23<Integer,String> h=new Tree23<>();
        ArrayList<Integer> integers = new ArrayList<>();
        Random r=new Random();
        int j;
        for (int i = 0; i < 1000; i++) {
            integers.add(j=r.nextInt());
            h.insert(j,"hoa!");
        }
        try{
            for (Integer m:integers) {
                System.out.println(h.search(m));
                System.out.println(m);
            }
        }catch (Exception e){e.printStackTrace();}
        h.print();//loop! //TODO fix

    }
}
