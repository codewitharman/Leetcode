class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> map = new TreeMap<>();
        for (int num : arr1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int num : arr2) {
            while (map.get(num) > 0) {
                list.add(num);
                map.put(num, map.get(num) - 1);
            }
            map.remove(num);
        }

        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            int key = e.getKey();
            int freq = e.getValue();
            while (freq > 0) {
                list.add(key);
                freq--;
            }
        }

        int[] result = new int[arr1.length];
        int index = 0;

        for (int num : list) {
            result[index++] = num;
        }

        return result;

    }
}