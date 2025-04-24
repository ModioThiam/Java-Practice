package oop;

public class Student {
    // private attributes for student
    private String name;
    private int studentID;
    private float GPA;
    private String major;

    // constructor for Student object
    public Student(String name, int studentID, float GPA, String major){
        this.name = name;
        this.studentID = studentID;
        this.GPA = GPA;
        this.major = major;
    }

    // encapsulation + getting/setting attributes
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID){
        this.studentID = studentID;
    }

    public float getGPA(){
        return GPA;
    }

    public void setGPA(float GPA){
        this.GPA = GPA;
    }

    public String getMajor(){
        return major;
    }

    public void setMajor(String major){
        this.major = major;
    }

    // actions
    public void enrollCourse(){

    }
    public void withdrawCourse(){

    }

    public static void main(String[] args){
        // main class for testing
        Student student1 = new Student("Amy", 1098, 4.0f, "English");

        System.out.println("Student Name: "+ student1.getName());
        System.out.println("Student GPA: "+ student1.getGPA());
        System.out.println("Student Major: "+ student1.getMajor());

        student1.setMajor("Computer Science");
        System.out.println("Updated Major: "+ student1.getMajor());
    }
    // actions = enroll in a course, display info
    // main method for testing
}
