package Ex15;
import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Richard Pekarski
 */

// Note: Included a thing for usernames as well as password. Works the same way.

public class Example15 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String username = "UnhackableMan12345";
        String password = "password";

        System.out.printf("Please enter your login credentials. ");
        String user_input1 = input.next();
        String user_input2 = input.next();

        if(user_input1.equals(username) && user_input2.equals(password))
        {
            System.out.print("Welcome!");
        }
        else
        {
            // Fails condition
            System.out.print("Proceeding to blow up your computer in 3....2....1....");
        }
    }
}
