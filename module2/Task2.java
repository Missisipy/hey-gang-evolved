import java.util.HashMap;
import java.util.Map;

public class Task2 {

    public static void main(String[] args) {

        StringBuilder result = new StringBuilder();

        int[] array = new int[] {4, 5, 6, 6, 8, 23, 23, 43435, 35356, 2, 2, 2, 35356, 35356, 35356, 35356, 35356, 34, 4, 0, 2, 3, 6, 455, 65, 54, 33, 0, 54, 4, 8, 32, 3, 0};

        Map<Integer, Integer> map = new HashMap<>();

        for (int x : array) {

            if (map.containsKey(x)) {

                int value = map.get(x);
                map.put(x, value + 1);

            } else map.put(x, 1);
        }

        int intResult = 0;

        for (Map.Entry<Integer, Integer> values : map.entrySet()) {

            if (values.getValue() > 1) {

                intResult++;
                result.append("Значение ").append(values.getKey()).append(" повторяется ").append(values.getValue());
                String prm = "" + values.getValue();
                if ((prm.endsWith("2")) || (prm.endsWith("3")) || (prm.endsWith("4"))) result.append(" раза\n");
                else result.append(" раз\n");
            }
        }
        if (intResult == 0) {
            System.out.println("Дубликатов нет.");
        } else System.out.println(result);
    }
}
