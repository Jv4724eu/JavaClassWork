package WEEK7_OBJECTS.Pool.ITECCourseObjects;

public class main {
    public static void main(String[] args) {
        ITECCourse java = new ITECCourse("Java Programming",2545, 24);

        java.addStudent("Kitty");
        java.addStudent("Drew");
        java.addStudent("Opal");

        System.out.println("Number of students: " + java.getNumberOFStudents());

        ITECCourse softwareDev = new ITECCourse("Software Development Projects",2903, 24);
        softwareDev.addStudent("Gus");
        softwareDev.addStudent("Harry");
        softwareDev.addStudent("Izzy");

        System.out.println("Number of Students: " + softwareDev.getNumberOFStudents());

        softwareDev.addStudent("Kelsey");
        System.out.println("Number of students: " + softwareDev.getNumberOFStudents());

        softwareDev.removeStudentsByName("Izzy");
        softwareDev.removeStudentsByName("Mary");


        ITECCourse smallSize = new ITECCourse("small course", 1234, 3);
        smallSize.addStudent("a");
        smallSize.addStudent("b");
        smallSize.addStudent("c");
        smallSize.addStudent("d");


        System.out.println(smallSize.getName());

    }
}
