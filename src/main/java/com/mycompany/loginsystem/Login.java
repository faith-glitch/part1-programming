/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.loginsystem;
import java.util.Scanner;
/**
 *
 * @author RC_Student_lab
 */
public class Login {
    //Declarations
    String username="Fate_";
    String password="@fulufhelo2";
    String firstname="Fulfhelo";
    String lastname="Makhani";
    String submittedUsername;
    String submittedPassword;
    
    public boolean checkUserName(String username){
       //Verifying username format
       if (submittedUsername.contains("_")&& submittedUsername.length() >=2 && submittedUsername.length()<=5){
           System.out.println("Usename successfully captured");
       
       return true;
       }
       else{
           System.out.println("Username is not correctly formatted, please ensure that your username contains an underscore and is no more than 5 characters in length");
      return false;
       }
       
}
    public boolean PasswordComplexity(String submittedPassword){
        
        if(submittedPassword.length()>=8 && submittedPassword.contains(".[A-Z].") && submittedPassword.contains(".[0-9].") && submittedPassword.contains("&")||submittedPassword.contains("^")||submittedPassword.contains("%")||submittedPassword.contains("$")||submittedPassword.contains("#")||submittedPassword.contains("@")||submittedPassword.contains("!")){
         
            System.out.println("Password successfully captured");
            return true;
        }
        else{
            System.out.print("Password is not correctly formatted,please ensure that the password contains atleast 8 characters,a capital letter,a number and a special character");
        return false;
        } 
    }
     
}