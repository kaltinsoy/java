// ****************************************************************** 
// Backwards.java 
// 
// Uses a recursive method to print a string backwards. 
// ****************************************************************** 
import java.util.Scanner; 
public class Backwards 
{ 
 //-------------------------------------------------------------- 
 // Reads a string from the user and prints it backwards. 
 //-------------------------------------------------------------- 
 public static void main(String[] args) 
 { 
 String msg; 
 Scanner scan = new Scanner(System.in); 
 System.out.print("Enter a string: "); 
 msg = scan.nextLine(); 
 System.out.print("\nThe string backwards: "); 
 printBackwards(msg); 
 System.out.println(); 
 } 
 
 //-------------------------------------------------------------- 
 // Takes a string and recursively prints it backwards. 
 //-------------------------------------------------------------- 
 public static void printBackwards(String s) 
 { 
    if (s.isEmpty()) {
        return;
    }
        System.out.print(s.charAt(s.length() - 1)); 
        printBackwards(s.substring(0, s.length() - 1)); 
 // Fill in code 
 } 
}