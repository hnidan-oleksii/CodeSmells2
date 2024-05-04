package Part2.Task9;

import java.util.ArrayList;
import java.util.List;

public class Example {
    public static void main(String[] args) {
        List<String> items = new ArrayList<>();
        int numberOfItems = 100;
        // Додавання елементів у список
        for (int i = 0; i < numberOfItems; i++) {
            items.add("Item " + i);
        }
    }
}

