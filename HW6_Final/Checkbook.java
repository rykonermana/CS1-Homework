import java.util.*;
//import statements
//The part in this that I don't understand is the ArrayList part. I don't know how to put any of the parts together or what they do. 
public class Checkbook{
    //instance varibles
    
    //array for checks needed
    public static ArrayList checkList = new ArrayList();
    //constructor
    public Checkbook(){
        //creates a file manager specifically for this checkbook and gives it the name manager for ease of use  
        FileManager manager = new FileManager("HW6ObjectKeeper.txt");
        
    }
    //saves the checkbook to the text file
    public static void saveCheckbook(){
        FileManager.save();
    }
    //retrieves the objects from the text file and adds them to the checkbook
    public static void loadCheckbook(){
        FileManager.load();
    }
    
    //prints off all checks in the checkbook
    public static void printAll(){
       /*
        for (Check c: checkList){
           c.printCheck();
        }
        */
    }
}