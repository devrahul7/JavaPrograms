// 3. Write a JAVA program to check whether a number is divisible by 5 and 11 or not.

import java.util.Scanner;

public class Cdivisible {

    public static void main (String args []){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scanner.nextInt();
        
        if (num%11 == 0 | num %5 == 0){
            System.out.println("YES DIVISIBLE");
        } else {
            System.out.println("NO DIVISIBLE");

        }
    } 
}




