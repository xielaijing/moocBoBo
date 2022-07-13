public class LinearSearch {

    private LinearSearch() {

    }

    public static int search(int[] data, int target) {
        for (int i = 0; i < data.length; i++) {
            if (data[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] data = {43, 54, 23, 54, 23, 16, 54, 3, 5};

        int res = LinearSearch.search(data, 1);
        System.out.println(res);

    }
}
