// TODO -- create header comments

//package gradingsystem; // you need to include this in each .java file if you want to package them together. For example packaging Student.java and GradingSystemMenu.java


import java.util.Scanner;


// TODO -- create the Student class (separate file: Student.java)

public class GradingSystemMenu
{

    final int ENTER_STUDENT_RECORD = 1;
    final int DISPLAY_GRADES = 2;
    final int DISPLAY_STATISTICS = 3;
    final int EXIT = 4;

	// TODO -- declare any further constants

	// TODO -- declare array of Student objects
	// TODO -- declare variable for the current record entered (integer)

    Scanner inputMenuChoice = new Scanner(System.in);

    private int getMenuItem()
    {
        System.out.println("\nPlease select from the following");
		System.out.println(ENTER_STUDENT_RECORD + ". Enter student's record");
		System.out.println(DISPLAY_GRADES + ". Display all students grade");
		System.out.println(DISPLAY_STATISTICS + ". Display Statistics");
		System.out.println(EXIT + ". Exit the application");
		System.out.print("Enter choice==> ");

        String choice = inputMenuChoice.nextLine();

        return Integer.parseInt(choice);
    }

    private void processingGradeingSystem()
    {
        int choice = getMenuItem();
		while (choice != EXIT)
		{
            switch (choice)
            {
            	case ENTER_STUDENT_RECORD:
                	enterStudentRcord();
					break;
            	case DISPLAY_GRADES:
					displayAllRecordsWithGrade();
					break;
            	case DISPLAY_STATISTICS:
					displayStatistics();
					break;
            	default:
					System.out.println("ERROR choice not recognised");
            }
		choice = getMenuItem();
        }
    }


	private void enterStudentRcord()
	{
		// TODO -- check if maximum record has been reached (do this after getting the other functionality working)

		// TODO -- read in the student's name and student's number (as a string)
		// TODO -- create validation loop (do this after getting the other functionality working)

		// TODO -- read assessments marks as double
		// TODO -- create validation loop (do this after getting the other functionality working)

		// TODO -- read in the number of students
		// TODO -- create validation loop (do this after getting the other functionality working)

		// TODO -- add the data to the array (use the new keyword and the parameterised constructor in student class)

		// TODO -- display the student name, student number, assessments marks

		// TODO -- increment the current booking variable for the next entry

	}

    private String getStudentNameFromUser()
	{
		Scanner inputStudentName = new Scanner(System.in);

		System.out.print("\nPlease enter the student name ==> ");

		return inputStudentName.nextLine();
	}

    private String getStudentNumberFromUser()
    {
		Scanner inputStudentNumber = new Scanner(System.in);

		System.out.print("\nPlease enter the student number ==> ");

		return inputStudentNumber.nextLine();
	}

    private double getAssignmentOneMarksFromUser()
    {
		Scanner inputAssignmentOneMarks = new Scanner(System.in);

		System.out.print("\nPlease enter your assignment one marks including decimal values ==> ");

		return inputAssignmentOneMarks.nextDouble();
	}

    private double getAssignmentTwoMarksFromUser()
    {
		Scanner inputAssignmentTwoMarks = new Scanner(System.in);

		System.out.print("\nPlease enter your assignment two marks including decimal values ==> ");

		return inputAssignmentTwoMarks.nextDouble();
	}

    private double getProjectMarksFromUser()
    {
		Scanner inputTakeHomeExamMarks = new Scanner(System.in);

		System.out.print("\nPlease enter your Examination marks including decimal values ==> ");

		return inputTakeHomeExamMarks.nextDouble();
	}

    private void displayHeading()
	{
		System.out.printf("%-15s%-20s%-20s%-20s%-15s", "Student Name", "Student number", "Assignment One", "Assignment Two", "Examination");
	}


    private void displayRecordDetails(int index)
	{
		// TODO -- check if there has been an record entered (do this after getting the other functionality working)

		// TODO -- display all of the entries entered so far (just display the current entries not the whole array, use the current booking variable as the termination condition)
	}

    private void displayAllRecordsWithGrade()
	{
		// TODO -- check if there has been an record entered (do this after getting the other functionality working)

		// TODO -- display all of the records entered so far with grade (just display the current entries not the whole array, use the current record variable as the termination condition)

	}

    private void displayStatistics()
    {

        // TODO -- check if there has been an record entered (do this after getting the other functionality working)

		// TODO -- loop though the current entries in the array and calculate and display the statistics
    }



    public static void main(String[] args)
    {
        GradingSystemMenu app = new GradingSystemMenu();

        // Entry welcome message goes here
        app.processingGradeingSystem();

		// Exit thank you message goes here
    }

}