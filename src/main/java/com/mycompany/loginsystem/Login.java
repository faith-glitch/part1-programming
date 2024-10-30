/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.loginsystem;
import javax.swing.JOptionPane;
/**
 *
 * @author RC_Student_lab
 */
public class Login {
    //Declarations
    String Username;
    String Password;
    String firstname;
    String lastname;
    
    public boolean checkUserName(String Username){
       //Verify the username format
       if (Username.contains("_")&& Username.length() >=2 && Username.length()<=5){
           System.out.println("Usename successfully captured");
       
       return true;
       }
       else{
           System.out.println("Username is not correctly formatted, please ensure that your username contains an underscore and is no more than 5 characters in length");
      return false;
       }
       
}
    public boolean checkPasswordComplexity(String Password){
        //Regulating the expression for password complexity
        if(Password.length()>=8 && Password.contains(".[A-Z].") && Password.contains(".[0-9].") && Password.contains("&")||Password.contains("^")||Password.contains("%")||Password.contains("$")||Password.contains("#")||Password.contains("@")||Password.contains("!")){
         
            System.out.println("Password successfully captured");
            return true;
        }
        else{
            System.out.print("Password is not correctly formatted,please ensure that the password contains atleast 8 characters,a capital letter,a number and a special character");
        return false;
        } 
    }
      public String registeruser(String firstname,String lastname,String Username,String Password){
         if(!checkUserName(Username)){
             System.out.print("Username not correctly formatted");
             return"Username is not correctly formatted, please ensure that your username contains an underscore and is no more than 5 characters in length";
         }
             if(!checkPasswordComplexity(Password)){
                 System.out.print("Password  not corectly formatted");
                 
                 return"Password is not correctly formatted,please ensure that the password contains atleast 8 characters,a capital letter,a number and a special character";
             }
             this.firstname=firstname;
             this.lastname=lastname;
             this.Username=Username;
             this.Password=Password;
               
          //Validating username and password complexity
          boolean checkUsername = checkUserName(Username);
          boolean checkpasswordcomplexity =checkPasswordComplexity(Password);
          
          if(checkUsername&&checkpasswordcomplexity){
              System.out.println("Account has successfully been successfuly created:"+Username);
              return"Registration successful";
          }
          else{
              System.out.println("Username incorrectly formatted or Passwordcomplexity requirements not met");
          }
          return "Registration unsuccessful ";
      }
      
      public String Loginuser(String Username,String Password){
          
          if(Username.equals(Username)&&Password.equals(Password)){
              return"Welcome:"+firstname+lastname+"It is great to see you again";
      }
          else{
              return" Incorrect Username or password  ,please enter your details again";
          }
          
         }
       public String returnLoginStatus(boolean isLoggedIn){
              return isLoggedIn? "Login Successful":"Login Failed";
          }

 public static void main(String[] args) {
        Login loginSystem = new Login();
        
        // Registration
        String username = JOptionPane.showInputDialog("Enter firstname:");
        String password = JOptionPane.showInputDialog("Enter lastname:");
        String firstName = JOptionPane.showInputDialog("Enter username:");
        String lastName = JOptionPane.showInputDialog("password:");
        
        String registrationMessage = loginSystem.registeruser(username, password, firstName, lastName);
        JOptionPane.showMessageDialog(null, registrationMessage);
        
        // Login
        String loginUsername = JOptionPane.showInputDialog("Enter username to login:");
        String loginPassword = JOptionPane.showInputDialog("Enter password to login:");
        
        String loginMessage = loginSystem.Loginuser(loginUsername, loginPassword);
        JOptionPane.showMessageDialog(null, loginMessage);

}
}
