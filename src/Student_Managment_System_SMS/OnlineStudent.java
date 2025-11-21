package Student_Managment_System_SMS;

public class OnlineStudent extends Student{
    private double attendancePercentage;

    public OnlineStudent(int id, String name, double marks,double attendancePercentage) {
        super(id, name, marks);
    }

    @Override
    public String calculateGrade() {
        String baseGrade = super.calculateGrade();
        if(attendancePercentage < 60){
            return baseGrade + " (Attendance Low)";
        }
        return baseGrade;
    }
}
