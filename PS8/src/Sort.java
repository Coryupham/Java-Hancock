import java.util.ArrayList;

public class Sort {

    public static void swap(ArrayList<Car> data, int p1, int p2) {
        Car t = data.get(p1);

        data.set(p1, data.get(p2));

        data.set(p2, t);
    }

    ////////////////////////BUBBLE SORT////////////////////////////////////
    public static void bubbleSort(ArrayList<Car> data) {
        for (int end = data.size() - 1; end > 0; end--) {
            for (int current = 0; current <= end - 1; current++) {
                if (data.get(current).getMake().compareToIgnoreCase((data.get(current + 1).getMake())) > 0) {
                    Sort.swap(data, current, current + 1);
                } else if (data.get(current).getMake().equalsIgnoreCase((data.get(current + 1).getMake()))) {
                    if (data.get(current).getmodel().compareToIgnoreCase((data.get(current + 1).getmodel())) > 0) {
                        Sort.swap(data, current, current + 1);
                    } else if (data.get(current).getmodel().equalsIgnoreCase((data.get(current + 1).getmodel()))) {
                        if (data.get(current).getYear() > data.get(current + 1).getYear()) {
                            Sort.swap(data, current, current + 1);
                        }
                    }
                }
            }
        }
    }


    public static void selectionSort(ArrayList<Car> data) {


        for (int startScan = 0; startScan < data.size() - 1; startScan++) {

            int minIndex = startScan;
            for (int index = startScan + 1; index < data.size(); index++) {
                if (data.get(index).getMake().compareToIgnoreCase(data.get(minIndex).getMake()) < 0) {
                    minIndex = index;
                } else if (data.get(index).getMake().equalsIgnoreCase(data.get(minIndex).getMake())) {
                    if (data.get(index).getmodel().compareToIgnoreCase(data.get(minIndex).getmodel()) < 0) {
                        minIndex = index;
                    } else if (data.get(index).getmodel().equalsIgnoreCase(data.get(minIndex).getmodel())) {
                        if (data.get(index).getYear() < (data.get(minIndex).getYear())) {
                            minIndex = index;
                        }
                    }
                }
            }
            swap(data, startScan, minIndex);
        }
    }

    public static void selectionSortYear(ArrayList<Car> data) {
        for (int startScan = 0; startScan < data.size() - 1; startScan++) {
            int minIndex = startScan;
            for (int index = startScan + 1; index < data.size(); index++) {
                if (data.get(index).getMake().compareToIgnoreCase(data.get(minIndex).getMake()) < 0) {
                    minIndex = index;
                }
                else if (data.get(index).getMake().equalsIgnoreCase(data.get(minIndex).getMake())) {
                    if (data.get(index).getYear() > (data.get(minIndex).getYear())) {
                        minIndex = index;
                    }
                    else if (data.get(index).getYear() == data.get(minIndex).getYear()) {
                        if (data.get(index).getVIN().compareToIgnoreCase(data.get(minIndex).getVIN()) > 0) {
                            minIndex = index;
                        }
                    }
                }
            }
            swap(data, startScan, minIndex);
        }
    }
}

