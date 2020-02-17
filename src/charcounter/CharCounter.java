/*Get two Strings called inputEntry and inputCharacter from the user at the command line. 
Allow for the inputEntry String to be one or more words of input. 
Check that the inputCharacter String has a length of 1 and note these validations:

*If it doesn't, provide the user with suitable feedback and conclude the program.

*If the inputCharacter length is valid (i.e., it has a length of 1), 
use a while loop to check each position in the inputEntry variable and return 
the number of times the character occurs. 

For example, if the inputEntry is "test" and the inputCharacter is "e" you would
output: "There is 1 occurrence(s) of 'e' in test."
*/
package charcounter;

import java.util.Scanner;

public class CharCounter {

    public static void main(String[] args) {
        int charCount;
        int length;
        String inputEntry;
        String inputCharacter;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please enter a string.");
        inputEntry = input.nextLine();
        
        System.out.println("Please enter a character.");
        inputCharacter = input.nextLine();
        
        length = inputCharacter.length();
        charCount = inputEntry.length();
        
        if(length != 1){
            System.out.print("Please provide 1 character to count it's occurrence(s).");
            System.exit(0);
        }
        else {
            
            int i = 0, count = 0;
            while (i != charCount)
            {
                if (inputEntry.charAt(i) == inputCharacter.charAt (0)){
                    count++;
                    i++;
                }
                else {
                    i++;
                }
            }
            System.out.println("Total of " + count + " occurrence(s) in the string.");
        }
    }
}