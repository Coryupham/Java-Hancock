import java.util.ArrayList;

public class Sort {

    public static void swap(ArrayList<String> data, int p1, int p2) {
        String t =data.get(p1);
        //Now we can do the swap
        data.set(p1, data.get(p2)); //Have to use data.get(p2) as the second argument because it doesnt know we want it
                                    //from the same array list.
        data.set(p2, t);
    }

////////////////////////BUBBLE SORT////////////////////////////////////
    public static void bubbleSort(ArrayList<String> data) {
        int numPasses = 0, numSwaps = 0;
        for (int end = data.size() - 1; end > 0; end--) {
            numPasses++;
            for (int current = 0; current <= end - 1; current++) {
                if (data.get(current).compareToIgnoreCase(data.get(current + 1)) > 0) {
                    //"Apple".compareTo("Zebra")
                    //negative  left < right
                    //zero = exact match   left == right
                    //positive  left > right

                    //
                    Sort.swap(data, current, current + 1);
                    numSwaps++;
                }
            }
        }
        System.out.println("Number of passes: " + numPasses);
        System.out.println("Number of swaps: " + numSwaps);
    }

    ///////////////////////// SELECTION SORT ////////////////////////////////
    public static void selectionSort(ArrayList<String> data){

        int numPasses = 0, numSwaps = 0;


        for(int startScan = 0; startScan < data.size()-1; startScan++){
            numPasses++;
            int minIndex = startScan;
            for(int index = startScan+1; index < data.size(); index++){
                if (data.get(index).compareToIgnoreCase(data.get(minIndex)) < 0){
                    minIndex = index;
                }
            }
            swap(data, startScan, minIndex);
            numSwaps++;
        }
        System.out.println("Number of passes: " + numPasses);
        System.out.println("Number of swaps: " + numSwaps);
    }


    //////////////////////////INSERTION SORT///////////////////////////////////
    public static void insertionSort(ArrayList<Integer> data) {

        int numPasses = 0, numSwaps = 0;


        for (int x = 1; x < data.size(); x++){ // for loop that starts at position 1 !!! NOT 0 !!!
            //get the value for comparison
            //this value will be moved at the end of the pass
            numPasses++;
            Integer unsortedValue = data.get(x);
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

    public static int partition(ArrayList<String> data, int start, int end){
        int mid = (start + end) /2; //integer math: no fractions
        String pivotValue = data.get(mid);
        swap(data, start, mid);
        int endOfList = start;

        for(int x = start + 1; x <= end; x++){
            if(data.get(x).compareToIgnoreCase(pivotValue) <= 0){
                endOfList++;
                swap(data, x, endOfList);
            }
        }
        swap(data, start, endOfList); // move pivot to final spot
        return endOfList;
    }

    public static void quickSort (ArrayList<String> data, int start, int end){
        if (start < end){ // if we actually have work to do then partition
            int positionOfElementThatIsNowSorted = partition(data, start, end);
            quickSort(data, start, positionOfElementThatIsNowSorted - 1);
            quickSort(data, positionOfElementThatIsNowSorted + 1, end);
        }
    }
    public static void quickSort(ArrayList<String> data){
        quickSort(data, 0, data.size() - 1);
    }

}
