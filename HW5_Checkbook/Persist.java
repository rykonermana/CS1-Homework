import java.io.*;
public class Persist{
    public static void main(String args[]){
        Check c1= new Check(101, 46.78, "Tau", "Alpha");
        Check c2= new Check(102, 95.58, "Upsilon", "Beta");
        Check c3= new Check(103, 653.58, "Phi", "Gamma");
        Check c4= new Check(104, 6.57, "Chi", "Delta");
        Check c5= new Check(105, 6.49, "Psi", "Epsilon");
        try {
            FileOutputStream f = new FileOutputStream("ObjectKeeper.txt", true);
            ObjectOutputStream out = new ObjectOutputStream(f);
            
            out.writeObject(c1);
            out.flush();
        }
        catch (IOException e){
            e.printStackTrace();
            System.out.println("Unable to serialize the object");
        }
        
    }
}