// Name: GameLoader.java	    //
// Date Created: 11/28/21           //
// Description: GameLoader io class //

// Last Edited: Bret Miller (12/7/21)

package edu.endicott.ltcj.io;

import edu.endicott.ltcj.models.Activity;
//import edu.endicott.ltcj.models.Game;
//import edu.endicott.ltcj.models.Level;

//import org.json.simple.JSONArray;
//import org.json.simple.JSONObject;
//import org.json.simple.parser.*;

import org.json.simple.JSONObject;
import org.json.simple.parser.*;
import java.io.FileReader;
//import java.util.Iterator;
//import java.util.Map;

/**
 *
 * @author BretJr
 */
public class GameLoader {
    /**
     * this will hold the root directory address
     */
    private String directoryData;
    
    /**
     * This is the constructor for the GameLoader class
     * @param rootDirectory 
     */
    public GameLoader( String rootDirectory ){
        this.directoryData = rootDirectory;
    }
    
    /**
     * Creates the Game using the desired file path 
     * @param filePath file path to the game model configuration file
     * @return the GameModel object that is created
     */

//    public Game createGameModel(String filePath){
//        //takes in the location from disk
//        return null;
//    }
    /**
     * Returns the Game model
     * @return 
     */

//    public Game getGameModel(){
//        return null;
//    }
//    /**
//     * Creates the Level model using the desired file path 
//     * @param filePath file path to the level model configuration file
//     * @return the Level object that is created
//     */
//    public Level createLevelModel(String filePath){
//        //takes in location from disk
//        return null;
//    }
    
    /**
     * Returns the Level model
     * @return 
     */

    //public Level getLevelModel(){
        //return null;
    //}

    
    
   /**
    * Creates the Activity model using the desired file path 
    * @param filePath file path to the activity model configuration file
    * @return the Activity object that is created
    */
    public Activity createActivityModel(String filePath) throws Exception{
        //read in data from the JSON configuration file
        //created file parser
        Object obj = new JSONParser().parse(new FileReader(filePath));
//        casting it to a JSONObject
        JSONObject jo = (JSONObject) obj;
        //grab activity id 
        int id = (int) jo.get("activity_id");
        //get the test harness path
        String tHarness = filePath + "TestHarness.java";
        //startercode
        String starterCode = (String) jo.get("starter_code");
        //get the instructions 
        String instructions = (String) jo.get("description");
        //add the file path on 
        instructions = filePath + instructions;
        Activity newActivity = new Activity(id, tHarness, starterCode, instructions);
        return newActivity;
   }
    
    /**
     * Returns the Activity model
     * @return 
     */
    public Activity getActivityModel() throws Exception{
        /**File Path being used is directory data, this should
         * change going forward
        */
        Activity newActivity = this.createActivityModel(this.directoryData);
        return newActivity;
    }
    
    
}
