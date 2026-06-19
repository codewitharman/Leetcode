class Solution {

    public boolean rotateString(String s, String goal) {

        if(s.length() != goal.length()){
            return false;
        }

        if(s.length() == 1){
            return s.charAt(0) == goal.charAt(0);
        }

        StringBuilder sb = new StringBuilder(s);

        sb.append(s);

        int p1 = 0;
        int p2 = s.length();

        while(p2 <= sb.length()){

            if(sb.substring(p1, p2).equals(goal)){
                return true;
            }

            p1++;
            p2++;
        }

        return false;
    }
}