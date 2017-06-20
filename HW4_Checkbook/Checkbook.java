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
    private ArrayList<Check> checkList;
    /**
     * Constructor for objects of class Checkbook
     */
    public Checkbook()
    {
        checkList = new ArrayList<Check>();
    }
    
    public void addCheck(Check newCheck){
        checkList.add(newCheck);
    }
    
    public void printList(){
        for(Check check : checkList) {
           check.printCheck(); 
        }
    }
}
