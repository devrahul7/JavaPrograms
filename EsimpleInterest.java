// Write a program to calculate SI. 
// Formula Simple Interest = (PrincipleAmount*Time*Rate/100);


import java.util.Scanner;
public class EsimpleInterest {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the principle:-  ");
        int principleAmount = scanner.nextInt();

        System.out.print("Enter the rate:-  ");
        float rate = scanner.nextFloat();

        System.out.print("Enter the time:-  ");
        int time = scanner.nextInt();

        scanner.close();

        int Si = (int) ( principleAmount * time * rate /100);
        System.out.println("Your simple interest monthly is :- " + Si);
    }
    }
