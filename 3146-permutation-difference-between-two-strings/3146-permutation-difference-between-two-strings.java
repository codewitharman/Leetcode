class Solution {
    public int findPermutationDifference(String s, String t) {

        Map<Character, Integer> sMap = new HashMap<>();
        Map<Character, Integer> tMap = new HashMap<>();
        int i = 0;
        int j = 0;
        for (char ch : s.toCharArray()) {
            sMap.put(ch, i++);
        }
        for (char ch : t.toCharArray()) {
            tMap.put(ch, j++);
        }
        //System.out.println(sMap);
        //System.out.println(tMap);
        int sum = 0;
        for (int k = 0; k < s.length(); k++) {
            char ch = s.charAt(k);
            int num1=sMap.get(ch);
            int num2=tMap.get(ch);
            //System.out.println(num1+" - "+num2);
            sum =sum+ Math.abs(num1 - num2);
            //System.out.println("->"+sum);

        }

        return sum;

    }
}