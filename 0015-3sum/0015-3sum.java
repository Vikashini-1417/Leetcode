import java.util.*;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);

        List<Integer> neg = new ArrayList<>();
        List<Integer> pos = new ArrayList<>();
        List<Integer> zeros = new ArrayList<>();

        for (int num : nums) {
            if (num < 0) neg.add(num);
            else if (num > 0) pos.add(num);
            else zeros.add(num);
        }

        Set<List<Integer>> result = new HashSet<>();

        // Case 1: Three zeros
        if (zeros.size() >= 3) {
            result.add(Arrays.asList(0, 0, 0));
        }

        // Case 2: Zero with one positive and one negative
        if (!zeros.isEmpty()) {
            Set<Integer> negSet = new HashSet<>(neg);
            for (int p : pos) {
                if (negSet.contains(-p)) {
                    result.add(Arrays.asList(-p, 0, p));
                }
            }
        }

        // Case 3: Two negatives + one positive
        Map<Integer, List<int[]>> negPairs = new HashMap<>();
        for (int i = 0; i < neg.size(); i++) {
            for (int j = i + 1; j < neg.size(); j++) {
                int sum = neg.get(i) + neg.get(j);
                negPairs.computeIfAbsent(sum, k -> new ArrayList<>()).add(new int[]{neg.get(i), neg.get(j)});
            }
        }

        for (int p : pos) {
            int target = -p;
            if (negPairs.containsKey(target)) {
                for (int[] pair : negPairs.get(target)) {
                    List<Integer> triplet = Arrays.asList(pair[0], pair[1], p);
                    Collections.sort(triplet);
                    result.add(triplet);
                }
            }
        }

        // Case 4: Two positives + one negative
        Map<Integer, List<int[]>> posPairs = new HashMap<>();
        for (int i = 0; i < pos.size(); i++) {
            for (int j = i + 1; j < pos.size(); j++) {
                int sum = pos.get(i) + pos.get(j);
                posPairs.computeIfAbsent(sum, k -> new ArrayList<>()).add(new int[]{pos.get(i), pos.get(j)});
            }
        }

        for (int n : neg) {
            int target = -n;
            if (posPairs.containsKey(target)) {
                for (int[] pair : posPairs.get(target)) {
                    List<Integer> triplet = Arrays.asList(n, pair[0], pair[1]);
                    Collections.sort(triplet);
                    result.add(triplet);
                }
            }
        }

        return new ArrayList<>(result);
    }
}
