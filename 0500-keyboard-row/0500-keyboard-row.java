class Solution {
    public String[] findWords(String[] words) {
        String row1="qwertyuiop";
        String row2="asdfghjkl";
        String row3="zxcvbnm";
        ArrayList<String> al=new ArrayList<String>();
        HashSet<Character> hs1=new HashSet<Character>();
        HashSet<Character> hs2=new HashSet<Character>();
        HashSet<Character> hs3=new HashSet<Character>();
        for(char ch:row1.toCharArray()){
            hs1.add(ch);
        }
        for(char ch:row2.toCharArray()){
            hs2.add(ch);
        }
        for(char ch:row3.toCharArray()){
            hs3.add(ch);
        }
       
        for(String word:words){

            HashSet<Character> hw=new HashSet<Character>();
            for(char ch:word.toLowerCase().toCharArray()){
                hw.add(ch);
            }
           
           if(hs1.containsAll(hw)){
               al.add(word);
           }
           else if(hs2.containsAll(hw)){
            al.add(word);
           }
           else if(hs3.containsAll(hw)){
            al.add(word);
           }


        }

        String arr[]=new String[al.size()];
        int i=0;
        for(String word:al){
            arr[i]=word;
            i++;
        }
      return arr;
    }
}