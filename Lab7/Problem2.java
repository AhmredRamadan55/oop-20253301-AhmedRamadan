import java.util.Scanner;

class Student {
    private String studentName;
    private String studentID;
    private double grade;

    public Student() {
        this("", "", 0.0);
    }

    public Student(String studentName, String studentID, double grade) {
        this.studentName = studentName;
        this.studentID = studentID;
        this.grade = grade;
    }

    public void updateGrade(double newGrade) {
        grade = newGrade;
    }

    public boolean isPassed() {
        return grade >= 50.0;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }
}

public class Problem2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();
        input.nextLine();

        if (numberOfStudents <= 0) {
            System.out.println("The number of students must be positive.");
            input.close();
            return;
        }

        Student[] students = new Student[numberOfStudents];
        for (int i = 0; i < students.length; i++) {
            System.out.println("Enter information for student " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = input.nextLine();
            System.out.print("ID: ");
            String id = input.nextLine();
            System.out.print("Grade: ");
            double grade = input.nextDouble();
            input.nextLine();

            students[i] = new Student(name, id, grade);
        }

        System.out.print("Enter the index of the student to update (0 to "
                + (students.length - 1) + "): ");
        int index = input.nextInt();
        System.out.print("Enter the new grade: ");
        students[index].updateGrade(input.nextDouble());

        for (Student student : students) {
            System.out.println("Name: " + student.getStudentName());
            System.out.println("ID: " + student.getStudentID());
            System.out.println("Grade: " + student.getGrade());
            System.out.println("Status: " + (student.isPassed() ? "Passed" : "Failed"));
        }

        input.close();
    }
}
