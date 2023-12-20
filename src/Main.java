public class Main {
    public static void main(String[] args) {
        SortedArray sortedArray = new SortedArray(5);
        sortedArray.put(2);
        sortedArray.put(8);
        sortedArray.put(4);
        sortedArray.put(12);
        sortedArray.put(5);
        System.out.println("---SortedArray---");
        System.out.println(sortedArray);

        System.out.println("---getNumElements---");
        System.out.println(sortedArray.getNumElements());

        System.out.println("---getElementsAt---");
        System.out.println(sortedArray);

        System.out.println("I want position 2:");
        System.out.println(sortedArray.getElementAt(2));

        System.out.println("---removeElementsAt---");
        sortedArray.removeElemtent(2);
        System.out.println(sortedArray);

        System.out.println("---isEmpty---");
        System.out.println(sortedArray);
        System.out.println(sortedArray.isEmpty());

        System.out.println("---isFull---");
        System.out.println(sortedArray);
        System.out.println(sortedArray.isFull()); // false because we removed with the removeElement

        System.out.println("---existElement---");
        System.out.println(sortedArray.existsElement(2));

        System.out.println("---existElementBinarySearch---");
        System.out.println(sortedArray.existsElementBinarySearch(2));



    }
}
