public class SortedArray {
    private int[] array;
    public int numElements;

    public SortedArray(int size) { // Initialize the array
        array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = -1;
        }
        numElements = 0;
    }

    public void put(int value) { // Put the elements on the Array
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
    public String toString() { // Print the array
        String result = "[";
        boolean first = true;
        for (int i = 0; i < numElements; i++) {
            if (first) {
                first = false;
            } else {
                result += ", ";
            }
            result += array[i];
        }
        return result += "]";
    }

    public int getNumElements() {
        return numElements;
    }

    public int getSize() {
        return array.length;
    }

    public int getElementAt(int index) {
        if (index < 0 || index >= numElements) {
            throw new IndexOutOfBoundsException(
                    "SortedArray.getElementAt: index out of bounds: " +
                            index + " out of bounds. Max index: " + (numElements - 1));
        }
        return array[index];
    }

    public void removeElemtent(int index) {
        if (index < 0 || index >= numElements) {
            throw new IndexOutOfBoundsException(
                    "SortedArray.getElementAt: index out of bounds: " +
                            index + " out of bounds. Max index: " + (numElements - 1)
            );
        }
        int value = array[index];
        for (int i = index; i < numElements - 1; i++) {
            array[i] = array[i + 1];
        }
        numElements--;
    }

    public boolean isEmpty() {
        return numElements == 0;
    }

    public boolean isFull() {
        return numElements == array.length;
    }

    public boolean existsElement(int number) {
        for (int i = 0; i < numElements; i++) {
            if (array[i] == number) {
                return true;
            } else {
                if (array[i] > number) {
                    return false;
                }
            }
        }
        return false;
    }

    // Binary Search ut8.5 pag 18
    public boolean existsElementBinarySearch(int number) {
        return binarySearch(number, 0, numElements - 1);
    }

    public boolean binarySearch(int number, int minorIndex, int upperIndex) {
        if (minorIndex > upperIndex) {
            return false;
        }
        int middle = (minorIndex + upperIndex) / 2;
        if (array[middle] == number) {
            return true;
        }
        if (array[middle] < number) {
            return binarySearch(number, middle + 1, upperIndex);
        } else {
            return binarySearch(number, minorIndex, middle - 1);
        }

    }

}
