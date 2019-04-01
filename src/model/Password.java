package model;

import java.util.Scanner;

public class Password {
    private final int MIN_PASSWORD_LENGTH = 8;

    private String password;
    private String passwordReEntry;
    private int passwordLength;

    private Scanner scanner = new Scanner(System.in);


    public void getPassword() {
        System.out.printf("\n%30s\n\n", "*******Password Validator********");
        do {
            System.out.print("Enter a password of 8 or more characters: ");
            password = scanner.nextLine();
            passwordLength = password.length();
            System.out.printf("%s %d\n\n", "The length of your password is:", passwordLength);
        } while (!isValidPasswordLength());
        System.out.print("Please re-enter the password: ");
        passwordReEntry = scanner.nextLine();
        if(isPasswordMatch()) {
            System.out.println("Congratulations! Your password has been validated.");
        } else {
            System.out.println("Your passwords do not match. They must be an exact match.");
        }
    }

    private boolean isValidPasswordLength() {
        boolean isValid = false;
        if (passwordLength >= MIN_PASSWORD_LENGTH) {
            isValid = true;
        } else {
            System.out.println("Your password has less than 8 characters. Please try again.");
        }
        return isValid;
    }

    private boolean isPasswordMatch() {
        boolean isMatch = false;
        if (passwordReEntry.equals(password)) {
            isMatch = true;
        }
        return isMatch;
    }
}
