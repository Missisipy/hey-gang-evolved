import java.util.*;

public class Students {

    private int age;
    private String name;
    Students (int age, String name) {

        this.age = age;
        this.name = name;
    }

    int getAge () {
        return age;
    }

    String getName () {
        return name;
    }

    @Override
    public String toString() {
        return "Студент " + getName() + ": " + getAge() + " года";
    }
    public static void result (LinkedList<Students> lst) {

        StringBuilder res = new StringBuilder();

        for (Students x : lst) {

            res.append(x.toString()).append(", ");
        }

        res.delete(res.length() - 2, res.length());
        res.append(".");

        System.out.println(res);
    }

    public static void main(String[] args) {

        LinkedList<Students> list = new LinkedList<>();

        Students st1 = new Students(92, "Mike");
        Students st2 = new Students(34, "Steve");
        Students st3 = new Students(22, "John");

        list.add(st1);
        list.add(st2);
        list.add(st3);

        result(list);
    }
}
