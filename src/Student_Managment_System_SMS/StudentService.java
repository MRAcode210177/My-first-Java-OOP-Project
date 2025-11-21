package Student_Managment_System_SMS;

import java.util.ArrayList;
import java.util.List;

public class StudentService {
    private List<Student> students = new ArrayList<>();

    public void addStudent(Student student){
        students.add(student);
    }
    public Student getStudent(int id){
        return students.stream()
                .filter(s -> s.getId() == id)
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Student not found"));
    }

    public void deleteStudent(int id){
        Student s = getStudent(id);
        students.remove(s);
    }

    public List<Student> getAllStudents(){
        return students;
    }
}
