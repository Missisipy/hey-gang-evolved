import java.util.Objects;

public class Your_order_please {

    static void resultWords (String words) {

        String result = "";

        if (Objects.equals(words, ""))
            System.out.println("");

        else{
            String[] Alf = words.split(" ");

            String[] res = new String[Alf.length];

            for (String x : Alf) {

                StringBuilder y = new StringBuilder(x);

                for (int i = 0; i < x.length(); i++) {

                    for (int j = 0; j < Alf.length; j++) {

                        String a = String.valueOf(j + 1);
                        String b = String.valueOf(y.charAt(i));
                        boolean d = a.equals(b);
                        if (d) res[j] = x;
                    }
                }
            }
            result = res[0];

            for (int i = 1; i < res.length; i++) result += " " + res[i];

        }
        System.out.println(result);
    }

    public static void main(String[] args) {

        String x = "is2 Thi1s T4est 3a";

        resultWords(x);
    }
}
