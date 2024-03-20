import java.util.HashSet;

public class Search {
    int res;
    Search (int res) {

        this.res = res;
    }

    @Override
    public String toString () {
        return "Значение " + this.res;
    }

    public static void main(String[] args) {

        HashSet<Search> searches = new HashSet<>();

        Search s1 = new Search(9);
        Search s2 = new Search(8);
        Search s3 = new Search(7);

        searches.add(s1);
        searches.add(s2);
        searches.add(s3);

        System.out.println(searches);
    }

}
