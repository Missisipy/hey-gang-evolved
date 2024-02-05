import java.util.Scanner;

public class VarAnswer {
    void notRulesGame () {

        System.out.println("Введите одно из следующих:");

        for (Variants x : Variants.values()) {

            System.out.println(x);
        }
        getResultGame();
    }
    void None () {

        System.out.println("Ничья");

        getResultGame();
    }
    void Win () {
        System.out.println("Вы выиграли");
    }
    void Lose () {
        System.out.println("Вы проиграли");
    }
    void getResultGame () {

        Variants player = getSelectedAnswerOption();

        if (player == null) {

            notRulesGame();

        } else {

            Variants console = newRandomStatment();

            if (player.equals(Variants.ROCK)) {
                if (console.equals(Variants.ROCK)) None();
                if (console.equals(Variants.SCISSORS)) Win();
                if (console.equals(Variants.PAPER)) Lose();
            }
            if (player.equals(Variants.SCISSORS)) {
                if (console.equals(Variants.ROCK)) Lose();
                if (console.equals(Variants.SCISSORS)) None();
                if (console.equals(Variants.PAPER)) Win();
            }
            if (player.equals(Variants.PAPER)) {
                if (console.equals(Variants.ROCK)) Win();
                if (console.equals(Variants.SCISSORS)) Lose();
                if (console.equals(Variants.PAPER)) None();
            }
        }
    }
    Variants getSelectedAnswerOption () {

        Scanner scanner = new Scanner(System.in);
        String selectedAnswerOption = scanner.nextLine();

        Variants inValue = null;

        for (Variants x : Variants.values()) {

            if (x.name().equals(selectedAnswerOption.toUpperCase())) {
                inValue = x;
                break;
            }
        }
        return inValue;
    }
    Variants newRandomStatment() {

        int random = (int) (Math.random() * 3);

        Variants ret = null;

        for (Variants type : Variants.values()) {

            if (type.ordinal() == random) {

                ret = type;
                System.out.println(ret.name());
            }
        }
        return ret;
    }
}
