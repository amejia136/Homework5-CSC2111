package com.mycompany.homework5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import javafx.application.Platform;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.FileChooser;

/**
 * This class is all of Java GUI coding for each item you see on the panel
 * screen that shows up. This helps execute codes for each interaction the user
 * may do with the Java GUI.
 *
 * @author mayer
 */
public class PrimaryController {

    @FXML
    private TextField textFieldMessage;
    private TextField textFieldAssignment;
    private TextField textFieldScore;
    private TextField textFieldDate;
    
    @FXML
    private ListView<Submission> viewListSubmissions;
    private ObservableList<Submission> submissionsList; 
    
    Submission sub = new Submission();
    Submission[]sa;
    int count = 0;
    int userData;

    /**
     * Initializes the Java GUI.
     */
    public void initialize() {
        System.out.printf("Initializing...\n");
    }
    
    /**
     * Shows the user an output of their input to ensure 
     * it is the number of submissions they wish to import. After displaying
     * the user's input, it will show a brief instruction on how to proceed.
     */
    /*public void handleShowMessage(){
        userData = Integer.parseInt(this.textFieldMessage.getText());
        System.out.printf("\nNumber of submissions you want to import: " + userData);
        System.out.printf("\nProceed to open your file.\n");
    }*/

    /**
     * Below are the Menu Item Methods. Each method's title is specifically
     * named as the item in Java GUI. This helps the coder to identify which
     * method goes with what item easily.
     */
    
    /**
     * Close Menu Item handles the closing part of the program.
     */
    public void handleFileCloseMenuItem() {
        Platform.exit();
        System.out.println("\nExiting...");
    }

    /**
     * File Open Menu Item handles the user that opens whichever file they
     * desire to display on the ViewList.
     *
     * @throws FileNotFoundException
     */
    public void handleFileOpenMenuItem() throws FileNotFoundException {
        submissionsList = viewListSubmissions.getItems();
        //userData = Integer.parseInt(this.textFieldMessage.getText());
        
        FileChooser fileChooser = new FileChooser();
        File current = null;

        FileChooser.ExtensionFilter extFilter
                = new FileChooser.ExtensionFilter("Text files,(*.txt)", "*.txt");
        fileChooser.getExtensionFilters().add(extFilter);

        try {
            current = new File(new File(".").getCanonicalPath()); // Current working directory
        } catch (IOException e1) {
            e1.printStackTrace();
        }
        fileChooser.setInitialDirectory(current);
        File selectedFile = fileChooser.showOpenDialog(null);

        if (selectedFile != null) {
            Scanner scanTwo = new Scanner(selectedFile);

            String countAsString;
            countAsString = scanTwo.nextLine();
            count = Integer.valueOf(countAsString);
            System.out.println(count);
            count = Integer.parseInt(this.textFieldMessage.getText());
            
            sa = new Submission[count];

            for (int i = 0; i < count; i++) {

                int m;
                String monthAsString;
                monthAsString = scanTwo.nextLine();
                m = Integer.valueOf(monthAsString);

                int d;
                String dayAsString;
                dayAsString = scanTwo.nextLine();
                d = Integer.valueOf(dayAsString);

                int y;
                String yearAsString;
                yearAsString = scanTwo.nextLine();
                y = Integer.valueOf(yearAsString);

                String asm;
                asm = scanTwo.nextLine();
                
                //try-catch code here
                double sc;
                String scoreAsString;
                scoreAsString = scanTwo.nextLine();
                sc = Double.valueOf(scoreAsString);

                //creates the number of arrays
                sa[i] = new Submission(m, d, y, asm, sc);
            }   
            //submissionsList.clear();
            //creates the number of times it should display depending on the number of submission
            for (int e = 0; e < sa.length; e++) {
                submissionsList.add(sa[e]); /*+ ", " + submission[e].getScore() + ", " + submission[e].getDate().getMonth() + "/"
                        + submission[e].getDate().getDay() + "/" + submission[e].getDate().getYear());*/
            }
            System.out.printf("\nFile Opened!\n");
        }
    }

    /**
     * File Save Menu Item handles the user that desires to save the file in a
     * specific format.
     * @throws FileNotFoundException 
     */
    public void handleFileSaveFileMenuItem() throws FileNotFoundException {
        FileChooser fileChooser = new FileChooser();
        File current = null;

        FileChooser.ExtensionFilter extFilter
                = new FileChooser.ExtensionFilter("Text files,(*.txt)", "*.txt");
        fileChooser.getExtensionFilters().add(extFilter);

        try {
            current = new File(new File(".").getCanonicalPath()); // Current working directory
        } catch (IOException e1) {
            e1.printStackTrace();
        }
        fileChooser.setInitialDirectory(current);
        File selectedFile = fileChooser.showSaveDialog(null);
        if (selectedFile != null) {
            PrintWriter printWriter = new PrintWriter(selectedFile);
            printWriter.printf("%-30s %-10s %-10s %-10s %-10s\n", "Assignment", "Score", "Month", "Day", "Year");
            printWriter.printf("%-30s %-10s %-10s %-10s %-10s\n", "----------", "-----", "-----", "---", "----");

            for (int e = 0; e < sa.length; e++) {
                printWriter.printf("%-30s %-10s %-10s %-10s %-10s\n", sa[e].getAssignment(), sa[e].getScore(), sa[e].getDate().getMonth(), sa[e].getDate().getDay(), sa[e].getDate().getYear());
            }

            //loop for adding each Score Array value
            double sum = 0;
            for (int i = 0; i < sa.length; i++) {
                sum += Double.valueOf(sa[i].getScore());
            }
            double averageScore = sum / sa.length;
            printWriter.printf("\n%-20s\n", "Average Score : " + averageScore);
            System.out.printf("\nFile Saved!\n");
            printWriter.close();
        }
    }
    
    
    public void handleListViewItemsMouseClick(MouseEvent event) {
    int selectedIndex = viewListSubmissions.getSelectionModel().getSelectedIndex();
        if (selectedIndex >= 0 && selectedIndex < submissionsList.size()) {
            //System.out.println("Selected Item: " + olEmployee.get(selectedIndex));
            //Submission e;
            Submission e = submissionsList.get(selectedIndex);
            
            textFieldAssignment.setText(e.getAssignment());
            //textFieldScore.setText(e.getScore());
            //textFieldDate.getText(e.toString());
            
            System.out.println("Selected Item: " + sub);
        }
    }

    @FXML
    /**
     * Secondary method that switches from Primary Controller class 
     * to the Secondary Controller class.
     */
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
}
