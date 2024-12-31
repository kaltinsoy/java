// **************************************************************** 
// IntList.java 
// 
// An (unsorted) integer list class with a method to add an 
// integer to the list and a toString method that returns the contents 
// of the list with indices. 
// **************************************************************** 
public class IntList { 
    protected int[] list; 
    protected int numElements = 0; 

    //------------------------------------------------------------- 
    // Constructor -- creates an integer list of a given size. 
    //------------------------------------------------------------- 
    public IntList(int size) { 
        list = new int[size]; 
    } 

    //------------------------------------------------------------- 
    // Adds an integer to the list. If the list is full, 
    // prints a message and does nothing. 
    //------------------------------------------------------------- 
    public void add(int value) { 
        if (numElements == list.length) { 
            System.out.println("Can't add, list is full"); 
        } else { 
            list[numElements] = value; 
            numElements++; 
        } 
    } 

    //------------------------------------------------------------- 
    // Returns the list elements with indices as a string. 
    //------------------------------------------------------------- 
    @Override
    public String toString() { 
        StringBuilder result = new StringBuilder(); 
        for (int i = 0; i < numElements; i++) { 
            result.append(i).append(": ").append(list[i]).append("\n"); 
        } 
        return result.toString(); 
    } 
} 

// ------------------------------------------------------------- 
// Interface for sorting numbers. 
// ------------------------------------------------------------- 
interface NumberSorter { 
    void sortNumbers(); 
} 