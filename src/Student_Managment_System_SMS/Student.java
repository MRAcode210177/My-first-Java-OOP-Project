package Student_Managment_System_SMS;

public class Student {
    private int id;
    private String name;
    private double marks;

    public Student(int id ,String name ,double marks){
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    //SETTERS
    public void setId(int id) {
        this.id = id;
    }
    public void setMarks(int marks){
        this.marks = marks;
    }

    //GETTERS
    public int getId(){
        return id;
    }
    public String getName(){
        return getName();
    }

    public double getMarks() {
        return marks;
    }

    //METHOD
    public String calculateGrade(){
        if(marks >= 75) return "A";
        else if (marks >= 65) return "B";
        else if (marks >= 55) return "C";
        else return "D";


    }

    @Override
    public String toString() {
        return id + " - " + name + " (" + calculateGrade() + ")";
    }
}
