/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.homework5;

/**
 *Setters and Getters for Student
 * @author mayer
 */
public class Student {
    
    private String firstName;
    private String lastName;
    private String showStudentCredit;
/**
 * Getter for Student Credit
 * @return 
 */
    public String getShowStudentCredit() {
        return showStudentCredit;
    }
/**
 * Setter for Student Credit
 * @param showStudentCredit 
 */
    public void setShowStudentCredit(String showStudentCredit) {
        this.showStudentCredit = showStudentCredit;
    }
/**
 * Getter for First Name of Student
 * @return 
 */
    public String getFirstName() {
        return firstName;
    }
/**
 * Setter for First Name of Student
 * @param firstName 
 */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
/**
 * Getter for Last Name of Student
 * @return 
 */
    public String getLastName() {
        return lastName;
    }
/**
 * Setter for Last Name of Student
 * @param lastName 
 */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
