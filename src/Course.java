/*
* Design a COurce class.
* instance variable: courceName, enrolledStudents.
* Static variable: maxCapacity, the maximum number of students for any course.
* instance method: enrollStudent(String studentName) unenrollStudent(String studentName).
* static method: setMaxCapacity(int capacity), to set the maximun capacity for courses
* */
public class Course {

    static int maxCapacity = 0;

    String courceName;
    String enrolledStudentName;
    boolean isEnrolled;

    public static void setMaxCapacity(int maxCapacity){
        Course.maxCapacity = maxCapacity;
    }

    public void enrollStudent(String enrolledStudentName, String  courceName){
        if(!isEnrolled) {
            this.enrolledStudentName = enrolledStudentName;
            this.courceName = courceName;
            isEnrolled = true;
        }else  {
            System.out.println("Student already enrolled");
        }

    }

    public void unenrollStudent(){
        if(!isEnrolled) {
            System.out.println("student is not enrolled");
        }else  {
            System.out.println("student succesfully unenrolled");
            isEnrolled = false;
        }
    }
}
