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
       // execute login to check username
       if (submittedUsername.contains("_")&& submittedUsername.length() >=2 && submittedUsername.length()<=5){
           System.out.println("Usename successfully captured");
       
       return true;
       }
       else{
           System.out.println("Username is not correctly formatted, please ensure that your username contains an underscore and is no more than 5 characters in length");
      return false;
       }
       
}
}