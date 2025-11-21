package Student_Managment_System_SMS;

public class Main {
    public static void main(String[] args) {

        StudentService service = new StudentService();

        Student s1 = new Student(1, "Abdullah", 80);
        Student s2 = new OnlineStudent(2, "Ramees", 70, 55);

        service.addStudent(s1);
        service.addStudent(s2);

        System.out.println("All Students:");
        service.getAllStudents().forEach(System.out::println);

        System.out.println("\nGet Student 1:");
        System.out.println(service.getStudent(1));

        System.out.println("\nDeleting Student 2...");
        service.deleteStudent(2);

        System.out.println("\nRemaining Students:");
        service.getAllStudents().forEach(System.out::println);
    }
}
