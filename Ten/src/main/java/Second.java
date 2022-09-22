import java.util.ArrayList;

public class Second {
    public static void main(String[] args) {
        String readFile = "file.txt";
        String path = "user.json";
        ArrayList<User> users = ReaderTxtFile.readFile(readFile);
        WriterJson.jsonWriter(path, users);
    }
}
