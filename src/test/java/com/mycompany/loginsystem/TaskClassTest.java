/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.loginsystem;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author RC_Student_lab
 */
public class TaskClassTest {
    
    public TaskClassTest() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    
     @Test
     public String checkTaskDescription(String description) {
        if (description.length() > 50) {
            return "Please enter a task description of less than 50 characters";
        }
        return "Task successfully captured";
    }

   
    public String createTaskID(String taskName, int taskNumber, String developer) {
        String taskPrefix = taskName.substring(0, 2).toUpperCase();
        String developerSuffix = developer.substring(developer.length() - 3).toUpperCase();
        return taskPrefix + ":" + taskNumber + ":" + developerSuffix;
    }
// Method to return total hours
    public int returnTotalHours(int[] durations) {
        int total = 0;
        for (int duration : durations) {
            total += duration;
        }
        return total;
    }

    @Test
    public void testTaskDescriptionLength() {
        String description1 = "Create Login to authenticate users";
        assertEquals("Task successfully captured", checkTaskDescription(description1));
        String description2 = "This task description is way too long and exceeds fifty characters.";
        assertEquals("Please enter a task description of less than 50 characters", checkTaskDescription(description2));
    }

    @Test
    public void testTaskIDGeneration() {
        String taskName1 = "Login Feature";
        String developer1 = "Robyn Harrison";
        String taskID1 = createTaskID(taskName1, 1, developer1);
        assertEquals("LO:1:SON", taskID1);

        String taskName2 = "Add Task Feature";
        String developer2 = "Mike Smith";
        String taskID2 = createTaskID(taskName2, 2, developer2);
        assertEquals("AD:2:ITH", taskID2);
    }

    @Test
    public void testTotalHoursAccumulation() {
        int[] durations1 = {8, 10}; 
        assertEquals(18, returnTotalHours(durations1));

        int[] additionalDurations = {10, 12, 55, 11, 1};
        assertEquals(89, returnTotalHours(additionalDurations));
    }

}
