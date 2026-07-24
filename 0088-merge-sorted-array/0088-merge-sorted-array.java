class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int[] nums = new int[m + n];
        int k = 0;
        int i = 0;
        int j = 0;
        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                nums[k++] = nums1[i];
                i++;
            } else {
                nums[k++] = nums2[j];
                j++;
            }

        }
        while (j < n) {
            nums[k++] = nums2[j];
            j++;
        }
        while (i < m) {
            nums[k++] = nums1[i];
            i++;
        }
        for (int l = 0; l < nums.length; l++) {
            nums1[l] = nums[l];
            System.out.println(nums[l]);
        }

    }
}