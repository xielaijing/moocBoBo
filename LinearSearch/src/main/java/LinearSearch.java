public class LinearSearch {

    private LinearSearch() {

    }

    public static <E> int search(E[] data, E target) {
        for (int i = 0; i < data.length; i++) {
            if (data[i].equals(target)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Integer[] data = {43, 54, 23, 54, 23, 16, 54, 3, 5};

        int res = LinearSearch.search(data, 16);
        System.out.println(res);

    }
}
