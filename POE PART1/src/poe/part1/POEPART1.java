/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poe.part1;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class POEPART1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        

class Login{
    
    private String savedUsername;
    private String savedPassword;
    private Scanner scanner = new Scanner(System.in);

    // Main Menu - wording changed
    public void showMainMenu() {
        boolean runApplication = true;
        boolean accountCreated = false;

        while (runApplication) {
            System.out.println("========================================");
            System.out.println("   Move With Me - User Portal");
            System.out.println("========================================");
            
            if (!accountCreated) {
                System.out.println("1. Create Account");
                System.out.println("2. Close Application");
            } else {
                System.out.println("1. Sign In");
                System.out.println("2. Close Application");
            }
            
            System.out.println("========================================");
            System.out.print("Please select an option: ");
            String userChoice = scanner.nextLine().trim();

            if (userChoice.equals("1") && !accountCreated) {
                String outcome = createAccount();
                System.out.println(outcome);
                if (outcome.contains("successfully")) {
                    accountCreated = true;
                }
            } 
            else if (userChoice.equals("1") && accountCreated) {
                System.out.print("Enter username: ");
                String loginUsername = scanner.nextLine();
                System.out.print("Enter password: ");
                String loginPassword = scanner.nextLine();
                System.out.println(verifyLogin(loginUsername, loginPassword));
            }
            else if (userChoice.equals("2")) {
                System.out.println("Thank you for using Move With Me Portal. See you soon!");
                runApplication = false;
            } 
            else {
                System.out.println("Incorrect selection. Kindly try again.");
            }
        }
    }

    // Registration - wording completely changed
    public String createAccount() {
        System.out.print("Create a username (must contain '_' and max 5 characters): ");
        String username = scanner.nextLine();

        if (!isUsernameValid(username)) {
            return "Username is incorrectly formatted. It must contain an underscore and be no more than 5 characters.";
        }

        System.out.print("Create a password (min 8 chars, capital letter, number, special char): ");
        String password = scanner.nextLine();

        if (!isPasswordValid(password)) {
            return "Password does not meet the complexity requirements. Ensure it has at least 8 characters, a capital letter, a number and a special character.";
        }

        this.savedUsername = username;
        this.savedPassword = password;
        return "Account has been created successfully!";
    }

    // FIXED: Username check
    public boolean isUsernameValid(String username) {
        return username.contains("_") && username.length() <= 5;
    }

    // FIXED: Password check - this was buggy in your old code
    public boolean isPasswordValid(String password) {
        if (password.length() < 8) {
            return false;
        }
        boolean hasCapital = !password.equals(password.toLowerCase());
        boolean hasNumber = password.matches(".*\\d.*");
        boolean hasSpecial = password.matches(".*[!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>\\/?].*");
        
        return hasCapital && hasNumber && hasSpecial;
    }

    // Login check
    public String verifyLogin(String username, String password) {
        if (username.equals(savedUsername) && password.equals(savedPassword)) {
            return "Welcome " + username + ", you have successfully logged in!";
        } else {
            return "Login failed! Username or password is incorrect.";
        }
    }

            private void displayMenu() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
public class QuickChat{
    public static void main(String[] args) {
       
        login.displayMenu();
    }
}
        
    
    

