import java.lang.reflect.Array;
import java.util.*;

public class Task1 {

    public static void main(String[] args) {

        ArrayList<Integer> array = new ArrayList<>();
        array.add(3);
        array.add(8);
        array.add(15);
        array.add(17);
        array.add(23);
        array.add(0);
        array.add(6);
        array.add(26);
        array.add(-3);
        array.add(-31);
        array.add(123);
        array.add(-100);


        for (int x: array) {

            int result = 23;
            if (array.contains(result - x) && (array.indexOf(x) < array.indexOf(result - x))) {

                    int[] res = new int[]{array.indexOf(x), array.indexOf(result - x)};
                    System.out.println(Arrays.toString(res));
            }
        }
    }
}
