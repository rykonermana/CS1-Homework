import java.io.*;
//by the way, if you end up trying to retort with all of my questions with I should have uploaded it to GitHub and sent you an email with my questions, I don't want an email with two links to attempt to teach me what I don't know instead of actually teaching me and helping me.
//import statements
public class Main{
    //instance variables
    static String choice;
    //constructor
    public Main(){
        
    }
    
    //main method
    public static void main(String[] args){
        //creates a new checkbook upon starting
        //also creates a file manager uoin creation through the checkbook
        Checkbook trueCheckbook = new Checkbook();
        //start up the user interface
        userInterface();
        while(choice != "9"){
            switch(choice){
                case "1"://load the checkbook
                Checkbook.loadCheckbook();
                break;
                case "2"://write a check
                
                break;
                case "3"://print off all checks
                
                break;
                case "4"://save and quit
                Checkbook.saveCheckbook();
                choice = "9";
                break;
                case "9"://force quit
                System.exit(0);
            }
        }
    }
    public static void userInterface(){
        System.out.println("Start Menu");
        System.out.println("1.) Load the checkbook");
        System.out.println("2.) Write a check");
        System.out.println("3.) Print off all checks");
        System.out.println("4.) Save and quit");
    }
}