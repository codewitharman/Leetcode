class Solution {
    public int secondHighest(String s) {
        char [] digitsArrays=s.replaceAll("[^0-9]","").toCharArray(); 
        System.out.println(Arrays.toString(digitsArrays));
        int largest=-1, secondLargest=-1;

        
        for(char ch: digitsArrays){
            if(Character.isDigit(ch)){
                int num=ch-'0';
                if(num>largest){
                    secondLargest=largest;
                    largest=num;
                }else if(num<largest && num>secondLargest){
                    secondLargest=num;    
                }
            }
        }
        return secondLargest;
    }
}