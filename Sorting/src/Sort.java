import java.util.ArrayList;

public class Sort {

    public static void swap(ArrayList<String> data, int p1, int p2) {
        String t =data.get(p1);
        //Now we can do the swap
        data.set(p1, data.get(p2)); //Have to use data.get(p2) as the second argument because it doesnt know we want it
                                    //from the same array list.
        data.set(p2, t);
    }


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


}
