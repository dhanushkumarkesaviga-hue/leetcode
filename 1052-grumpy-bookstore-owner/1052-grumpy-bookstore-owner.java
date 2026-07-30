class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int n = customers.length;
        int s = grumpy.length;
        int sum = 0;
        int e = 0;
        for (int i = 0; i < n; i++) {
            if (grumpy[i] == 0) {
                sum += customers[i];
            }
        }
        for (int i = 0; i < minutes; i++) {
            if (grumpy[i] == 1) {
                e += customers[i];
            }
        }
        int max = e;
        for (int i = minutes; i < n; i++) {
            if (grumpy[i - minutes] == 1) {
                e -= customers[i-minutes];
            }
            if (grumpy[i] == 1) {
                e += customers[i];
            }
     max = Math.max(max, e);
        }

        return sum + max;
    }
}