import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[][] students = new String[3][2];
        int gradeACount = 0;

        System.out.println("Enter name and grade for 3 students:");
        for (int i = 0; i < students.length; i++) {
            students[i][0] = input.next();
            students[i][1] = input.next();
        }

        for (int i = 0; i < students.length; i++) {
            String studentInfo = students[i][0].concat(": ").concat(students[i][1]);
            System.out.println(studentInfo);
            if (students[i][1].equalsIgnoreCase("A")) {
                gradeACount++;
            }
        }

        System.out.println("Students with grade A: " + gradeACount);

        System.out.print("Enter first letter: ");
        String prefix = input.next();
        int namesStartingWithPrefix = 0;
        for (int i = 0; i < students.length; i++) {
            if (students[i][0].startsWith(prefix)) {
                namesStartingWithPrefix++;
            }
        }

        System.out.println("Names starting with " + prefix + ": "
                + namesStartingWithPrefix);
        input.close();
    }
}
