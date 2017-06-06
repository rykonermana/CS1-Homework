import java.util.*;
/**
 * Write a description of class Checkbook here.
 *
 * @author Dan Reuter
 * @version 2017.06.05
 */
public class Checkbook
{
    // instance variables - replace the example below with your own
    private ArrayList<Check> checks;
    /**
     * Constructor for objects of class Checkbook
     */
    public Checkbook()
    {
        checks = new ArrayList<Check>();
    }
    
    public void addCheck(Check newCheck){
        checks.add(newCheck);
    }
    
    public void printList(){
        for(Check check : checks) {
           check.printCheck(); 
        }
    }
}
