import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {

        //Declare variables with no value
        String firstName;
        String middleName;
        String lastName;
        String suffix;
        String fullName;
        Scanner scanner = new Scanner(System.in);
        // create scanner that reads the next line

        System.out.print("Enter First Name: ");
        firstName = scanner.nextLine().trim();
        // Read the next line
        // remove all empty spacing before and after a sentence assign it to firstName

        System.out.print("Enter Middle Name: ");
        middleName = scanner.nextLine().trim(); ;
        // Read the next line and assign it to middleName
        // remove all empty spacing before and after a sentence assign it to middleName

        System.out.print("Enter Last Name: ");
        lastName = scanner.nextLine().trim(); ;
        // Read the next line and assign it to lastName
        // remove all empty spacing before and after a sentence assign it to lastName

        System.out.print("Enter Suffix: ");
        suffix = scanner.nextLine().trim(); ;
        // Read the next line and assign it to suffix
        // remove all empty spacing before and after a sentence assign it to

        fullName = firstName; // sets firstName to fullName

        if (!middleName.isBlank()) { // If middle name is not(!) blank (.isBlank())
            fullName = fullName + " " + middleName + " "; // full name is fullName middleName
        }
        fullName = fullName + " " + lastName;

        if (!suffix.isBlank()) { // suffix is not (!) blank (.isBlank())
            fullName = fullName + ", " + suffix; // fullName is fullName , suffix
        }
        System.out.println(fullName);
    }

}
