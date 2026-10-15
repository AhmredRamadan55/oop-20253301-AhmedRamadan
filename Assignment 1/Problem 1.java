import java.util.Scanner;


    class Test {

    public static void main(String[] args) {
        System.out.println("Enter a number of radius : ");
        Scanner input=new Scanner(System.in);
        double radius= input.nextDouble();
        double area=Math.PI*Math.pow(radius, 2);
        double cir=2*Math.PI*radius;
        System.out.printf("Area of circle is : %.2f%n", area);
        System.out.printf("Circumference of circle is : %.2f%n", cir);
    }
}
