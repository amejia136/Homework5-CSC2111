/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.homework5;

/**
 *
 * @author mayer
 */
public class BadSubmissionException extends Submission {
    
    //varaibles
    private Submission Submission;
    private String Filename;
    
    //DEFAULT CONSTRUCTOR
    public BadSubmissionException(){
        this.Submission = null;
        this.Filename = "EMPTY";
    }
    
    //PARAMETERIZED CONSTRUCTOR
    public BadSubmissionException(Submission Submission, String Filename){
        this.Submission = Submission;
        this.Filename = Filename;
    }
    
    //COPY CONSTRUCTOR
    
    public BadSubmissionException(BadSubmissionException bse){
        this.Submission = bse.Submission;
        this.Filename = bse.Filename;
    }
    
    //SETTERS AND GETTERS FOR SALARY
    
    //SUBMISSION
    public Submission getSubmission(){
        return Submission;
    }
    
    public void setSubmission(Submission Submission){
        this.Submission = Submission;
    }
    //FILENAME
    public String getFilename(){
        return Filename;
    }
    
    public void setFilename(String Filename){
        this.Filename = Filename;
    }
    
}
