/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import com.example.myJavaProject.Course;

/**
 *
 * @author Shrey B Soni
 */
public class Student {

    // public student class

    final static double P = 50.00; // constant declaration for grade P
    final static double C = 65.00; // constant declaration for grade C
    final static double D = 75.00; // constant declaration for grade D
    final static double HD = 85.00; // constant declaration for grade HD

    private String studentName; // Declaration of Private string for Name of Student
    private String studentID;  // Declaration of Private string for Name of Student
    private double assignmentOneMarks; // Declaration of Private string for Name of Student
    private double assignmentTwoMarks; // Declaration of Private string for Name of Student
    private double projectMark; // Declaration of Private string for Name of Student
    private double individualTotalMarks; // Declaration of Private string for Name of Student
    private String grade; // Declaration of Private string for Name of Student

   Course obj = new Course();


    // constructor:Default construct a Student copying in the data into the instance variables
    public Student() {
        this.studentName =null;
        this.studentID = null;
        this.assignmentOneMarks = 0;
        this.assignmentTwoMarks = 0;
        this.projectMark = 0;
        this.individualTotalMarks = 0;
        this.grade = null;



    }

    // constructor:Parametarized construct a Student copying in the data into the instance variables
    public Student(String studentName, String studentID, double assignmentOneMarks, double assignmentTwoMarks, double projectMark, double individualTotalMarks, String grade) {
        this.studentName = studentName;
        this.studentID = studentID;
        this.assignmentOneMarks = assignmentOneMarks;
        this.assignmentTwoMarks = assignmentTwoMarks;
        this.projectMark = projectMark;
        this.individualTotalMarks = individualTotalMarks;
        this.grade = grade;

        //object of course class is created everytime a Student class object is created
        //obj = new Course();
    }
// method to set Name



    public void setstudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setstudentID(String studentID) {
        this.studentID = studentID;
    }

    public void setassignmentOneMarks(double assignmentOneMarks) {
        this.assignmentOneMarks = assignmentOneMarks;
    }

    public void setassignmentTwoMarks(double assignmentTwoMarks) {
        this.assignmentTwoMarks = assignmentTwoMarks;
    }

    public void setprojectMark(double projectMark) {
        this.projectMark = projectMark;
    }

    public void setindividualTotalMarks (double individualTotalMarks) {
        this.individualTotalMarks = individualTotalMarks;
    }

    public void setgrade (String grade ) {
        this.grade = grade;
    }


    public void setStudentCourse(String courseName)
    {
        obj.setCourseName(courseName);
    }

    public void setStudentCourseCode(String courseCode)
    {
        obj.setCourseCode(courseCode);
    }


    public String getStudentCourse() {
        return obj.getCourseName();
    }

    public String getStudentID() {
        return obj.getCourseCode();
    }

    public String getstudentName() {
        return studentName;
    }

    public String getstudentID() {
        return studentID;
    }

    public double getassignmentOneMarks() {
        return assignmentOneMarks;
    }

    public double getassignmentTwoMarks() {
        return assignmentTwoMarks;
    }

    public double getprojectMark() {
        return projectMark;
    }

    public double getindividualTotalMarks () {
        return individualTotalMarks;
    }

    public String getgrade () {
        return grade;
    }

    public double calculateIndividualTotalMarks (double assignmentOneMarks, double assignmentTwoMarks, double projectMark) {
        return assignmentOneMarks + assignmentTwoMarks + projectMark;
    }

    public String calculateGrade(double totalMarks){
        String grade = "not valid";
        if (totalMarks < P ){
            grade = "F";
            System.out.println("F");
        } if ((totalMarks >=P) && (totalMarks <C)) {
            grade = "P";
        } if ((totalMarks >= C) && (totalMarks <D)){
            grade = "C";
        } if ((totalMarks >= D) && (totalMarks <HD)) {
            grade = "D";
        } if (totalMarks >=HD){
            grade = "HD";
        }
        return grade;



    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", studentID='" + studentID + '\'' +
                ", assignmentOneMarks=" + assignmentOneMarks +
                ", assignmentTwoMarks=" + assignmentTwoMarks +
                ", projectMark=" + projectMark +
                ", individualTotalMarks=" + individualTotalMarks +
                ", grade='" + grade + '\'' +
                ", courseName= "+obj.getCourseName()+
                ", courseCode= "+obj.getCourseCode()+
                '}';
    }






}






