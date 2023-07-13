/*If/else Statement
        Define a variable called myName and assign your name to it
        Using the if-else statement, print if the number of letters in your name is even or odd*/

public class Main {
    public static void main(String[] args) {
        String myName = "Sara";
        int numLetters = myName.length();

        if (numLetters % 2 == 0) {
            System.out.println("Le lettere sono pari");
        }else{
            System.out.println("Le lettere sono dispari");
        }
    }
}