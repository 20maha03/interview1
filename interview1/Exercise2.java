import java.util.*;

public class Exercise2 {

    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the size of the first string:");
        int firstStringLength = input.nextInt();
       

        System.out.println("Enter the first string:");
        String firstString = input.next();

        System.out.println("Enter the size of the second string:");
        int secondStringLength = input.nextInt();
  

        System.out.println("Enter the second string:");
        String secondString = input.next();

        int totalLength = firstStringLength + secondStringLength;

        char[] finalString = new char[totalLength];

        for (int i = 0; i < firstStringLength; i++) {
            finalString[i] = firstString.charAt(i);
        }

        for (int i = 0; i < secondStringLength; i++) {
            finalString[firstStringLength + i] = secondString.charAt(i);
        }

        System.out.println("Result is: " + new String(finalString));
    }
}
