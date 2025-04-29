import java.util.Iterator; 
import java.util.Scanner;

public class TelephoneDirectory 
{
    private DictionaryInterface<Name, String> phoneBook;
    
    public TelephoneDirectory() 
    {
        //phoneBook = new SortedArrayDictionary<>(); 
        phoneBook = new SortedLinkedDictionary<>(); //Currently Linked Directory
    } // end default constructor
 
