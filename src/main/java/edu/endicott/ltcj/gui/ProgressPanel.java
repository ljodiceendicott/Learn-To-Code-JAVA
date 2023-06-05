// Name: ProgressPanel.java                            //
// Date Created: 11/26/21                              //
// Description: Progress Panel      class              //

package edu.endicott.ltcj.gui;

// Last Edited: Adriano Nannini (12/8/21)
/**
 *  A progress panel object containing the parameters and
 * functionality to update the player's progress and the
 * progress for the level
 */
public class ProgressPanel {
    private
    String levelName;
    int currentPlayerProgress;
    int currentProgressLevel;
    int currentActivityProgress;
  /**
   * add later when level object is created
   */
//    Level level;
    
    
    
    
    /**
     * updates the progress the player has made
     * in the current level
     */
    void updateLevelProgress(){
    }
    
    /**
     * changes to another level
     */
    void changeLevel(){
    }
    
    /**
     * updates the activity
     */
    void updateCurrentActivity(){
    }
    
    /**
     * @return the name of the level
     */
    public String getLevelName(){
        return levelName;
    }
    /**
     * 
     * @param levelSet updates the levelName variable
     */
    public void setLevelName(String levelSet){
        this.levelName = levelSet;
    }
    
    /**
     * 
     * @return the player's current progress in an int value
     */
    public int getPlayerProgress(){
        return currentPlayerProgress;
    }
    
    /**
     * @param playerProgress updates the value for the players progress
     */
    public void setPlayerProgress(int playerProgress){
        this.currentPlayerProgress = playerProgress;
    }
    /**
     * 
     * @return the current level the player is on as an int value
     */
    public int getProgressLevel(){
        return currentProgressLevel;
    }
    /**
     * 
     * @param progressLevel how far the player has made it through
     * the current level
     */
    public void setProgressLevel(int progressLevel){
        this.currentProgressLevel = progressLevel;
    }
}
