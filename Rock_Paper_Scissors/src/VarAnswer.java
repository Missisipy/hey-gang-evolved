import java.util.Scanner;

public class VarAnswer implements Engine {

    private Scanner scanner = new Scanner(System.in);
    private int selectedAnswerOption;

    VarAnswer () {

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
    static void getResultGame () {

        VarAnswer variant = new VarAnswer();

        switch (variant.getSelectedAnswerOption()) {
            case 0:
                Engine.Rock ();
                break;
            case 1:
                Engine.Scissors ();
                break;
            case 2:
                Engine.Paper ();
                break;
            default:
                Engine.notRulesGame ();
                break;
        }
    }
    int getSelectedAnswerOption () {

        return selectedAnswerOption;
    }
}
