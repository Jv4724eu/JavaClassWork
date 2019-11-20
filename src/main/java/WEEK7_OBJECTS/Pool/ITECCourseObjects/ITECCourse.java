package WEEK7_OBJECTS.Pool.ITECCourseObjects;

import java.util.ArrayList;
import java.util.List;

public class ITECCourse {
    //declare fields
    private String name;
    private int code;
    private List<String> students;
    private int maxStudents;

    public ITECCourse (String name, int Code, int maxStudents){
        this.name = name;
        this.code = code;
        this.maxStudents = maxStudents;
        students = new ArrayList<>();
    }

    public void addStudent(String studentName){
        if (students.size() < maxStudents){
            students.add(studentName);
            System.out.println(studentName + " has been added!");
        } else {
            System.out.println("max has been met, cannot add " + studentName);
        }
    }

    int getNumberOFStudents(){
            return students.size();
    }

    public void removeStudentsByName(String studentName){
        if (students.contains(studentName)){
            students.remove(studentName);
            System.out.println(studentName + " was removed");
        } else {
            System.out.println(studentName + " is not in the class");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getStudents() {
        return students;
    }

    public void setStudents(List<String> students) {
        this.students = students;
    }

    public int getMaxStudents() {
        return maxStudents;
    }

    public void setMaxStudents(int maxStudents) {
        this.maxStudents = maxStudents;
    }
}
