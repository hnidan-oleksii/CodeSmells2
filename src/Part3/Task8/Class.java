package Part3.Task8;

public class Class {
    public double calculateAverage(int[] numbers) {
        assert numbers.length > 0 : "Array must not be empty";

        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return (double) sum / numbers.length;
    }
}
