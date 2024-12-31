// ********************************************************** 
// Player.java 
// 
// Defines a Player class that holds information about an athlete. 
// ********************************************************** 
import java.util.Scanner; 
public class Player 
{ 
 private String name; 
 private String team; 
 private int jerseyNumber; 
 //----------------------------------------------------------- 
 // Prompts for and reads in the player's name, team, and 
 // jersey number. 
 //----------------------------------------------------------- 
 public void readPlayer() 
 { 
 Scanner scan = new Scanner(System.in); 
 System.out.print("Name: "); 
 name = scan.nextLine(); 
 System.out.print("Team: "); 
 team = scan.nextLine(); 
 System.out.print("Jersey number: "); 
 jerseyNumber = Scan.nextInt(); 
 } 

@Override
   public boolean equals(Object obj) { 
        if (this == obj) return true; // Check if the two references are the same
        if (obj == null || getClass() != obj.getClass()) return false; // Ensure obj is a Player

        Player other = (Player) obj; // Typecast obj to Player
        return team.equals(other.team) && jerseyNumber == other.jerseyNumber; 
    } 

    //----------------------------------------------------------- 
    // Returns a string representation of the player. 
    //----------------------------------------------------------- 
    @Override
    public String toString() { 
        return "Name: " + name + ", Team: " + team + ", Jersey Number: " + jerseyNumber; 
    } 
}