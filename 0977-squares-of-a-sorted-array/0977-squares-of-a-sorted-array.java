class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] arr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] <= 0) {
                arr[i] = Math.abs(nums[i]);
            }else{
                arr[i]=nums[i];
            }    
        }
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            arr[i]=arr[i]*arr[i];
        }
        
        System.out.println(Arrays.toString(arr));
        return arr;
    }
}