import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Добро пожаловать в игру \"Камень/Ножницы/Бумага\"\n");
        System.out.println("Выберите один из вариантов и введите его ниже:");
        System.out.println("|Камень|\t|Ножницы|\t|Бумага|");

        var variant1 = new varAnswer(scanner.nextLine());

        variant1.getResultGame(variant1.selectedAnswerOption, variant1.newRandomStatment());
    }
}

//TIP то есть можно написать всякой хуйни и потом
// сделать из неё красивую вставку с текстом?