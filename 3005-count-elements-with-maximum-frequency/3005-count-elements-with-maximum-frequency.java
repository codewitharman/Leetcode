class Solution {
    public int maxFrequencyElements(int[] nums) {
        char[] freq=new char[256];

        for(int num: nums){
            freq[num]++;
        }

        int max=-1;
        for(int i=0;i<freq.length;i++){
            max=Math.max(max,freq[i]);
        }

        int sum=0;
        for(int i=0;i<freq.length;i++){
            if(freq[i]==max){
                sum=sum+((char)freq[i]);
            }
        }

        
        return sum;
    }
}