class Solution {
    public int firstUniqChar(String s) {
        Map<Character, Integer> map = new HashMap<>();
        Queue<Integer> queue=new LinkedList<>();
       for(int i =0;i<s.length();i++){
            char ch=s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
            queue.offer(i);
            while (!queue.isEmpty() && map.get(s.charAt(queue.peek())) > 1) {
                queue.poll();
            }
       }
        
        return queue.isEmpty() ? -1 : queue.peek();
    }
}