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
    
    public boolean checkUserName(String submittedusername){
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
      public String registeruser(){
          
          Scanner scanner=new Scanner(System.in);
          
          //Prompting the user of the login system
          System.out.println("Please enter your Username");
          submittedUsername=scanner.next();
          
          System.out.println("Please enter your Password");
          submittedPassword=scanner.next();
          
          System.out.println("Please enter your firstname");
          firstname=scanner.next();
          
          System.out.println("Please enter your lastname");
          lastname=scanner.next();
          
          System.out.println("Username is:"+submittedUsername);
          
          boolean checkUsername = checkUserName(submittedUsername);
          boolean checkpasswordcomplexity =PasswordComplexity(submittedPassword);
          
          if(checkUsername&&checkpasswordcomplexity){
              System.out.println("Account has successfully been successfuly created:"+submittedUsername);
              return"Registration successful";
          }
          else{
              System.out.println("Username incorrectly formatted or Passwordcomplexity requirements not met");
          }
          return "Registration unsuccessful ";
      }
      public String Loginuser(String submittedUsername,String submittedPassword){
          
          if(submittedUsername.equals(username)&&submittedPassword.equals(password)){
              return"Welcome:"+firstname+lastname+"It is great to see you again";
      }
          else{
              return" Incorrect Username or password  ,please enter your details again";
          }
          
}
}