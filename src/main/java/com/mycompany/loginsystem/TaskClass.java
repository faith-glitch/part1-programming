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
    private static int TaskCount=1;
    private int TotalHours = 0;
    
    private String[] Developer;
    private String[] TaskNames;
    private String[] TaskIDs;
    private int[] TaskDurations;
    private String[] TaskStatuses;
    private String[]TaskDescriptions;
    
    public boolean checkDescription(String description) {
        if (description.length() <= 50) {
            JOptionPane.showMessageDialog(null, "Task description is successfully captured");
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Task description should not be more than 50 characters");
            return false;
        }
    }

        // Method to create Task ID 
    public String createTaskID(String taskName, String developerDetails) {
        String taskID = taskName.substring(0, 2).toUpperCase() + "-" + TaskCount;
        return taskID;
  
    }
    public void printTaskDetails() {
       int i = 0;
    String Fulldetails="" ; 
    if(Developer==null){
      JOptionPane.showMessageDialog(null,"add task before printing report" );
    }
    for (i = 0; i < Developer.length; i++) {
    Fulldetails+= "**Task Details** \n" +
                  "Task Status: " + TaskStatuses[i] + "\n" +
                  "Developer Details: " + Developer[i] + "\n" +
                  "Task Name: " + TaskNames[i] + "\n" +
                  "Task Description: " + TaskDescriptions[i] + "\n" +
                  "Task ID: " + TaskIDs[i] + "\n" +
                  "Task Duration: " + TaskDurations[i] + " hrs\n" +
                  "<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>";
   
   JOptionPane.showMessageDialog(null, Fulldetails + ":\nTotal Hours: " + getTotalHours());
}
       
    }
     // A method to add to total hours
    public void returnTotalHours(int taskDuration) {
        TotalHours += taskDuration;
    }

    // Getter for total hours
    public int getTotalHours() {
        return TotalHours;
    }
    // Method to add a task
    public void addTask(String taskName, String taskDescription, String developerDetails, int taskDuration, String taskStatus,int numTask) {
        this.TaskName = taskName;
        this.TaskDescription = taskDescription;
        this.DeveloperDetails = developerDetails;
        this.TaskDuration = taskDuration;
        this.TaskStatus = taskStatus;
        this.TaskID = createTaskID(taskName, developerDetails);
        
        Developer=new String[numTask];
        TaskNames=new String[numTask];
        TaskIDs=new String[numTask];
        TaskDurations=new int[numTask];
        TaskStatuses=new String[numTask];
        TaskDescriptions=new String[numTask];
        
        Developer[TaskCount-1]=developerDetails;
        TaskNames[TaskCount-1]=taskName;
        TaskIDs[TaskCount-1]=TaskID;
        TaskDurations[TaskCount-1]=taskDuration;
        TaskStatuses[TaskCount-1]=taskStatus;
        TaskDescriptions[TaskCount-1]=taskDescription;
        
        // Provide task count for next task
        TaskCount++;
        // Provide total hours
        returnTotalHours(taskDuration);
    }

// Method to display tasks with status "Done"
    public void displayDoneTasks() {
        StringBuilder doneTasks = new StringBuilder("Tasks with status 'Done':\n");
        for (int i = 0; i < TaskCount; i++) {
            if ("Done".equals(TaskStatuses[i])) {
                doneTasks.append("Developer: ").append(Developer[i])
                        .append(", Task Name: ").append(TaskNames[i])
                        .append(", Duration: ").append(TaskDurations[i]).append(" hrs\n");
            }
        }
        JOptionPane.showMessageDialog(null, doneTasks.toString());
    }

    // Method to find the task with the longest duration
    public void displayLongestTask() {
        int maxDurationIndex = 0;
        for (int i = 1; i < TaskCount; i++) {
            if (TaskDurations[i] > TaskDurations[maxDurationIndex]) {
                maxDurationIndex = i;
            }
        }
        JOptionPane.showMessageDialog(null, "Longest Task:\nDeveloper: " + Developer[maxDurationIndex] +
                "\nTask Name: " + TaskNames[maxDurationIndex] +
                "\nDuration: " + TaskDurations[maxDurationIndex] + " hrs");
    }

    // Method to search for a task by name
    public void searchTaskByName(String taskName) {
        for (int i = 0; i < TaskCount; i++) {
            if (TaskNames[i].equalsIgnoreCase(taskName)) {
                JOptionPane.showMessageDialog(null, "Task Found:\nTask Name: " + TaskNames[i] +
                        "\nDeveloper: " + Developer[i] +
                        "\nStatus: " + TaskStatuses[i]);
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "Task not found.");
    }

    // Method to search for all tasks assigned to a developer
    public void searchTasksByDeveloper(String developer) {
        StringBuilder tasksByDeveloper = new StringBuilder("Tasks assigned to " + developer + ":\n");
        boolean found = false;
        for (int i = 0; i < TaskCount; i++) {
            if (Developer[i].equalsIgnoreCase(developer)) {
                tasksByDeveloper.append("Task Name: ").append(TaskNames[i])
                        .append(", Status: ").append(TaskStatuses[i]).append("\n");
                found = true;
            }
        }
        if (found) {
            JOptionPane.showMessageDialog(null, tasksByDeveloper.toString());
        } else {
            JOptionPane.showMessageDialog(null, "No tasks found for this developer.");
        }
    }

    // Method to delete a task by name
    public void deleteTaskByName(String taskName) {
        for (int i = 0; i < TaskCount; i++) {
            if (TaskNames[i].equalsIgnoreCase(taskName)) {
                // Shift tasks to the left to remove the task
                for (int j = i; j < TaskCount - 1; j++) {
                    Developer[j] = Developer[j + 1];
                    TaskNames[j] = TaskNames[j + 1];
                    TaskIDs[j] = TaskIDs[j + 1];
                    TaskDurations[j] = TaskDurations[j + 1];
                    TaskStatuses[j] = TaskStatuses[j + 1];
                    TaskDescriptions[j] = TaskDescriptions[j + 1];
                }
                TaskCount--; // Decrease task count
                JOptionPane.showMessageDialog(null, "Task '" + taskName + "' deleted successfully.");
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "Task not found.");
    }

 
}

   
           
    