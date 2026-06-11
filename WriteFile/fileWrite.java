package WriteFile;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class fileWrite {
    public static void main(String[] args) {
        String filepath="text.txt";
        String textcontent="""
                Add milk and some water,
                add sugar,
                add coffee powder,
                wait until it boils up,
                cofee is ready.
                """;

                try(FileWriter writer=new FileWriter(filepath)){
                    writer.write(textcontent);
                    System.out.println("File has been written");
                }
                catch(FileNotFoundException e){
                    System.out.println("File not found");
                }
                catch(IOException e){
                    System.out.println("Couldn't write the file");
                }
                finally{
                    System.out.println("File!");
                }
    }
    
}
