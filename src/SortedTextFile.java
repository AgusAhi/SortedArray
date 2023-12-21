import javax.swing.plaf.IconUIResource;
import java.io.*;
public class SortedTextFile {
    private String fileName;

    public SortedTextFile(String fileName) throws IOException {
        this.fileName = fileName;
    }

    public String getName() { // return the name
        return fileName;
    }

    public void put(String newline) throws IOException { // that will store the string into the file but in such a way that the file is sorted in ascending order.
        BufferedReader input = null;
        PrintWriter output = null;
        File file;
        File fileTemp;
        boolean inserted = false;
        try {
            file = new File(fileName);
            fileTemp = new File("temp.txt");
            if (!file.exists()) {
                file.createNewFile();
            }
            input = new BufferedReader(new FileReader(file));
            output = new PrintWriter(new FileWriter(fileTemp));
            String line;
            while ((line = input.readLine()) != null) {
                if (line.compareToIgnoreCase(newline) > 0 && !inserted) {
                    output.println(newline);
                    inserted = true;
                }
                output.println(line);
            }
            if (!inserted) {
                output.println(newline);
            }
            file.delete();
            fileTemp.renameTo(file);
        } finally {
            if (input != null) {
                input.close();
            }
            if (output != null) {
                output.close();
            }
        }
    }

    public int getNumElements() throws IOException {
        BufferedReader input = null;
        try {
            input = new BufferedReader(new FileReader(fileName));
            String line;
            int count = 0;
            while ((line = input.readLine()) != null) {
                count++;
            }
            return count;
        } finally {
            if (input != null) {
                input.close();
            }
        }
    }

    public String getElementAt(int position) throws IOException {
        BufferedReader input = null;
        try {
            input = new BufferedReader(new FileReader(fileName));
            String line;
            int count = 0;
            while ((line = input.readLine()) != null) {
                if (count == position) {
                    return line;
                }
                count++;
            }
            throw new IndexOutOfBoundsException();
        } finally {
            if (input != null) {
                input.close();
            }
        }
    }

    public void removeElementAt(int position) throws IOException {
        BufferedReader input = null;
        PrintWriter output = null;
        String line;
        int count = 0;
        try {
            File file = new File(fileName);
            if (!file.exists()) {
                file.createNewFile();
            }
            File fileTemp = new File("temp.txt");
            input = new BufferedReader(new FileReader(file));
            output = new PrintWriter(new FileWriter(fileTemp));
            input = new BufferedReader(new FileReader(fileName));
            while ((line = input.readLine()) != null) {
                count++;
                if (count != position) {
                   output.println(line);
                }
            }
            file.delete();
            fileTemp.renameTo(file);

        } finally {
            if (input != null) {
                input.close();
            }
            if (output != null) {
                output.close();
            }
        }

    }

    public boolean isEmpty() throws IOException {
        return getNumElements() == 0;
    }

    public void emptyFile() throws IOException {
        File file = new File(fileName);
        file.delete();
        file.createNewFile();
    }

    public void print() throws IOException {
        BufferedReader input = null;
        try {
            input = new BufferedReader(new FileReader(fileName));
            String line;
            while ((line = input.readLine()) != null) {
                System.out.println(line);
            }
        } finally {
            if (input != null) {
                  input.close();
            }
        }
    }

    public boolean existsElement(String element) throws IOException {
        BufferedReader input = null;
        try {
            input = new BufferedReader(new FileReader(fileName));
            String line;
            while ((line = input.readLine()) != null) {
                if (line.compareToIgnoreCase(element) > 0) {
                    return false;
                } else if (line.equalsIgnoreCase(element)) {
                    return true;
                }
            }
            return false;
        } finally {
            if (input != null) {
                input.close();
            }
        }
    }

    public static void printStatic(String fileName) throws IOException {
        SortedTextFile sortedTextFile = new SortedTextFile("text.txt");
        sortedTextFile.print();
    }

    public static void merge(String name1, String name2, String outputFilename) throws IOException {
        BufferedReader input1 = null;
        BufferedReader input2 = null;
        BufferedReader output = null;
        try {
            String line1 = input1.readLine();
            String line2 = input2.readLine();
            while (line1 != null || line2 != null) {

            }
        } finally {
            if (input1 != null) {
                input1.close();
            }
            if (input2 != null) {
                input2.close();
            }
            if (output != null) {
                output.close();
            }

        }

    }







}
