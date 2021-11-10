import java.util.ArrayList;

public class ToolBox implements GenericTools{
    @Override
    public <T> void swap(ArrayList<T> data, int p1, int p2) {

    }

    @Override
    public <T extends Comparable<T>> void insertionSort(ArrayList<T> data) {

    }

    @Override
    public <T extends Comparable<T>> ArrayList<T> insertionSort(ArrayList<T> data, int start, int end) {
        for (int x = 1; x < data.size(); x++){ // for loop that starts at position 1 !!! NOT 0 !!!
            //get the value for comparison
            //this value will be moved at the end of the pass

            T unsortedValue = data.get(x);
            //make a counter that travels to the left
            int scan = x;
            //while there are more numbers to consider
            // AND the thing on the left is greater than the unsortedValue
            while (scan > 0
                    && data.get(scan-1) > unsortedValue){
                //move the left value to the right by 1
                data.set(scan, data.get(scan - 1));
                numSwaps ++;
                //go to next element
                scan--;
            }
            //place unsorted element at the correct (beginning) of the array.
            data.set(scan, unsortedValue);
            numSwaps++;
        }
        numSwaps /= 2;
//        System.out.println("Number of passes: " + numPasses);
//        System.out.println("Number of swaps: " + numSwaps);
    }
    }
}
