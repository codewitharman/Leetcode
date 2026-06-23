class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();

        for (int num = left; num <= right; num++) {
            int temp = num; //never modify original number
            boolean flag = true;

            while (temp > 0) {
                int digit = temp % 10; //48 //8

                if (digit == 0 || num % digit != 0) {  //8%8--0 true
                    flag = false;
                    break;
                }

                temp /= 10; //4
            }

            if (flag) {
                list.add(num); //48
            }
        }

        return list;
    }
}