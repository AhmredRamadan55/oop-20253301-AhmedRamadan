import java.util.Scanner;


class Test {

    public static void main(String[] args) {
        System.out.println("Enter year:");
        Scanner input=new Scanner(System.in);
        int year=input.nextInt();

        if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
            System.out.println("Leap year");
        }else{
            System.out.println("Not a leap year");
        }
    }
}
