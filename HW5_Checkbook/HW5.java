import java.io.*;
public class HW5{
    String fileName;
    public HW5(String tempFileName){
        fileName = tempFileName; //provides the name of the file that holds the save data.
    }
    
    private static String getUserOptions(){
        String x;
        System.out.println("A  Get current balance");
        System.out.println("Q  Quit");
        System.out.println("P  Print off all of your checks");
        System.out.println("D  Create a new check and add it to the checkbook");
        System.out.println("R  Recover prevois work saved");
        System.out.println("S  Save your work");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        x = System.in();
        return x;
    }
    public static void main(String[] args) {
        String choice;
        while (choice != "q"){
            choice = getUserOptions();
            switch (choice){
                case "a"://gets total balance from checkbook
                case "A":System.out.println("Current balance is "+ Checkbook.getBalance());
                break;
                case "q"://quits and serializes
                case "Q": System.out.println("Goodbye");
                Persist keeper = new Persist();
                
                break;
                case "p"://prints off all of the checks in the checkbook
                case "P": 
                Checkbook.printList();
                break;
                case "d"://Adds new check to chekbook and adds it to the checkbook
                case "D":
                
                break;
                
            }
        }
    }
}