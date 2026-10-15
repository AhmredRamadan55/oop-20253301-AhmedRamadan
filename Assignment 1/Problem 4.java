import java.util.Scanner;


  class Test{

    public static void main(String[] args){
        System.out.println("enter a number of days:");
        Scanner input=new Scanner(System.in);
        int days = input.nextInt();
        int weeks = days /7;
        int remainingDays = days % 7;
        System.out.println(weeks + " weeks and " + remainingDays + " days.");
            



    }
  }
