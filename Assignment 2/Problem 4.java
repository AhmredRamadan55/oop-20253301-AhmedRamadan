import java.util.Scanner;


class Test {

    public static void main(String[] args) {
        System.out.println("Enter three sides:");
        Scanner input=new Scanner(System.in);
        int a=input.nextInt();
        int b=input.nextInt();
        int c=input.nextInt();

        if(a >= (long)b + c || b >= (long)a + c || c >= (long)a + b){
            System.out.println("Not a valid triangle");
        }else{
            if(a == b && b == c){
                System.out.println("Equilateral");
            }else{
                if(a == b || a == c || b == c){
                    System.out.println("Isosceles");
                }else{
                    System.out.println("Scalene");
                }
            }
        }
    }
}
