/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.loginsystem;
import java.util.Scanner;
import javax.swing.*;

/**
 *
 * @author RC_Student_lab
 */
public class LoginSystem {

    public static void main(String[] args) {
       //Initialize scanner object
       Scanner scanner=new Scanner(System.in);
       
       //Initialize an ExternalClass
       Login system=new Login();
       
       //Prompting user for registration details
       
         System.out.println("Please enter your firstname");
       String firstname=scanner.next();
       
         System.out.println("Please enter your lastname");
       String lastname=scanner.next();
       
         System.out.println("Please enter your username");
       String Username=scanner.next();
       
         System.out.println("Please enter your password");
       String Password=scanner.next();
       
       // Method to provide the user registration and messages
       String accountcreationmessage=system.registeruser(firstname, lastname, Username, Password);
       
       System.out.print(accountcreationmessage);
       
       //Prompt user to provide the login credentials
       System.out.println("Please enter your username");
       String submittedUsername=scanner.next();
          
       System.out.println("Please enter your password");
       String submittedPassword=scanner.next();
       
       //Verify login credentials 
       
       String verify=system.Loginuser(submittedUsername, submittedPassword);
       System.out.print(verify);
       
       //Method that shows the login results
       boolean isLoggedIn=verify.startsWith("Welcome");
       
       String result=system.returnLoginStatus(isLoggedIn);
       
       System.out.print(result);
       
          if (isLoggedIn) {
            JOptionPane.showMessageDialog(null, "Welcome to EasyKanban");

       TaskClass Task = new TaskClass();
       // Menu loop for task management
            while (true) {
                // Print menu options
                System.out.println("\nChoose an option:");
                System.out.println("1. Add Task");
                System.out.println("2. Show Report (Coming Soon)");
                System.out.println("3. Quit");

                // Get user input for choice
                int choice = scanner.nextInt();

           switch (choice) {
                case 1:
                   int numoftasks = Integer.parseInt(JOptionPane.showInputDialog("How many tasks do you wish to capture"));

                    // Task details input from the user
                    for (int i = 0; i < numoftasks; i++) {
                        String taskName = JOptionPane.showInputDialog("Enter Task name:");
                    String taskDescription;
                    do {
                        taskDescription = JOptionPane.showInputDialog("Enter Task Description (should not exceed 50 characters):");
                    } while (!Task.checkDescription(taskDescription));

                    String developerDetail = JOptionPane.showInputDialog("Enter Developer's Full Name:");
                    int taskDuration = Integer.parseInt(JOptionPane.showInputDialog("Enter Task Duration (hours):"));

                    
                    // Provide a task to the system
                    String taskStatus = (String) JOptionPane.showInputDialog(null, "Choose a status:", "Task Status",
                    JOptionPane.QUESTION_MESSAGE, null, new String[]{"To Do", "Doing", "Done"}, "To Do");

                    // Provide a task to task system
                    Task.addTask(taskName, taskDescription, developerDetail, taskDuration, taskStatus,numoftasks);
                    }
                   
                    JOptionPane.showMessageDialog(null, "Total hours for all tasks so far: " + Task.getTotalHours() + " hrs");
                    break;

                case 2:
                  Task.printTaskDetails();
                    break;

                case 3:
                    JOptionPane.showMessageDialog(null, "GOODBYE!");
                    System.exit(0);
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Invalid option, please choose a correct option.");
                    break;
     
           }
            }
 }
          }
    }

