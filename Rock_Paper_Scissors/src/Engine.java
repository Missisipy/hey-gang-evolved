public interface Engine {
    static int newRandomStatment () {

        int random = (int) (Math.random() * 3);

        System.out.println(getYourDecizion(random));

        return random;
    }
    static Variants getYourDecizion(int ordinal) {
        Variants ret = null;
        for (Variants type : Variants.values()) {
            if (type.getCodeVariant() == ordinal)
                ret = type;
        }
        return ret;
    }
    static void Rock () {
        switch (newRandomStatment()) {
            case 0:
                None();
                break;
            case 1:
                Win();
                break;
            case 2:
                Lose();
                break;
        }
    }
    static void Scissors () {
        switch (newRandomStatment()) {
            case 1:
                None();
                break;
            case 2:
                Win();
                break;
            case 0:
                Lose();
                break;
        }
    }
    static void Paper () {
        switch (newRandomStatment()) {
            case 2:
                None();
                break;
            case 0:
                Win();
                break;
            case 1:
                Lose();
                break;
        }
    }
    static void notRulesGame () {

        System.out.println("Введите одно из следующих:");

        for (Variants a : Variants.values()) {

            System.out.println(a);
        }
        VarAnswer.getResultGame();
    }
    static void None () {

        System.out.println("Ничья\n");

        VarAnswer.getResultGame();
    }
    static void Win () {
        System.out.println("Вы выиграли\n");
    }
    static void Lose () {
        System.out.println("Вы проиграли\n");
    }
}