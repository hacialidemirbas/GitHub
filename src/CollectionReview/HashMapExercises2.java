package CollectionReview;

import java.util.HashMap;

    public class HashMapExercises2 {
        public static void main(String[] args) {
            int[] arr = {1, 2, 3, 4, 3, 4, 5, 6, 7, 5, 3, 4, 1};
            System.out.println(findFrequencies(arr));
        }

        public static HashMap<Integer, Integer> findFrequencies(int[] arr) {
            HashMap<Integer, Integer> freq = new HashMap<>();
            for (int num : arr) {
                if (freq.containsKey(num)) {
                    freq.put(num, freq.get(num) + 1);
                } else {
                    freq.put(num, 1);
                }


            }return freq;
        }
    }

