class Solution {
    public String destCity(List<List<String>> paths) {
        for (List<String> innerList : paths) {
            String destination = innerList.get(1);
            boolean isStartingCity = false;

            for (List<String> path : paths) {
                if (path.get(0).equals(destination)) {
                    isStartingCity = true;
                    break;
                }
            }

            if (!isStartingCity) {
                return destination;
            }
        }

        return null;
    }
}