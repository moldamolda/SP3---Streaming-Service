package org.example;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Login {
    Scanner scanner = new Scanner(System.in);
    private static final String userfile = "/Users/jimmymeggele/Documents/Intellij/SP3---Streaming-Service/SP3/src/main/java/org/example/Users.txt";

    public static void main(String[] args) {
        Login login = new Login();
        login.startmenu();
    }

    public void startmenu() {
        System.out.println("Welcome to betflix");
        System.out.println("1) Create an account");
        System.out.println("2) login");
        int choise = Integer.parseInt(scanner.nextLine());
        switch (choise){
            case 1:
                createAccount();
                break;
            case 2:
                login();
                break;
            default:
                System.out.println("Invalid choise please try again");
                startmenu();

        }
    }
    public void login() {
        String username = getUserInput("Enter your username: ");
        String password = getUserInput("Enter your username: ");
        if (isValidAccount(username,password)) {
            System.out.println("login successful!");
        } else {
            System.out.println("Wrong login try again");
            login();
        }
    }


    public void createAccount() {
        String username = getUserInput("Enter a username: ");
        String password = getUserInput("Enter a password: ");

        if (isValidAccount(username, password)) {
            System.out.println("You allready have a valid account.");
        } else {
            saveAccount(username, password);
            System.out.println("Account created successfully.");
        }
    }

    private static String getUserInput(String msg) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(msg);
        return scanner.nextLine();
    }


    private static boolean isValidAccount(String username, String password) {
        try (Scanner scanner = new Scanner(new FileReader(userfile))) {
            while (scanner.hasNextLine()) {
                if (scanner.nextLine().equals(username + " " + password)) {
                    return true;
                }
            }
        } catch (IOException e) {
            System.out.println("invalid account");
        }
        return false;
    }

    private static boolean isaccount(String username) {
        try (Scanner scanner = new Scanner(new FileReader(userfile))) {
            while (scanner.hasNextLine()) {
                if (scanner.nextLine().equalsIgnoreCase(username + " ")) {
                    return true;
                }
            }
        } catch (IOException e) {
            System.out.println("invalid account");
        }
        return false;
    }


    private static void saveAccount(String username, String password) {
        try (FileWriter writer = new FileWriter(userfile, true)) {
            writer.write(username + " " + password + "\n");
        } catch (IOException e) {
            System.out.println("couldnt save account");
        }
    }

}
