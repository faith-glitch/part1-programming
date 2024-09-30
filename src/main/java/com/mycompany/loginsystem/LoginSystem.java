/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.loginsystem;
import java.util.Scanner;
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
       
       // Method to handle user registration and provide relevant messages
       String accountcreationmessage=system.registeruser();
       System.out.print(accountcreationmessage);
       
       //Prompt the user for login credentials
       System.out.println("Please enter your username");
       String submittedUsername=scanner.next();
          
       System.out.println("Please enter your password");
       String submittedPassword=scanner.next();
       
       //Verify login credentials 
       
       String verify=system.Loginuser(submittedUsername, submittedPassword);
       System.out.print(verify);
       
       //Method that outputs login results
       boolean isLoggedIn=verify.startsWith("Welcome");
       
       String result=system.returnLoginStatus(isLoggedIn);
       
       System.out.print(result);
                                          
                   }
                   
               }
           
               
    

