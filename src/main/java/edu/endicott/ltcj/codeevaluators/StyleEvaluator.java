/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.endicott.ltcj.codeevaluators;

import java.util.ArrayList;

/**
 *
 * @author mor
 */
public class StyleEvaluator {
    
    protected double levelPoints;
    protected double totalPoints;
    protected double indentPoints;
    protected double goodNamePoints;
    protected double commentPoints;
    protected boolean wasViolated;
    protected ArrayList<String> violationList = new ArrayList<String>();

     /**
     * create instance for style evaluate 
     * @param levelPoints the amount of points a single level
     * @param totalPoints the amount of points overall
     * @param indentPoints the amount of points for indention
     * @param goodNamePoints the amount of points for good naming
     * @param commentPoints the amount of points for comments
     */
    public StyleEvaluator(double levelPoints, double totalPoints, double indentPoints, 
                          double goodNamePoints, double commentPoints){ 

    }

    //   void calculateScore(levelObject attempt){
    //          
    //   }


    /**
    * take a user list of mistakes and display them to the user 
    * @param Mistake Array List of mistakes
    */
    public void showMistake(ArrayList Mistake){
    }

    public void setLevelPoints(double levelPoints){

    }

    public double getLevelPoints(){

        return levelPoints;   
    }

    public void setTotalPoints(double totalPoints){
        this.totalPoints = totalPoints;   
    }

    public double getTotalPoints(){

        return totalPoints;   
    }

    public void setIndentPoints(double indentPoints){
        this.indentPoints = indentPoints;
    }

    public double getIndentPoints(){

        return indentPoints;      
    }

    public void setNamePoints(double namePoints){

    }

    public double getGoodNamePoints(){

        return 0;    
    }

    public void setCommentPoints(double commentPoints){
        this.commentPoints = commentPoints;
    }

    public double getCommentPoints(){

        return commentPoints;
    }
   
    public boolean getWasViolated(){
       
       return wasViolated;
    }
   
    public ArrayList<String> getViolationList(){
       
        return violationList;
    }
  
}
