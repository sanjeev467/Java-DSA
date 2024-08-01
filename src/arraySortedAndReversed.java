// to check if array is both sorted and rotated
public class arraySortedAndReversed {
    public static boolean check(int[] nums) {
        int greaterCount = 0; // To count the number of places where the order is not maintained
        for(int i = 1; i<nums.length; i++){
            if(nums[i-1] >nums[i] ){
                greaterCount++;
            }
        }

        if(nums[nums.length - 1] > nums[0]){
            greaterCount++;
        }

        return greaterCount<=1;
    }
    public static void main(String[] args) {

        int[] nums = new int[]{3,4,5,1,2}; // eg for true
        //int[] nums = new int[]{2,1,3,4}; // eg for false
        System.out.println(check(nums));

    }
}
