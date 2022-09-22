import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

public class WriterJson {
    public static void jsonWriter(String path, ArrayList<User> users) {
        try (PrintWriter out = new PrintWriter(new FileWriter(path))) {
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            String jsonString = gson.toJson(users);
            out.write(jsonString);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
