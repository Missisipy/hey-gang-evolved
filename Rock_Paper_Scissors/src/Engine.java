public abstract class Engine {
    int newRandomStatment () {

        int random = (int) (Math.random() * 3);

        getYourDecizion(random);

        return random;
    }

    void getYourDecizion(int ordinal) {     //TODO взял идею у: https://stackoverflow.com/users/562557/thebenedict
        Variants ret = null;
        for (Variants type : Variants.values()) {
            if (type.getCodeVariant() == ordinal)
                ret = type;
        }
        System.out.println(ret);
    }

    void Rock () {
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
    void Scissors () {
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
    void Paper () {
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
    void notRulesGame () {

        System.out.println("Введите одно из следующих: ");
        for (Variants a : Variants.values()) {

            System.out.println(a);
        }
    }
    void None () {
        System.out.println("Ничья");
    }
    void Win () {
        System.out.println("Вы выиграли");
    }
    void Lose () {
        System.out.println("Вы проиграли");
    }
}
