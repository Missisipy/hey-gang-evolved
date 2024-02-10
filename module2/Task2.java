import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Map<Integer, Integer> map = new HashMap<>();
        System.out.println("Введите длину массива:");
        int i = scanner.nextInt();
        System.out.println("Введите числа массива:");
        while (i > 0) {

            int value = scanner.nextInt();
            if (map.containsKey(value)) {
                int newValue = map.get(value) + 1;
                map.put(value, newValue);
            } else {
                map.put(value, 1);
            }
            i--;
        }
        int intResult = 0;
        String result = "";

        for (Map.Entry<Integer, Integer> values : map.entrySet()) {

            if (values.getValue() > 1) {

                intResult++;
                result += "Значение " + values.getKey() + " повторяется " + values.getValue() + " раза\n";
            }
        }
        if (intResult == 0) {
            System.out.println("Дубликатов нет.");
        } else System.out.println(result);
    }
}
