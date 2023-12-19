public class Main {
    public static void main(String[] args) {
        SortedArray sortedArray = new SortedArray(10);
        sortedArray.put(2);
        sortedArray.put(8);
        sortedArray.put(4);
        sortedArray.put(12);
        sortedArray.put(5);
        System.out.println(sortedArray);
        sortedArray.put(3);
        System.out.println(sortedArray);

    }
}
