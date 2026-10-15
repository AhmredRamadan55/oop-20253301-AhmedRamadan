import java.util.Scanner;


    class Test{

    public static void main(String[] args) {
        System.out.println("enter 3 scores:");
        Scanner input=new Scanner(System.in);
        int s1=input.nextInt();
        int s2=input.nextInt();
        int s3=input.nextInt();
        double avg = (s1+s2+s3)/3.0;
        System .out.println(Math.round(avg));
        System.out.printf("%.2f%n", avg);



    }
}
