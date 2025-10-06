package Student_Record;

public class Student {
    private int studentId;
    private String name;

    public Student(String name,int studentId){
        this.name= name;
        this.studentId= studentId;
    }
    public double calculateFinalGrade(double midterm,double finalExam){
        double sum = midterm + finalExam ;
        System.out.println("\nGrade Calculation: Two scores (Midterm, Final)");
        return sum/2;
    }
    public double calculateFinalGrade(double midterm,double finalExam,double projectScore){
        double weightedScore = (midterm * 0.3) + (finalExam * 0.5) + (projectScore * 0.2);
        double sumofWeight = 0.3 + 0.5 + 0.2;
        System.out.println("\nGrade Calculation: Weighted Average (30/50/20)");
        return weightedScore/sumofWeight;
    }
    public double calculateFinalGrade(int score1, int score2, int score3, int score4){
        int sumScore = score1 + score2 + score3 + score4 ;
        System.out.println("\nGrade Calculation: Four Quizzes");
        return (double) sumScore /4;
    }

    public static void main (String[] args){
        Student alice = new Student("Alice" , 1001);
        // Test Overload 1 (double, double)
        double grade1 = alice.calculateFinalGrade(85.0, 95.0);
        System.out.printf("Average of two exams: %.2f\n", grade1);

        // Test Overload 2 (double, double, double)
        double grade2 = alice.calculateFinalGrade(70.0, 90.0, 100.0);
        System.out.printf("Weighted final grade: %.2f\n", grade2);
        // (70*0.3) + (90*0.5) + (100*0.2) = 21 + 45 + 20 = 86.0

        // Test Overload 3 (int, int, int, int)
        double grade3 = alice.calculateFinalGrade(92, 88, 90, 94);
        System.out.printf("Average of four quizzes: %.2f\n", grade3);
    }

}
