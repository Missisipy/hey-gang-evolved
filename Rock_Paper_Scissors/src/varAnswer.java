public class varAnswer extends Engine{

    String selectedAnswerOption;

    varAnswer (String selectedAnswerOption) {

        this.selectedAnswerOption = selectedAnswerOption;
    }

    void getResultGame (String resByConsole, String resRandom) {

        switch (resByConsole) {
            case "Камень":
                Rock(resRandom);
                break;
            case "Ножницы":
                Scissors(resRandom);
                break;
            case "Бумага":
                Paper(resRandom);
                break;
        }
    }
}
