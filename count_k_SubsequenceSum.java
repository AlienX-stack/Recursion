// Printing count of Subsequence whose sum is k

class k_SubsequenceSum {
    public static int ksumanySubsequence(int index, int[] arr, int sum, int calSum) {
        // Condition not satisfied
        // Strictly done if array contains positives only
        if (calSum > sum) return 0;
        if (index == arr.length) {
            // Condition satisfied
            if (calSum == sum) {
                return 1;
            }
            return 0;
        } else {
            // Take
            int l = ksumanySubsequence(index + 1, arr, sum, calSum);
            calSum += arr[index];
            // res.add(arr[index]);

            // Not Take
            int r = ksumanySubsequence(index + 1, arr, sum, calSum);
            calSum -= arr[index];
            // res.remove(res.size()-1);

            return l + r;
        }

    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 1};
        // ArrayList<Integer> res = new ArrayList<>();
        int sum = 2;
        int count = ksumanySubsequence(0, arr, sum, 0);
        System.out.print(count);
    }
}
