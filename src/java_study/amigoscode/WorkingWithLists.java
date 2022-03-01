package java_study.amigoscode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class WorkingWithLists {

    public static void main(String[] args) {
        List<String> colorsUnmodifiable = List.of(
                "blue",
                "yellow"
        );


        List<String> colors = new LinkedList<>();
        colors.add("blue");
        colors.add("purple");
        colors.add("yellow");
        System.out.println(colors.size());
        System.out.println(colors.contains("yellow"));
        System.out.println(colors.contains("pink"));
        System.out.println(colors);

        for (String color: colors){
            System.out.println(color);
        }

        colors.forEach(System.out::println);

        for (int i = 0; i < colors.size(); i++) {
            System.out.println(colors.get(i));
        }
    }
}
