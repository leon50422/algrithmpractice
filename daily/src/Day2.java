public class Day2 {
    public static void rotate(int[] nums, int k){
            for (int i=0; i < k ; i ++) {
                for (int j = nums.length -1 ; j > 0; j-- ){
                    int l = nums[j];
                    nums[j] = nums[j-1];
                    nums[j-1] = l;
                }
            }
    }

    public static void main(String[] args) {
        int[] a = new int[]{1,2,3,4,5,6,7};
        Day2.rotate(a,3);
        for (int i=0; i< a.length; i++){
            System.out.print(a[i]);
        }
    }
}
