package ReadFile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
public class fileRead {
    public static void main(String[] args) {
        String filepath="C:\\Users\\Brindashree R\\OneDrive\\Desktop\\read.txt";
        try(BufferedReader reader=new BufferedReader(new FileReader(filepath))){
            String line;
            while((line=reader.readLine())!=null){
                System.out.println(line);
            }
        }
        catch(FileNotFoundException e){
            System.out.println("File not found");
        }
        catch(IOException e){
            System.out.println("Something went wrong");
        }

    }
    
}
