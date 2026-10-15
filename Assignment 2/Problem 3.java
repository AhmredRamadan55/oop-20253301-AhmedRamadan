import java.util.Scanner;


class Test {

    public static void main(String[] args) {
        System.out.println("Enter first number:");
        Scanner input=new Scanner(System.in);
        double num1=input.nextDouble();
        System.out.println("Enter operator:");
        char operator=input.next().charAt(0);
        System.out.println("Enter second number:");
        double num2=input.nextDouble();

        switch(operator){
            case '+':
                System.out.println("Result: " + (num1 + num2));
                break;
            case '-':
                System.out.println("Result: " + (num1 - num2));
                break;
            case '*':
                System.out.println("Result: " + (num1 * num2));
                break;
            case '/':
                if(num2 == 0){
                    System.out.println("Cannot divide by zero");
                }else{
                    System.out.println("Result: " + (num1 / num2));
                }
                break;
            default:
                System.out.println("Invalid operator");
        }
    }
}
