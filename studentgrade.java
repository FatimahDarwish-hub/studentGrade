
package studentgrade;


import java.util.Scanner;
public class StudentGrade {



    
    public static void main(String[] args) {
        int quizScore, midtermScore,  finalScore, totalScore ;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Quiz score: ");
        quizScore = input.nextInt();
        System.out.println("Enter Mid-term score: ");
        midtermScore = input.nextInt();
        System.out.println("Enter Final score: ");
        finalScore = input.nextInt();
        
        totalScore = quizScore + midtermScore + finalScore;
        if(totalScore>100 || totalScore<0)
            System.out.println("Error score must be between 0 and 100 ");
        
        else if(totalScore>= 90 )
            System.out.println("the grade is A");
        else if(totalScore>=70 && totalScore <90)
            System.out.println("the grade is B");
        else if(totalScore >=50 && totalScore <70)
            System.out.println("the grade is C");
        else if(totalScore < 50)
            System.out.println("the grade is F");
        
    }
    
}
