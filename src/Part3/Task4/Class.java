package Part3.Task4;

public class Class {
    public void searchElement(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                System.out.println("Element found");
                return;
            }
        }

        System.out.println("Element not found");
    }
}
