
public abstract class Engine {

    String newRandomStatment () {

        int random = (int) (Math.random() * 3);

        System.out.println(random);

        String result = "";

        if (random == 0) result = "Камень";
        else if (random == 1) result = "Ножницы";
        else if (random == 2) result = "Бумага";

        System.out.println(result);
        return result;
    }

    void Rock (String x) {
        switch (x) {
            case "Камень":
                System.out.println("Ничья");
                break;
            case "Ножницы":
                System.out.println("Вы выиграли");
                break;
            case "Бумага":
                System.out.println("Вы проиграли");
                break;
        }
    }

    void Scissors (String x) {
        switch (x) {
            case "Ножницы":
                System.out.println("Ничья");
                break;
            case "Бумага":
                System.out.println("Вы выиграли");
                break;
            case "Камень":
                System.out.println("Вы проиграли");
                break;
        }
    }

    void Paper (String x) {
        switch (x) {
            case "Бумага":
                System.out.println("Ничья");
                break;
            case "Камень":
                System.out.println("Вы выиграли");
                break;
            case "Ножницы":
                System.out.println("Вы проиграли");
                break;
        }
    }
}
