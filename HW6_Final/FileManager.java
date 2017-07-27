import java.io.*;
import java.util.*;
//I understnad nothing of this. Why on each part and how it works. It feels like we just copy and paste from your website and just accept it without understanding what each part is.
//import statements
public class FileManager{
    //instance variables
    String fileName;
    
    public FileManager(String fileName){
        this.fileName = fileName;
    }
    
    public static void save(){
        //open file
        //Create object that writes to the file
        //go through the whole checkbook with all of the objects
        //Convert each object into a byte string
        //write the byte string into the file
        //end when there are no lines
        //close file
    }
    
    public static void load(){
        //open file
        //create an object that can read the file
        //read each byte string from the file
        //convert each byte string into an object of Check
        //add object into the checkbook
        //go to next line and repeat until there is no more
        //close the file
    }
    
    //setters
    public void setFileName(String newFileName){
        fileName = newFileName;
    }
    //getters
    public void getFileName(){
        System.out.println("The file name fo this file manager is " + fileName);
    }
}
