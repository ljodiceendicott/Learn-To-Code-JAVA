/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


// Name: Activity.java			   //
// Date Created: 11/28/21		   //
// Description: Activity model class          //

// Last Edited: Bret Miller (12/7/21)
package edu.endicott.ltcj.models;


/**
 *
 * @author BretJr
 */
public class Activity{
    
    //activity id number
    private int id;
        
    //the filepath for the activity's testharness file
    private String path;
    
    //Any code that will appear in the activity panel that the user didn't
    //write
    private String starterCode;
    
    //Instructions that will appear for the user
    private String instructions;
    
    /**
     * This is the constructor for the Activity Class
     * @param id number that the activity is 
     * @param path this holds the path to the test harness
     * @param starterCode code that is provided to the player
     * @param instructions instructions that the player is able to view
     */
    public Activity( int id, String path, String starterCode, String instructions){
        this.id = id;
        this.path = path;
        this.starterCode = starterCode;
        this.instructions = instructions;
        
    }
    
    /**
     * gets the ID number of the activity
     * @return the id of the activity 
     */
    public int getId(){
        return this.id;
    }
    
    /**
     * gets the file path to the test harness class
     * @return file path of the test harness
     */
    public String getPath(){
        return this.path;
    }
    
    /**
     * gets the starter code for the player
     * @return starterCode for the player
     */
    public String getStarterCode(){
        return this.starterCode;
    }
    
    /**
     * gets the instructions for the user
     * @return the instructions
     */
    public String getInstructions(){
        return this.instructions;
    }
    
    
    
    
    
}
