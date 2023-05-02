/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.homework5;
/**
 *
 * @author mayer
 */

/**
 * This class will be used for the text file that is going to be input
 * from the user. Submission is extended to subdate since submission has a date 
 * on it. This will initialize two other important variable for the text file.
 * @author mayer
 */
public class Submission {
    private SubDate date;
    private String assignment;
    private double score;
    
    /**
     * Default Constructor.
     */
    public Submission(){
        super();
        this.date = new SubDate();
        this.assignment = "NO_ASSIGNMENT";
        this.score = 0.0;
    }    
    
    /**
     * Parameterized Constructor.
     * @param m = month;
     * @param d = day;
     * @param y = year;
     * @param asm = assignment;
     * @param sc = sc0re;
     */
    public Submission(int m, int d, int y, String asm, double sc){
        this.date = new SubDate(m, d, y);
        this.assignment = asm;
        this.score = sc;
    }
    
    /**
     * Copy Constructor.
     * @param sb = submission; 
     */
    public Submission(Submission sb){
        this.date = new SubDate(sb.date);
        this.assignment = sb.assignment;
        this.score = sb.score;
    }
    
    /**
     * Gettters and Setters for date, assignment and score.
     * @return 
     */
    
    /**
     * Getter for Date
     * @return 
     */
    public SubDate getDate() {
        return date;
    }
    
/**
 * Setter for Date
 * @param date 
 */
    public void setDate(SubDate date) {
        this.date = date;
    }
    
/**
 * Getter for Assignment
 * @return 
 */
    public String getAssignment() {
        return assignment;
    }
    
/**
 * Setter for Assignment
 * @param asm 
 */
    public void setAssignment(String asm) {
        this.assignment = asm;
    }
    
/**
 * Getter for Score
 * @return 
 */
    public double getScore() {
        return score;
    }
    
/**
 * Setter for Score
 * @param sc 
 */
    public void setScore(double sc) {
        this.score = sc;   
    }
    
    @Override
    public String toString(){
        String s = assignment;
        return s;
    }
}
