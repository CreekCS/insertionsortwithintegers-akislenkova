import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
public class InsSortInt {
   public static void main(String[] args) throws FileNotFoundException{
            File myFile = new File("randInts.txt");
            Scanner reader = new Scanner(myFile);
            ArrayList<String> ints = new ArrayList<String>(1000);
                while(reader.hasNextLine()){
                    ints.add(reader.nextLine());
                }
                reader.close();
            int n = ints.size();
            int[] sortedInts = new int[n];
            for(int i=0; i<n; i++){
                int key = Integer.parseInt(ints.get(i));
                int j = i-1;
                while((j>=0) && (Integer.parseInt(ints.get(j))>key)){
                        sortedInts[j+1] = Integer.parseInt(ints.get(j));
                        j--;
                        sortedInts[j+1] = key;
                }
            }
            System.out.println(sortedInts[0]);
            System.out.println(sortedInts[999]);
        }
        
    }