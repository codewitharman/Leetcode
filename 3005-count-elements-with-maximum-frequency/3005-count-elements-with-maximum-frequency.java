class Solution {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int num: nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        int max=Integer.MIN_VALUE;
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()>max){
                max=entry.getValue();
            }
        }

        int sum=0;
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()==max){
                sum=sum+entry.getValue();
            }
        }
        System.out.println(sum);
        return sum;
    }
}