import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {

        String firstName;
        String middleName;
        String lastName;
        String suffix;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter First Name: ");
        firstName = scanner.nextLine();

        System.out.print("Enter Middle Name: ");
        middleName = scanner.nextLine();

        System.out.print("Enter Last Name: ");
        lastName = scanner.nextLine();

        System.out.print("Enter Suffix: ");
        suffix = scanner.nextLine();

        String fullName = firstName.trim(); // in case they entered "   Coral    "

        if (!middleName.isBlank()) {    //is blank
            fullName = fullName + " " + middleName.trim() +" ";
        }

        fullName = fullName + lastName;

        if (!suffix.isBlank()) {
            fullName = fullName + ", " + suffix.trim();
        }
        System.out.println(fullName);





    }

    public FullNameApplication() {


    }

    public  void doSomething() {


    }

    public static void something() {


    }

}
