import java.io.*;

public class First {
    public static void main(String[] args) {
        String readFile = "test.txt";
        readFile(readFile);
    }

    public static void readFile(String readFile) {
        try (BufferedReader reader = new BufferedReader(new FileReader(readFile))){
            String line = reader.readLine();
            while (line != null) {
                if (line.matches("\\d{3}-\\d{3}-\\d{4}")
                        || line.matches("\\(\\d{3}\\)\\s\\d{3}-\\d{4}")) {
                    System.out.println(line);
                }
                line = reader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
