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
                if (data.get(current).getMake().compareTo((data.get(current + 1).getMake())) > 0)

                    Sort.swap(data, current, current + 1);
            }
        }
    }
}
