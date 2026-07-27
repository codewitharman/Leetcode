class Solution {
    public int digitFrequencyScore(int n) {
        String str = String.valueOf(n);
        int[] freq = new int[10];
        for (int i = 0; i < str.length(); i++) {
            int num = (int) str.charAt(i) - '0';
            freq[num]++;
        }
        int sum=0;
        for (int i = 0; i < freq.length; i++) 
            if (freq[i] > 0) 
                sum = sum + freq[i] * i;
            
        
        return sum;
    }
}