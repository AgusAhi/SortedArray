import java.io.*;
public class SortedTextFile {
    private String fileName;

    public SortedTextFile(String text) throws IOException {
        this.fileName = fileName;
    }

    public String getName() { // return the name
        return fileName;
    }

    public void put(String newline) throws IOException { // that will store the string into the file but in such a way that the file is sorted in ascending order.
        File file = new File(fileName);
        File temporaryFile = new File("temp");
        new PrintWriter(new FileWriter(file));
        BufferedReader input = null;
        PrintWriter output = null;
        String line;

        try {
            if (file.exists()) {
                while ((line = input.readLine()) != null) {
                    output.write(newline);
                }

            }
            output.println(line);

        } finally {
            if (input != null){
                input.close();
            }


        }

    }




}
