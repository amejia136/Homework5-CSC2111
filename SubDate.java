/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.homework5;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/**
 * Class is used to initialize the date variable such as month, day and year.
 * It has default constructors, parameterized constructor and a copy constructor.
 * This will be used to identify the integers in the text file as a month, day 
 * and year.
 * 
 * @author mayer
 */
public class SubDate {
    //member variables
    int month;
    int day;
    int year;
    
    /**
     * Default Constructor.
     */
    public SubDate (){
    this.month = 1;
    this.day = 1;
    this.year = 2023;
}
    /**
     * Parameterized Constructor.
     * @param m = the month of the assignment
     * @param d = the day of the assignment
     * @param y = the year of the assignment
     */
    public SubDate(int m, int d, int y){
        this.month = m;
        this.day = d;
        this.year = y;
    }
    
    /**
     * Copy Constructor.
     * @param sd = Subdate's month, day and year. 
     */
    public SubDate(SubDate sd){
        this.month = sd.month;
        this.day = sd.day;
        this.year = sd.year;
    }
    
    /**
     * Getters and Setters for Date.
     * @return 
     */
    
    /**
     * Getter for Month
     * @return 
     */
    public int getMonth() {
        return month;
    }
    
/**
 * Setter for Month
 * @param m 
 */
    public void setMonth(int m) {
        this.month = m;
    }
    
/**
 * Getter for Day
 * @return 
 */
    public int getDay() {
        return day;
    }
    
/**
 * Setter for Day
 * @param d 
 */
    public void setDay(int d) {
        this.day = d;
    }
    
/**
 * Getter for Year
 * @return 
 */
    public int getYear() {
        return year;
    }
    
/**
 * Setter for Year
 * @param y 
 */
    public void setYear(int y) {
        this.year = y;
    }   
    
    @Override
    public String toString(){
        String formattedDate = String.format("%d/ %d/ %d/", month, day, year);
        return formattedDate;
    }
    
}

