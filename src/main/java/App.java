/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Luis Corona
 */
import java.util.Scanner;

public class App {

    static Scanner in = new Scanner(System.in);
    static final String key = "abc$123";
    public static void main(String[] args) {
        App app = new App();
        String password = app.readPassword();
        app.printOutput(password);
    }

    private void printOutput(String password) {
        if(password.equals(key))
            System.out.println("Welcome!");
        else
            System.out.print("I don't know you.");
    }

    private String readPassword() {
        System.out.print("What is the password? ");
        String password = in.nextLine();
        return password;
    }
}