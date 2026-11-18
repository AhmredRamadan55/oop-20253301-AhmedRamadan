import java.util.Scanner;

class Location {
    private double maxValue;
    private int column;

    public double getMaxValue() {
        return maxValue;
    }

    public void setMaxValue(double maxValue) {
        this.maxValue = maxValue;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public void locateLargest(double[] values) {
        if (values.length == 0) {
            throw new IllegalArgumentException("The array must not be empty.");
        }

        maxValue = values[0];
        column = 0;

        for (int i = 1; i < values.length; i++) {
            if (values[i] > maxValue) {
                maxValue = values[i];
                column = i;
            }
        }
    }
}

public class Problem2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of columns in the array: ");
        int size = input.nextInt();
        if (size <= 0) {
            System.out.println("The array must contain at least one value.");
            input.close();
            return;
        }

        double[] values = new double[size];
        System.out.print("Enter the array elements: ");
        for (int i = 0; i < values.length; i++) {
            values[i] = input.nextDouble();
        }

        Location location = new Location();
        location.locateLargest(values);
        System.out.println("The location of the largest element is "
                + location.getMaxValue() + " at position ("
                + location.getColumn() + ")");

        input.close();
    }
}
