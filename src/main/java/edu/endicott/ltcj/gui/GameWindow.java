
package edu.endicott.ltcj.gui;

//import edu.endicott.ltcj.models.Level;

/**
 *
 * @author Tommy Hendricks
 */
public class GameWindow {
    private GamePanel gamePanel;
    private LevelPanel levelPanel;
    private ActivityPanel activityPanel;
    //private Level level;
    private int progressThroughLevel;
    private boolean levelCompleted;

    /**
    * This is the constructor for GameWindow
    *
    */
    public GameWindow(){
        
    }    
    
    public GamePanel getGamePanel() {
        return gamePanel;
    }

    public LevelPanel getLevelPanel() {
        return levelPanel;
    }

    public ActivityPanel getActivityPanel() {
        return activityPanel;
    }

//    public Level getLevel() {
//        return level;
//    }

    public int getProgressThroughLevel() {
        return progressThroughLevel;
    }
    
    /**
     * This will return if the level is complete
     * @return Returns if the levels is completed
     */
    public boolean isLevelCompleted() {
        return levelCompleted;
    }

    public void setGamePanel(GamePanel gamePanel) {
        this.gamePanel = gamePanel;
    }

    public void setLevelPanel(LevelPanel levelPanel) {
        this.levelPanel = levelPanel;
    }

    public void setActivityPanel(ActivityPanel activityPanel) {
        this.activityPanel = activityPanel;
    }

//    public void setLevel(Level level) {
//        this.level = level;
//    }

    public void setProgressThroughLevel(int progressThroughLevel) {
        this.progressThroughLevel = progressThroughLevel;
    }

    public void setLevelCompleted(boolean levelCompleted) {
        this.levelCompleted = levelCompleted;
    }
    
    
    
}
