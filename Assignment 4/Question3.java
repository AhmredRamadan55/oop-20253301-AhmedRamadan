public class Question3 {
    public static double average(int a, int b) {
        return ((double) a + b) / 2.0;
    }

    public static double average(int a, int b, int c) {
        return ((double) a + b + c) / 3.0;
    }

    public static double average(double a, double b) {
        return (a + b) / 2.0;
    }

    public static void main(String[] args) {
        System.out.println(average(4, 7));
        System.out.println(average(2, 4, 9));
        System.out.println(average(2.5, 3.5));
    }

    // Return type alone cannot overload a method; Java distinguishes methods by their parameter lists.
}
