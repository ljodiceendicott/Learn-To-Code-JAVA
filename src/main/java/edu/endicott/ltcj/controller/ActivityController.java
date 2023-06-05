//Name: ActivityController.java                            //
//Date Created: 11/20/21                                   //
//Description: This is the class that controls the activity//

package edu.endicott.ltcj.controller;

//Last Edited: Luke Jodice (12/5/21)

import edu.endicott.ltcj.codeevaluators.*;
import edu.endicott.ltcj.gui.ActivityPanel;


import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ActivityController {    
  //private LevelController playerLevel = new LevelController();
  //  private GameController playerGameController = new GameController();
  
    //private PlayerStats playerStats;
    private CorrectnessEvaluator correctnessEvaluator;
    private StyleEvaluator styleEvaluator;    
    
    private ActivityPanel activityPanel;

    private String activityData;
    private String userInput;
    private String compilerOutput;
    private String paneldisplay;
    private String mistakes;
    private ArrayList<String> mistakeslist;
  
//    private ActionListener myListener; 
    
    private Boolean isDone;
        
    //take frame
    public ActivityController() {
        mistakes = "";
    }
    
            /**
             * displaying the activity panel 
             * (by configuring an ActivityPanel instances and adding it to the GameWindow via GameController)
             */
            public void displayActivity(){
                //
                activityPanel.setVisible(true);
                
                //playerGameController.launchGameWindow(activityPanel);
            }
            
            /**
             * 
             * @param userAnswer calls CorrectnessEvaluator to run then check code
             * if it runs successfully only then will it run StyleEvaluator to see the
             * point value that is given and where points were lost
             */
            public void checkAnswers(String userAnswer){
                //Checking to see if the code given has issues only if the code gives the proper output does it
                //continue down to the Style Evaluator if the code does not run it does not check the style
                if (correctnessEvaluator.runCode(userAnswer)==true){
                    //
                    //if (styleEvaluator.calculateScore(userAnswer)<styleEvaluator.getTotalPoints()){
                    if (true){
                        mistakeslist = styleEvaluator.getViolationList();
                        for(int i = 0; i<mistakeslist.size(); i++){
                            mistakes= mistakes + mistakeslist.get(i)+"\n";
                        }
                        //do something with mistakes
                    }
                    //the user recieves full points with no style mistakes
                    else{
                           //call something to let the user know that they got a 100% 
                    }
                }
                //if there are errors in the code,they will be displayed at this point
                else{
                    //this.displayErrors();
                }
            }
            
            /**
             * updates the PlayerStats based on
             * players progress with activity
             */
            public void updatePlayerStats(){
                //not worry
            }
            
            /**
             * updates the activity panel
             * visually when necessary
             */
//            public void updatePanel(){
//               
//           
//            }
            
            /**
             * reacts to user clicking
             * the submit button
             */
            public void clickSubmit(){
                this.checkAnswers(userInput);
            }
            
            /**
             * displays the compilation error
             * the user has in their code when called
             */
//            public String displayErrors(){
//                compilerOutput= styleEvaluator.getCompilerOutout();
//                //set the text to a window
//                return compilerOutput;
////            return "";
//            }
//            
            /**
             * turns isDone to true so levelController
             * knows the activity is complete
             */
            public void activityComplete(){
                this.isDone = true;
            }
}
