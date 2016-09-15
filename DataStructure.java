import java.util.function.Function;
public class DataStructure {
    
    // Create an array
    private final static int SIZE = 15;
    private int[] arrayOfInts = new int[SIZE];
    
    public DataStructure() {
        // fill the array with ascending integer values
        for (int i = 0; i < SIZE; i++) {
            arrayOfInts[i] = i;
        }
    }
    
    public void printEven() {
        
        // Print out values of even indices of the array
        DataStructureIterator iterator = this.new EvenIterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }
  
    public int size(){
      return SIZE;
    }
  
    public int get(int index){
      return arrayOfInts[index];
    }

    public static Boolean isEvenIndex(Integer i){
        if (i % 2 == 1) return Boolean.FALSE;
        return Boolean.TRUE;
    }
  
    public static Boolean isOddIndex(Integer i){
        if (i % 2 == 0) return Boolean.FALSE;
        return Boolean.TRUE;
    }
  
    public void print(Function<Integer, Boolean> function){
        for (int i = 0; i < SIZE; i++) {
            if (function.apply(i)) {
                System.out.print(arrayOfInts[i] + " ");
            }
        }
        System.out.println();
    }
  

  
    public void print(DataStructureIterator iterator)
    {
        if (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }
  
    public DataStructureIterator getEvenIterator() {
        return new EvenIterator();
    }
    
    interface DataStructureIterator extends java.util.Iterator<Integer> { } 

    // Inner class implements the DataStructureIterator interface,
    // which extends the Iterator<Integer> interface
    
    private class EvenIterator implements DataStructureIterator {
        
        // Start stepping through the array from the beginning
        private int nextIndex = 0;
        
        public boolean hasNext() {
            
            // Check if the current element is the last in the array
            return (nextIndex <= SIZE - 1);
        }        
        
        public Integer next() {
            
            // Record a value of an even index of the array
            Integer retValue = Integer.valueOf(arrayOfInts[nextIndex]);
            
            // Get the next even element
            nextIndex += 2;
            return retValue;
        }
      

    }
    
    public static void main(String s[]) {
        
        // Fill the array with integer values and print out only
        // values of even indices
        DataStructure ds = new DataStructure();
        ds.printEven();
        ds.print(ds.getEvenIterator());
        ds.print(ds.new EvenIterator());
        ds.print(
            new DataStructure.DataStructureIterator() {
                private int nextIndex = 1;
                public boolean hasNext() {
                    return (nextIndex <= ds.size() - 1);
                }
                public Integer next() {
                    int retValue = ds.get(nextIndex);
                    nextIndex += 2;
                    return retValue;
                }
            }
        );
        ds.print((Integer i) -> i%2==1);
        ds.print(DataStructure::isEvenIndex);
        ds.print(DataStructure::isOddIndex);
      
    }
} 
