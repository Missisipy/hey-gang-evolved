import java.util.Scanner;

public class VarAnswer {
    private void notRulesGame () {

        System.out.println("Введите одно из следующих:");

        for (Variants x : Variants.values()) {

            System.out.println(x);
        }
        getResultGame();
    }
    private void None () {

        System.out.println("Ничья");

        getResultGame();
    }
    private void Win () {
        System.out.println("Вы выиграли");
    }
    private void Lose () {
        System.out.println("Вы проиграли");
    }
    public void getResultGame () {

        Variants player = getSelectedAnswerOption();

        if (player == null) {

            notRulesGame();

        } else {

            Variants console = newRandomStatment();

            if (player.equals(console)) None();
            else if ((player.equals(Variants.ROCK) && console.equals(Variants.SCISSORS)) ||
                     ((player.equals(Variants.SCISSORS)) && console.equals(Variants.PAPER)) ||
                     (player.equals(Variants.PAPER) && console.equals(Variants.ROCK))) Win();
            else Lose();
        }
    }
    private Variants getSelectedAnswerOption () {

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
    private Variants newRandomStatment() {

        int random = (int) (Math.random() * Variants.values().length);

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
