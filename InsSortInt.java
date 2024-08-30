import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
public class InsSortInt {

    public static ArrayList<Integer> sortInsertion(ArrayList<Integer> a) {
        ArrayList<Integer> sorted = new ArrayList<Integer>(a.size());
        for(int i=0; i<a.size(); i++){
            Integer current = a.get(i);
            
            int k=0;
            for (; k<i; k++) {
                if (current < sorted.get(k)) {
                    break;
                }
            }
            sorted.add(k, current);
        }
        return sorted;

    }
    public static void main(String[] args){
        try {
            File myFile = new File("randInts.txt");
            Scanner reader = new Scanner(myFile);
            ArrayList<Integer> ints = new ArrayList<Integer>(1000);
            while(reader.hasNextLine()){
                ints.add(Integer.parseInt(reader.nextLine()));
            }
            reader.close();
            ArrayList<Integer> sorted = sortInsertion(ints);

           System.out.println("Smallest: " + sorted.get(0));
           System.out.println("Largest: " + sorted.get(sorted.size()-1));
        }
        catch(FileNotFoundException e) {
            System.out.println("File not found.");
        }
        
    }
}