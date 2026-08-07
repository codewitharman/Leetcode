class Solution {
    public int findClosest(int x, int y, int z) {
        int firstDis = Math.abs(z - x);
        int secondDis = Math.abs(z - y);
        if (firstDis < secondDis)
            return 1;
        else if (firstDis > secondDis)
            return 2;

        return 0;
    }
}