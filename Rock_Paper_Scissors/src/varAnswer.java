import java.util.Scanner;

enum Variants {
    КАМЕНЬ(0),   //TODO это константные
    НОЖНИЦЫ(1),  // значения и они
    БУМАГА(2);   // обозначаются курсивом

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
    private String inValue = scanner.nextLine().toLowerCase();
    private int selectedAnswerOption;

    varAnswer () {

        if (inValue.equals("камень")) {
            this.selectedAnswerOption = Variants.КАМЕНЬ.ordinal();
        } else if (inValue.equals("ножницы")) {
            this.selectedAnswerOption = Variants.НОЖНИЦЫ.ordinal();
        } else if (inValue.equals("бумага")) {
            this.selectedAnswerOption = Variants.БУМАГА.ordinal();
        } else this.selectedAnswerOption = -1;
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
