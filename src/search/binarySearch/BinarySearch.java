package search.binarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,5,5,5,5,6,7,8,9};
        System.out.println(new BinarySearch().binarySearchMid(nums,5));
        System.out.println(new BinarySearch().binarySearchLeft(nums,5));
        System.out.println(new BinarySearch().binarySearchRight(nums,5));
    }

    /**
     *  找到重复数字中间的数字
     * @param nums
     * @param target
     * @return
     */
    public int binarySearchMid(int[] nums , int target){
        int left = 0;
        int right = nums.length-1;

        while(left <= right){
            int mid = (left + right) / 2;
            if (nums[mid] == target){
                return mid;
            }else if (nums[mid] > target ){
                right = mid - 1;
            }else if(nums[mid] < target){
                left = mid + 1;
            }
        }
        return -1;
    }


    public int binarySearchLeft(int[] nums, int target){

        int left = 0;
        int right = nums.length;

        while(left < right){
            int mid = (left + right) / 2 ;
            if(nums[mid] == target){
                right = mid;
            }else if(nums[mid] > target){
                right = mid;
            }else if(nums[mid] < target){
                left = mid+1;
            }
        }
        return left;
    }
    public int binarySearchRight(int[] nums, int target){
        int left = 0;
        int right = nums.length;

        while(left < right){
            int mid = (left + right) / 2 ;
            if(nums[mid] == target){
                left = mid+1;
            }else if(nums[mid] > target){
                right = mid;
            }else if(nums[mid] < target){
                left = mid+1;
            }
        }
        return left - 1;
    }

}
