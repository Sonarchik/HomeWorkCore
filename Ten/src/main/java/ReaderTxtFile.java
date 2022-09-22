import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ReaderTxtFile {
    public static ArrayList<User> readFile(String readFile) {
        String[] words;
        ArrayList<User> newUser = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(readFile))) {
            String line = reader.readLine();
            while (line != null) {
                if (line.matches("\\D+\\s+\\d+")) {
                    words = line.split(" ");
                    newUser.add(new User(words[0], Integer.parseInt(words[1])));
                }
                line = reader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (User user : newUser) {
            System.out.println(user.toString());
        }
        return newUser;
    }
}
