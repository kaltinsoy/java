// **************************************************************** 
// SortedIntList.java 
// 
// A subclass of IntList that sorts the numbers in descending order. 
// **************************************************************** 
class SortedIntList extends IntList implements NumberSorter { 
    //------------------------------------------------------------- 
    // Constructor -- creates an integer list of a given size. 
    //------------------------------------------------------------- 
    public SortedIntList(int size) { 
        super(size); 
    } 

    //------------------------------------------------------------- 
    // Sorts the numbers in descending order. 
    //------------------------------------------------------------- 
    @Override
    public void sortNumbers() { 
        for (int i = 0; i < numElements - 1; i++) { 
            for (int j = 0; j < numElements - i - 1; j++) { 
                if (list[j] < list[j + 1]) { 
                    // Swap list[j] and list[j + 1] 
                    int temp = list[j]; 
                    list[j] = list[j + 1]; 
                    list[j + 1] = temp; 
                } 
            } 
        } 
    } 

    //------------------------------------------------------------- 
    // Adds an integer to the list and sorts it. 
    //------------------------------------------------------------- 
    @Override
    public void add(int value) { 
        super.add(value); 
        sortNumbers(); 
    } 
} 