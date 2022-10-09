package First;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.PrintWriter;

public class WriterJson {
    public static void jsonWriter(String path, Post[] posts) {
        try (PrintWriter out = new PrintWriter(new FileWriter(path))) {
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            String jsonString = gson.toJson(posts);
            out.write(jsonString);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}