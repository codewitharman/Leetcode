import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public boolean canBeIncreasing(int[] nums) {
        List<Integer> list = new ArrayList<>();

        for(int num: nums){
            list.add(num);
        }



        for(int i=0;i<list.size();i++){
            int removed =list.remove(i);  //removed elemnt to appnedn back
             boolean increasing = true;
            for(int j=1;j<list.size();j++){ //check if list is sorted here 
                if(list.get(j)<=list.get(j-1)){
                    increasing=false;
                }
            }
            list.add(i,removed);

            if (increasing) {
                return true;
            }
        }
        
        return false;
    }
}