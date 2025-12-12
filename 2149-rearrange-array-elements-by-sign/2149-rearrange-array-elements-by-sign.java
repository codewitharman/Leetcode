class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int temp[]=new int[n];
        int posIndex=0;
        int negIndex=1;
        for(int i=0;i<n;i++){
            if(nums[i]<0){
                temp[negIndex]=nums[i];
                negIndex=negIndex+2;
            }else{
                temp[posIndex]=nums[i];
                posIndex=posIndex+2;
            }
        }
        return temp;
    }
}