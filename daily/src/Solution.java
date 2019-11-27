public class Solution {
    public int removeDuplicates(int[] nums){
        int retVal = 0;
        int current = Integer.MIN_VALUE;
        int dupCount = 0;
        for (int i=0; i< nums.length; i++){
            if (current != nums[i]){
                current = nums[i];
                nums[i-dupCount] = nums[i];
            }
            else {
                dupCount++;
            }
        }
        return (nums.length - dupCount);
    }
    public static void main(String[] args){
        Solution s = new Solution();
        int[] array = new int[]{1,1,2,2,3,4,5,5,5,5,6,6,7,8,9,10};
        int count = s.removeDuplicates(array);
        for (int i=0; i< count; i++){
            System.out.print(array[i]);
        }
    }

}
