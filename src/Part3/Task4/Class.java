package Part3.Task4;

public class Class {
    public void searchElement(int[] array, int target) {
        boolean found = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Element found");
        } else {
            System.out.println("Element not found");
        }
    }

}
