package ExceptionHandling;
import java.util.InputMismatchException;
import java.util.Scanner;
public class exceptHandling {
    public static void main(String[] args) {
        try( Scanner sc=new Scanner(System.in);){
            System.out.println("Enter a number:");
            int num=sc.nextInt();
            System.out.println(num);
        }
        catch(InputMismatchException e){
            System.out.println("This is not a number");
        }
        catch(ArithmeticException e){
            System.out.println("Cant divide by zero");
        }
        catch(Exception e){
            System.out.println("Something went wrong");
        }
        finally{
            System.out.println("Finally-always exec");
            
        }
    
        
    }
}
