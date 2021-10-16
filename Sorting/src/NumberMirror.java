import java.util.ArrayList;

public class NumberMirror {
    public static void insertionSort(ArrayList<String> data) {

        int numPasses = 0, numSwaps = 0;
        for (int x = 1; x < data.size(); x++) { // for loop that starts at position 1 !!! NOT 0 !!!
            //get the value for comparison
            //this value will be moved at the end of the pass
            String unsortedValue = data.get(x);
            //make a counter that travels to the left
            int scan = x;
            //while there are more numbers to consider
            // AND the thing on the left is greater than the unsortedValue
            while (scan > 0
                    && data.get(scan - 1).compareToIgnoreCase(unsortedValue) > 0) {
                //move the left value to the right by 1
                data.set(scan, data.get(scan - 1));
                numSwaps++;
                //go to next element
                scan--;
            }
            //place unsorted element at the correct (beginning) of the array.
            data.set(scan, unsortedValue);
        }
    }
}
