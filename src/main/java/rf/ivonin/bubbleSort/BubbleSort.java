package rf.ivonin.bubbleSort;

public class BubbleSort {

    public static int[] sort(int[] data) {
        // пока происходят какие то перестановки isSorted = false
        var isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int x = 1; x < data.length; x++) {
                if (data[x] < data[x - 1]) {
                    int swap = data[x];
                    data[x] = data[x - 1];
                    data[x - 1] = swap;
                    isSorted = false;
                }
            }
        }

        return data;
    }
}