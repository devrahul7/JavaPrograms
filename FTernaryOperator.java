// Write the ternary operator for to check whether a person can cast a vote or not. 
// The condition is you must be over 18 years old to vote.

// writing the java basics progra
class FTernaryOperator {
    public static void main(String[] args) {
        int age = 19;

        String eligibility = (age >= 18) ? "Eligible" : "Not Eligible";
        System.out.println("Voting Status:-  " + eligibility + " to vote.");
    }

}