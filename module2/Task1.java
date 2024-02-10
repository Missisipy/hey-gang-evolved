import java.util.*;

public class Task1 {

    public static void main(String[] args) {

        int num;

        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Введите значение числа: ");
        num = scanner.nextInt();
        System.out.println("Введите длину массива:");
        int i = scanner.nextInt();
        System.out.println("Введите числа массива:");
        while (i > 0) {

            list.add(scanner.nextInt());
            i--;
        }

        Set<Integer> result = new LinkedHashSet<>();

        for (int x : list) {

            for (int y : list) {

                if ((y != x) && ((y + x) == num)) {

                    result.add(list.indexOf(x));
                    result.add(list.indexOf(y));

                }
            }
        }
        System.out.println(result);
    }
}
