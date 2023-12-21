import java.io.*;
public class Main2 {
    public static void main(String[] args) throws IOException {
        SortedTextFile stf = new SortedTextFile("text.txt");
        stf.put("a");

        System.out.println("---getNumElements---");
        System.out.println(stf.getNumElements());

        System.out.println("---getElementsAt---");
        System.out.println(stf.getElementAt(1));

        System.out.println("---removeElementAt---");
        stf.removeElementAt(2);

        System.out.println("---print---");
        SortedTextFile.printStatic("text.txt");

    }
}
