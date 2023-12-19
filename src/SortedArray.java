public class SortedArray {
    private int[] array;
    private int numElements;

    public SortedArray(int size) {
        array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = -1;
        }
        numElements = 0;
    }

    public void put(int value) {
        int i = numElements - 1;
        while (i >= 0 && array[i] > value) {
            if (i + 1 < array.length) {
                array[i + 1] = array[i];
            }
            i--;
        }
        array[i + 1] = value;
        if (numElements < array.length) {
            numElements++;
        }
    }

@Override
    public String toString() {
        String result = "[";
        for (int i = 0; i < numElements - 1; i++) {
            result += array[i] + ", ";
        }
        result += array[numElements - 1] + "]";
        return result;
    }

    public int getNumElements() {
        return numElements;
    }

    public int getSize() {
        return array.length;
    }

    public void getElementAt(int index) {
        if (index < 0 || index >= numElements) {
            throw new IndexOutOfBoundsException(
                "SortedArray.getElementAt: index out of bounds: " +
                        index + " out of bounds. Max index: " + (numElements - 1)
            );
        }
        for (int i = index; i < numElements - 1; i++) {
            array[i] = array[i + 1];
        }
        numElements--;

    }
}
