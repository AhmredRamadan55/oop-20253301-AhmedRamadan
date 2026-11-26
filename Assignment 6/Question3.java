import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int numberOfElements = input.nextInt();

        if (numberOfElements <= 0) {
            System.out.println("The number of elements must be positive.");
        } else {
            float[] values = new float[numberOfElements];
            System.out.print("Enter the array elements: ");
            for (int i = 0; i < values.length; i++) {
                values[i] = input.nextFloat();
            }

            ArrayStatistics statistics = new ArrayStatistics();
            statistics.findMaxMin(values);

            System.out.println("Maximum value: " + statistics.getMaxValue());
            System.out.println("Minimum value: " + statistics.getMinValue());
        }

        input.close();
    }
}

class ArrayStatistics {
    private float maxValue;
    private float minValue;

    public float getMaxValue() {
        return maxValue;
    }

    public float getMinValue() {
        return minValue;
    }

    public void findMaxMin(float[] values) {
        if (values == null || values.length == 0) {
            return;
        }

        maxValue = values[0];
        minValue = values[0];

        for (int i = 1; i < values.length; i++) {
            if (values[i] > maxValue) {
                maxValue = values[i];
            }
            if (values[i] < minValue) {
                minValue = values[i];
            }
        }
    }
}