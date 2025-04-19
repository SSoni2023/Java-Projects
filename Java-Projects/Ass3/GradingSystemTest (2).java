/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.ArrayList;
import java.util.Scanner;
/**
 *student name: Shrey Soni
 *student id: 12194206
 * studentEmail: shrey.soni@cqumail.com
 * file name: GradingSystem
 * purpose of the class: student grading program
 */

public class GradingSystemTest {

    final static int ASSIGNMENT1_LIMIT = 20;
    final static int ASSIGNMENT2_LIMIT = 30;
    final static int ASSIGNMENT3_LIMIT = 50;
    final static ArrayList<Student> list = new ArrayList<>(); //arraylist of student objects.



    //update student record
    public static void updateRecords(ArrayList<Student> list,String name,String id)
    {
            int index = searchRecords(list,name,id);

        if(index!=-1) {

            System.out.println("Enter 1 to update the name ");
            System.out.println("Enter 2 to update the ID ");
            System.out.println("Enter 3 to update the assignmentOneMarks ");
            System.out.println("Enter 4 to update the assignmentTwoMarks ");
            System.out.println("Enter 5 to update the projectMark...");

            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();

            //to skip the nextline character
            sc.nextLine();

            if(choice == 1) {
                System.out.println("Enter the new name ");
                String newName = sc.nextLine();
                Student st = list.get(index);  //returns a student object
                st.setstudentName(newName);
                list.set(index,st); //overriding with the new values

            }
            else if(choice==2)
            {
                System.out.println("Enter the new ID ");
                String newID = sc.nextLine();
                Student st = list.get(index);  //returns a student object
                st.setstudentID(newID);
                list.set(index,st); //overriding with the new values

            }
            else if(choice==3) {
                System.out.println("Enter the new assignment one marks ");
                int newMarksOne = sc.nextInt();

                boolean validInput = true;
                while(validInput){
                    if(newMarksOne<=ASSIGNMENT1_LIMIT){
                        validInput = false;
                    }
                    else{
                        System.out.println("ERROR Assignment one mark need to be within the range of 0 to 20");
                        newMarksOne = sc.nextInt();
                    }
                }


                Student st = list.get(index);  //returns a student object
                st.setassignmentOneMarks(newMarksOne);


                double total = st.calculateIndividualTotalMarks(st.getassignmentOneMarks(),st.getassignmentTwoMarks(),st.getprojectMark()); // we have to update the total marks as well
                st.setindividualTotalMarks(total);
               String grade = st.calculateGrade(total);
               st.setgrade(grade);

                list.set(index,st); //overriding with the new values
            }

            else if(choice ==4)
            {
                System.out.println("Enter the new assignment two marks ");
                int newMarksTwo = sc.nextInt();

               boolean validInput = true;
                while(validInput){
                    if(newMarksTwo<=ASSIGNMENT2_LIMIT){
                        validInput = false;
                    }
                    else{
                        System.out.println("ERROR Assignment two mark need to be within the range of 0 to 30");
                        newMarksTwo = sc.nextInt();
                    }
                }



                Student st = list.get(index);  //returns a student object
                st.setassignmentTwoMarks(newMarksTwo);


                double total = st.calculateIndividualTotalMarks(st.getassignmentOneMarks(),st.getassignmentTwoMarks(),st.getprojectMark()); // we have to update the total marks as well
                st.setindividualTotalMarks(total);
                String grade = st.calculateGrade(total);
                st.setgrade(grade);

                list.set(index,st); //overriding with the new values
            }

            else if(choice==5)
            {
                System.out.println("Enter the new project  marks ");
                int newProjectMarks = sc.nextInt();

                boolean validInput = true;

                while(validInput){
                    if(newProjectMarks <=ASSIGNMENT3_LIMIT){
                        validInput = false;
                    }
                    else{
                        System.out.println("ERROR final projects mark need to be within the range of 0 to 50");
                        newProjectMarks = sc.nextInt();
                    }
                }



                Student st = list.get(index);  //returns a student object
                st.setprojectMark(newProjectMarks);

                double total = st.calculateIndividualTotalMarks(st.getassignmentOneMarks(),st.getassignmentTwoMarks(),st.getprojectMark()); // we have to update the total marks as well
                st.setindividualTotalMarks(total);
                String grade = st.calculateGrade(total);
                st.setgrade(grade);

                list.set(index,st); //overriding with the new values


            }
            else
                System.out.println("Wrong choice entered...");


        }

    }


    //delete records
    public static void deleteRecords(ArrayList<Student>list,String name,String id)
    {
        int index = searchRecords(list,name,id);

        if(index!=-1) {

            list.remove(index); //deleting the record
            System.out.println("Student record deleted");
        }
        else
            System.out.println("Student record not found");


    }


    public static int searchRecords(ArrayList<Student> list,String name,String id)
    {
        if (list.isEmpty()) {
            System.out.println(" Error: No records exist to search... ");
            return -1;
        } else {

            boolean found = false; //flag to check if the record is found or not
            for (int i = 0; i < list.size(); i++) {

                //if the name and id is matched
                if (list.get(i).getstudentName().equalsIgnoreCase(name) && list.get(i).getstudentID().equalsIgnoreCase(id)) {

                    return i; //returning the index

                }


            }

            return -1;

        }
    }

    //using  bubble sort to sort the records
    public static void sortMyRecords(ArrayList<Student> list)
    {
        for (int i = 0; i < list.size()-1; i++) {

            for (int j = i+1; j < list.size(); j++) {
                if (list.get(i).getstudentName().compareToIgnoreCase(list.get(j).getstudentName()) >0) {

                    Student tmp = list.get(i);
                    list.set(i,list.get(j));
                    list.set(j,tmp);

                }

                //if by chance names are same we compare based on their IDs
                else if (list.get(i).getstudentName().compareToIgnoreCase(list.get(j).getstudentName()) == 0)
                {
                if(list.get(i).getstudentID().compareToIgnoreCase(list.get(j).getstudentID()) >0)
                {
                    Student tmp = list.get(i);
                    list.set(i,list.get(j));
                    list.set(j,tmp);
                }

                }
            }


        }
    }

    public static void printList(ArrayList<Student> list)
    {
        //printing the student records
        for(int i=0;i<list.size();i++)
        {
            System.out.println(list.get(i).toString()); //list.get() will give us the student object and then applying toString() for each  object
        }
    }




    // main method begins execution of Java application
    public static void main (String [] args) {

        System.out.println ("Welocme to COIT20245 Grading System");

        Scanner inputText= new Scanner(System.in); // create a scanner to obtain inputText from the command window
        Scanner inputNum = new Scanner (System.in); // create a scanner to obtain inputNum from the command window
        // student's
        boolean validInput = true;
        int minValue = Integer.MIN_VALUE ;
        int maxValue = Integer.MAX_VALUE;

        String minMarksStudentName = "";
        String maxMarksStudentName = "";
        String minMarksStudentID = "";
        String maxMarksStudentID = "";
        float averageMarks = 0;

        System.out.println("Enter number of Student records you want to store");
        int N = inputNum.nextInt();

        for(int i=1;i<=N;i++){
            System.out.println("Please enter student name " + i + "==> " );
            String studentName = inputText.nextLine();

            while(validInput){
                if(studentName.trim() == "") {
                    System.out.println("ERROR student name cannot be blank.");
                    studentName = inputText.nextLine();
                }
                else{
                    validInput = false;
                }
            }
            validInput = true;

            System.out.println("Please enter student id of student " + studentName + " ==> " );
            String studentID = inputText.nextLine();
            while(validInput){
                if(studentID.trim() == "") {
                    System.out.println("ERROR student ID cannot be blank.");
                    studentID = inputText.nextLine();
                }
                else{
                    validInput = false;
                }
            }
            validInput = true;


            System.out.println("Enter the course name student "+studentName +" want to take ==>");
            String courseName = inputText.nextLine();

            System.out.println("Enter the course code of the course ");
            String courseCode = inputText.nextLine();




            System.out.println("Please enter assignment one mark  of student " + studentName + " ==> ");
            int assignmentOne = inputNum.nextInt(); // read the first assignmentOne number from user
            while(validInput){
                if(assignmentOne<=ASSIGNMENT1_LIMIT){
                    validInput = false;
                }
                else{
                    System.out.println("ERROR Assignment one mark need to be within the range of 0 to 20");
                    assignmentOne = inputNum.nextInt();
                }
            }
            validInput = true;
            System.out.println("Please enter assignment two mark  of  student " + studentName + "==> ");
            int assignmentTwo = inputNum.nextInt();
            while(validInput){
                if(assignmentTwo<=ASSIGNMENT2_LIMIT){
                    validInput = false;
                }
                else{
                    System.out.println("ERROR Assignment two mark need to be within the range of 0 to 30");
                    assignmentTwo = inputNum.nextInt();
                }
            }
            validInput = true;
            System.out.println("Please enter assignment final project mark of student " + studentName + "==>");
            int finalProject = inputNum.nextInt();
            while(validInput){
                if(finalProject <=ASSIGNMENT3_LIMIT){
                    validInput = false;
                }
                else{
                    System.out.println("ERROR final projects mark need to be within the range of 0 to 50");
                    finalProject = inputNum.nextInt();
                }
            }
            int totalMarks = assignmentOne + assignmentTwo + finalProject;
            averageMarks += totalMarks;

            if(i == 1){
                minValue=totalMarks;
                maxValue=totalMarks;
                minMarksStudentName=studentName;
                maxMarksStudentName= studentName;
                minMarksStudentID = studentID;
                maxMarksStudentID = studentID;
            }
            else if (totalMarks <= minValue){
                minValue=totalMarks;
                minMarksStudentName=studentName;
                minMarksStudentID = studentID;
            }
            else if(totalMarks >= maxValue) {
                maxValue=totalMarks;
                maxMarksStudentName= studentName;
                maxMarksStudentID = studentID;
            }

            String grade = "not valid";
            if (totalMarks < 50){
                grade = "F";
                System.out.println("F");
            } if ((totalMarks >=50) && (totalMarks <65)) {
                grade = "P";
            } if ((totalMarks >= 65) && (totalMarks <75)){
                grade = "C";
            } if ((totalMarks >= 75) && (totalMarks <85)) {
                grade = "D";
            } if (totalMarks >=85){
                grade = "HD";
            }

            System.out.println("The grade of " + studentName + " with " + "student number " + studentID + " is : " + grade + " with total marks of " + totalMarks );

            //student object is getting created
            Student st = new Student();

            //setting all the values for that student
            st.setstudentName(studentName);
            st.setstudentID(studentID);
            st.setassignmentOneMarks(assignmentOne);
            st.setassignmentTwoMarks(assignmentTwo);
            st.setprojectMark(finalProject);
            st.setindividualTotalMarks(totalMarks);
            st.setgrade(grade);

            st.setStudentCourse(courseName);
            st.setStudentCourseCode(courseCode);


            //adding record into our arrayList
            list.add(st);

        }

        averageMarks = averageMarks/N;
        System.out.println("Statistical information of COIT2045 Grading System: ");
        System.out.println("");
        System.out.println("The student " + minMarksStudentName + " with student number " + minMarksStudentID + " has received minimum marks which is " + minValue);
        System.out.println("The student " + maxMarksStudentName + " with student number " + maxMarksStudentID + " has received maximum marks which is " + maxValue);
        System.out.println("The average marks for COIT2045 T2-2021 cohort is: " + averageMarks + " marks");


        //writing a menu

        while(true)
        {

            System.out.println("Enter 1 to search the records ");
            System.out.println("Enter 2 to sort the student records ");
            System.out.println("Enter 3 to display all the student records ");
            System.out.println("Enter 4 to update a record ");
            System.out.println("Enter 5 to delete a record ");
            System.out.println("Enter 6 to exit...");

            int choice = inputNum.nextInt();
            if(choice == 1) {

                String name, id;
                Scanner sc = new Scanner(System.in);
                System.out.println(" Enter name of the student..");
                name = sc.nextLine();

                System.out.println(" Enter ID of this student..");
                id = sc.nextLine();

               int index = searchRecords(list,name,id);

                if(index!=-1) {
                    System.out.println("Student found, here are the details: ");
                    System.out.println(list.get(index).toString());
                }
                else
                    System.out.println("Student record not found");

            }

            else if(choice == 2)
            {
                if (list.isEmpty()) {
                    System.out.println(" Error: No records exist to sort... ");
                }

                else if(list.size()==1)
                {
                    System.out.println(" Only one record exist to sort ");
                }

                else
                {
                    sortMyRecords(list);
                    System.out.println(" Records after sorting ");
                    printList(list);
                }

            }

            else if(choice == 3)
            {
                printList(list);
            }


            else if(choice == 4)
            {
                System.out.println("Enter the student info whose details you want to update....");
                Scanner sc = new Scanner(System.in);
                System.out.println(" Enter name of the student..");
                String name = sc.nextLine();

                System.out.println(" Enter ID of this student..");
                String id = sc.nextLine();

                updateRecords(list,name,id);
            }

            else if(choice == 5)
            {
                System.out.println("Enter the student whose record you want to delete....");
                Scanner sc = new Scanner(System.in);
                System.out.println(" Enter name of the student..");
                String name = sc.nextLine();

                System.out.println(" Enter ID of this student..");
                String id = sc.nextLine();

                deleteRecords(list,name,id);
            }

            else if(choice == 6)
                break;

            else
                 System.out.println("Wrong choice entered please enter again..");

        }





        System.out.println("Thank you for using COIT20245 Grading System");
        System.out.println("Program written by Shrey with student number: 12194206");

    }

}




