// Write a program to check whether a person can cast a vote or not. 
// The condition is you must be over 18 years old to vote.

// writing the java basics program

import java.util.Scanner; //imports Scanner

public class CvoteOrNotVote {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // it creates object for scanner class
        System.out.print("Enter your age to check eligibility:- ");
        int age = scanner.nextInt();

        
        scanner.close(); //closes the scanner

        if (age>18){
            System.out.println("You can Vote");
        }else{
            System.out.println("Not Eligible to vote");  
        }
    }
    //if else is used to check the condition
}
