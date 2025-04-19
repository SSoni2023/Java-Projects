/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;
import java.util.Scanner;
/**
 *student name: Shrey Soni
 *student id: 12194206
 * studentEmail: shrey.soni@cqumail.com
 * file name: GradingSystem 
 * purpose of the class: student grading program 
 */

public class GradingSystemTest {
  final static int N = 9 ; // The largest number of my student id is 9
  final static int ASSIGNMENT1_LIMIT = 20;
  final static int ASSIGNMENT2_LIMIT = 30;
  final static int ASSIGNMENT3_LIMIT = 50;
                      
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

            System.out.println("Please enter student number " + studentName + " ==> " );
            String studentNumber = inputText.nextLine();
            while(validInput){
                if(studentNumber.trim() == "") {
                    System.out.println("ERROR student number cannot be blank.");
                    studentNumber = inputText.nextLine(); 
             } 
             else{
                 validInput = false;
             }
            }
            validInput = true;
           
            System.out.println("Please enter assignment one mark  of " + studentName + " ==> ");
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
            System.out.println("Please enter assignment two mark  of  " + studentName + "==> ");
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
            System.out.println("Please enter assignment final project mark of " + studentName + "==>");
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
                minMarksStudentID = studentNumber;
                maxMarksStudentID = studentNumber;
            }
            else if (totalMarks <= minValue){
                minValue=totalMarks;
                minMarksStudentName=studentName;
                minMarksStudentID = studentNumber;
            } 
            else if(totalMarks >= maxValue) {
                maxValue=totalMarks;
                maxMarksStudentName= studentName;
                maxMarksStudentID = studentNumber;
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
             
            System.out.println("The grade of " + studentName + " with " + "student number " + studentNumber + " is :" + grade + " with total marks of " + totalMarks );
            }
            
            averageMarks = averageMarks/N;
            System.out.println("Statistical information of COIT2045 Grading System: ");
            System.out.println("");
            System.out.println("The student " + minMarksStudentName + " with student number " + minMarksStudentID + " has received minimum marks which is " + minValue);
            System.out.println("The student " + maxMarksStudentName + " with student number " + maxMarksStudentID + " has received maximum marks which is " + maxValue);
            System.out.println("The average marks for COIT2045 T2-2021 cohort is: " + averageMarks + " marks");
            
            System.out.println("Thank you for using COIT20245 Grading System");
            System.out.println("Program written by Shrey with student number: 12194206");
        
    }
 
    }

  


