/*
// Name: CorrectnessEvaluator.java                   //
// Date: 11/26/2021                                 //
// Description: This is the class to evaluate      //
// the correctness of the submitted code          //
*/
package edu.endicott.ltcj.codeevaluators;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;



/**
 *
 * @author Adriano
 */

//Last Edited: Mor  Ohana 12/12/2021 
public class CorrectnessEvaluator  {
    
    int p; //number of tests pass
    int n; //numebr of tests run
    
    
    
    
    
    /**
     * method to compile a file
     */
     private static void runProcess(File fie) throws Exception {
//        Process pro = Runtime.getRuntime().exec(file);
//        //System.out.println("Command Being Printed Out");
//        //System.out.println(command);
//        printLines(command + " stdout:", pro.getInputStream());
//        printLines(command + " stderr:", pro.getErrorStream());
//        pro.waitFor();
//        System.out.println(command + " exitValue() " + pro.exitValue());
      }
     
     
     
    /**
     * inserts code into TestHarness file and compile it
     */
    public boolean runCode(String code){
       
        File fileToBeModified = new File("learn-to-code-java/src/main/demos/activity-one-demos/TestHarness.java");        
        String oldContent = "PLAYER_CODE_HERE";      
        BufferedReader reader = null;      
        FileWriter writer = null;
        String newString = code;
         
        try
        {
            reader = new BufferedReader(new FileReader(fileToBeModified));           
           
            //Reading all the lines of input text file into oldContent          
            String line = reader.readLine();
             
            while (line != null) 
            {
                oldContent = oldContent + line + System.lineSeparator();               
                line = reader.readLine();
            }
             
            //Replacing oldString with newString in the oldContent           
           // String newContent = oldContent.replaceAll(oldString, newString);
             
            //Rewriting the input text file with newContent             
            writer = new FileWriter(fileToBeModified);
             
            //writer.write(newContent);
        }
        catch (IOException e)
        {
            e.printStackTrace();
            return false;
        }
        
        
        n++;
        
        try {
           // runProcess("pwd");
            System.out.println("**********");
            runProcess(fileToBeModified);
            System.out.println("compiled correctly");
            System.out.println("**********");
            p++;
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
        
    
    
    
    /**
     * gets the results from test harness
     */
    public void getTestHarnessResults(File file){
        try{
        //runProcess("pwd");
        System.out.println("**********");
        runProcess(file);
        System.out.println("compiled correctly");
        System.out.println("**********");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    /**
     * gets the number tests pass/ tests run
     */
    public void getTestsPass(){
         System.out.println( p + "/" + n);
    }
    
    
}
