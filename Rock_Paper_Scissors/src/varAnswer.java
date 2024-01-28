import java.util.Scanner;

enum Variants {
    КАМЕНЬ(0),   //TODO это константные
    НОЖНИЦЫ(1),  // значения и они
    БУМАГА(2);   // обозначаются заглавными !camelCase

    private int codeVariant;

    private Variants (int codeVariant) {

        this.codeVariant = codeVariant;
    }

    int getCodeVariant () {

        return codeVariant;
    }
}
public class varAnswer extends Engine{

    private Scanner scanner = new Scanner(System.in);
    private int selectedAnswerOption;

    varAnswer () {

        String inValue = scanner.nextLine().toUpperCase();
        for (Variants x : Variants.values()) {

            if (x.name().equals(inValue)) {
                this.selectedAnswerOption = x.getCodeVariant();
                break;
            } else {
                this.selectedAnswerOption = -1;
            }
        }
    }
    int getSelectedAnswerOption () {

        return selectedAnswerOption;
    }
    void getResultGame (int resByConsole) {

        switch (resByConsole) {
            case 0:
                Rock();
                break;
            case 1:
                Scissors();
                break;
            case 2:
                Paper();
                break;
            default:
                notRulesGame();
                break;
        }
    }
}
