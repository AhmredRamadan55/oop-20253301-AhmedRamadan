public class Question3 {
    public static double cylinderVolume(double dValue, double hValue) {
        double radius = dValue / 2.0;
        return Math.PI * radius * radius * hValue;
    }

    public static void main(String[] args) {
        System.out.println("Volume = " + cylinderVolume(10.0, 5.0));
    }
}
