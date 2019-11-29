public class Day1 {
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

    public int removeDuplicates2(int[] nums){
        int retVal = 0;
        int index = 0;
        for (int i=0; i< nums.length; i++){
            if (nums[index] != nums[i]){
                nums[++index] = nums[i];
            }
        }
        return index+1;
    }

    public static void main(String[] args){
        Day1 s = new Day1();
        int[] array = new int[]{1,1,2,2,3,4,5,5,5,5,6,6,7,8,9,10};
        int count = s.removeDuplicates(array);
        for (int i=0; i< count; i++){
            System.out.print(array[i]);
        }
        System.out.print("\n");
        int[] array2 = new int[]{1,1,2,2,3,4,5,5,5,5,6,6,7,8,9,10};
        int count2 = s.removeDuplicates2(array2);
        for (int i=0; i< count2; i++){
            System.out.print(array2[i]);
        }
    }

}
