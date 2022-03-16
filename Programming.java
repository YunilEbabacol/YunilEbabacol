package com.Project;
import java.util.*;

public class Programming {

  public static void main(String args []) {
  
                //creates an object of Scanner
  
                Scanner  inp = new Scanner(System.in);
                System.out.println("----------STUDENT INFORMATION----------");
   
                String ID_Number;
                String FirstName;
                String LastName;
                char MiddleInitial;  
                String Course;
                String YearLevel;
                String Section;
                double Prelim;
                double Midterm;
                double SemiFinal;
                double Final;
  
                //print the Student Information
  
                System.out.print("Enter your Student IDNumber: ");
                 ID_Number = inp.nextLine();
  
                System.out.print("Enter your First Name: ");
                FirstName = inp.nextLine();
  
                System.out.print("Enter your Last Name: ");
                LastName = inp.nextLine();
    
                System.out.print("Enter your Middle Initial: ");
                MiddleInitial = inp.nextLine().charAt(0);
 
                System.out.print("Enter your Course: ");
                Course = inp.nextLine();
 
                System.out.print("Enter your Year Level: ");
                YearLevel = inp.nextLine(); 
 
                System.out.print("Enter your Section: ");
                Section = inp.nextLine();

                System.out.print("Enter your Prelim Grade: ");
                Prelim = inp.nextDouble();
 
                System.out.print("Enter your Midterm Grade: ");
                Midterm = inp.nextDouble();
 
                System.out.print("Enter your Semi-Final Grade: ");
                SemiFinal = inp. nextDouble();
 
                System.out.print("Enter your Final Grade: ");
                Final = inp.nextDouble();
 
                 inp.close();
 
                 //println for the results

                 System.out.println();
                 System.out.println("----------RESULTS----------");
       
                 System.out.println(LastName + ", " + FirstName + ", " + MiddleInitial);
                 System.out.println(Course +  ", " +YearLevel + ", " +Section);
 
                 //For the Average of all grades
  
                 double Average_Grade = (Prelim + Midterm + SemiFinal + Final)/4;
                 System.out.println("Average Grade : " + Average_Grade);
  
                  inp.close();
  
  
  }
}
