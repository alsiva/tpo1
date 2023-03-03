import java.util.*;

public class BucketSorter {

    private static void binSort(int[] array, int bucketSize, int maxElement) {

        List<Integer>[] buckets = new List[bucketSize];
        OptionalInt maxValue = Arrays.stream(array).max();

        for (int i = 0; i < bucketSize; i++) {
            buckets[i] = new LinkedList<>();
        }

        for (int num : array) {
            int hash = (num * bucketSize) / (maxElement + 1);
            buckets[hash].add(num);
        }

        for (List<Integer> bucket : buckets) {
            Collections.sort(bucket);
        }

        int index = 0;
        for (List<Integer> bucket : buckets) {
            for (int num : bucket) {
                array[index++] = num;
            }
        }


    }

    static int maxValue(int[] array)
    {
        int maxValue = 0;
        for (int i = 0; i < array.length; i++)
            if (array[i] > maxValue)
                maxValue = array[i];
        return maxValue;
    }

    public int[] result(int[] array) {
        binSort(array, array.length, maxValue(array));
        return array;
    }
}