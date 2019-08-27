
package lettergradecalculator;

import java.util.Scanner; // Importing the Scanner

public class LetterGradeCalculator
{


    
    public static int max (int num1, int num2) {
            int big;
            
            if (num1 > num2)
                big = num1;
            else
                big = num2;
            return big;

        }
    
    
   

    public static double computeRawPercentage(int bestQuiz, int bestExam)
    {
        return ((bestQuiz* .4)+ (bestExam * .6));
        
    }
    
    
    
    public static char finalGrade(double score) {
        char letterGrade;
        letterGrade = ' '; 
        if (score >= 90) {
            letterGrade = 'A';
        } else if (score >= 80 && score <= 89) {
            letterGrade = 'B';
        } else if (score >= 70 && score <= 79) {
            letterGrade = 'C';
        } else if (score >= 60 && score <= 69) {
            letterGrade = 'D';
        } else if (score <= 50) {
            letterGrade = 'F';
        }
        return letterGrade; 
    }
    
    
    
    public static void main(String[] args)
    {
        Scanner kbd;
        kbd = new Scanner( System.in );
        String studentName;
        String studentId;
        int q1;
        int q2;
        int e1;
        int e2;
        int bestQuiz;
        int bestExam;
        double score;
        char letterGrade;
        
        // Ask user for student name, id number, 2 quiz scores, and 2 exam scores.
        System.out.print("Enter student name: ");
        studentName = kbd.nextLine();
        
        System.out.print("Enter student id: ");
        studentId = kbd.nextLine();
        
        System.out.print("Enter the quiz scores: ");
        q1 = kbd.nextInt();
        q2 = kbd.nextInt();
        
        System.out.print("Enter the exam scores: ");
        e1 = kbd.nextInt();
        e2 = kbd.nextInt();
        
        
        // Use max method on the scores
        bestQuiz = max(q1,q2);
        bestExam = max(e1,e2);
        
        // Get the total score using the computeRawPercentage method 
        score = computeRawPercentage(bestQuiz, bestExam);

        // Get letter grade for the score 
        letterGrade = finalGrade(score);
        
        // Output the score 
        System.out.print(studentName + " " + studentId + " ");
        System.out.println("Final Grade: " + letterGrade);
        
        
        
        
    }
        
       
        
        
    }
    
