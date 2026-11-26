public class Question1 {
    public static void displayStudent(Student student) {
        System.out.println("Student ID: " + student.getStudentID());
        System.out.println("Student name: " + student.getStudentName());
        System.out.println("GPA: " + student.getGPA());
        System.out.println("Honor student: " + student.isHonorStudent());
    }

    public static void main(String[] args) {
        Student firstStudent = new Student("20253301", "Ahmed Ramadan", 3.4);
        Student secondStudent = new Student();
        secondStudent.setGPA(3.8);

        System.out.println("First student:");
        displayStudent(firstStudent);

        System.out.println("\nSecond student:");
        displayStudent(secondStudent);
    }
}

class Student {
    private String studentID;
    private String studentName;
    private double GPA;

    public Student() {
        studentID = "000";
        studentName = "Unknown";
        GPA = 0.0;
    }

    public Student(String studentID, String studentName, double GPA) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.GPA = GPA;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    public boolean isHonorStudent() {
        return GPA >= 3.5;
    }
}
