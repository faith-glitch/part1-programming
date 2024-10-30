/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.loginsystem;

import javax.swing.*;
/**
 *
 * @author RC_Student_lab
 */
public class TaskClass {

    
 //Declarations
    private String TaskName;
    private int TaskNumber;
    private String TaskDescription;
    private String DeveloperDetails;
    private int TaskDuration;
    private String TaskID;
    private String TaskStatus;
    private int TotalHours=0;
    private static int TaskCount = 0;
  
  
    public void addtasks(String TaskName, String TaskDescription, String DeveloperDetails, int TaskDuration, String TaskStatus){
    //Provided task methods

         this.TaskName = TaskName;
         this.TaskNumber = TaskNumber;
         this.TaskDescription = TaskDescription;
         this.DeveloperDetails = DeveloperDetails;
         this.TaskDuration = TaskDuration;
         this.TaskID = createTaskId();
         this.TaskStatus = TaskStatus;
         this.TotalHours += TaskDuration;
         this.TaskCount++;
    }
    //Total hours of all tasks
    private int totalHours = 0; 
    

    public boolean checkDescription(String description) {
        if (description.length() <= 50) {
            JOptionPane.showMessageDialog(null, "Task description is successfully captured");
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Task description should not be more than 50 characters");
            return false;
        }
    }

    public String createTaskID(String taskName, String developerDetails) {
        String taskID = taskName.substring(0, 2).toUpperCase() + ":" + developerDetails.substring(developerDetails.length() - 3).toUpperCase();
        return taskID;
    }

    public void printTaskDetails(String taskStatus, String developerDetails, String taskName, String taskDescription, String taskID, int taskDuration) {
        String Fulldetails = "**Task Details** \n" +
                         "Task Status: " + taskStatus + "\n" +
                         "Developer Details: " + developerDetails + "\n" +
                         "Task Name: " + taskName + "\n" +
                         "Task Description: " + taskDescription + "\n" +
                         "Task ID: " + taskID + "\n" +
                         "Task Duration: " + taskDuration + " hrs\n" +
                         "<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>";
        JOptionPane.showMessageDialog(null, Fulldetails);
    }

    //A method to add to total hours
    public void returnTotalHours(int taskDuration) {
        TotalHours += taskDuration;
    }

    // Getter for total hours
    public int getTotalHours() {
        return TotalHours;
    }

    private String createTaskId() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

