package First;

import com.google.gson.*;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.file.Files;

public class Util {

    public static String sendRequest(String urlRequest, String request) throws IOException {
        URL url = new URL(urlRequest);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod(request);
        connection.setRequestProperty("Content-Type", "application/json");
        connection.setDoOutput(true);
        if (request.equals("PUT") || request.equals("POST")) {
            OutputStreamWriter osw = new OutputStreamWriter(connection.getOutputStream());
            if (request.equals("PUT")) {
                osw.write(Files.readString(new File("userUpdate.json").toPath()));
            } else {
                osw.write(Files.readString(new File("user.json").toPath()));
            }
            osw.flush();
            osw.close();
        }

        int responseCode = connection.getResponseCode();
        System.out.println(request + " response code: " + responseCode);
        StringBuilder response = new StringBuilder();
        if (responseCode == HttpURLConnection.HTTP_OK || responseCode == HttpURLConnection.HTTP_CREATED) {
            BufferedReader in =
                    new BufferedReader(
                            new InputStreamReader(connection.getInputStream()));
            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();
        } else {
            System.out.println(request + " request not worked");
        }
        return response.toString();
    }

    public static void sendTodos(String urlRequest, String request) throws IOException {
        String response = sendRequest(urlRequest, request);
        Gson gson = new Gson();
        User[] users = gson.fromJson(response, User[].class);
        for (User user : users) {
            if (!user.isCompleted()) {
                System.out.println(user);
            }
        }
    }
    public static void sendPosts(){
        final String GET_POSTS = "https://jsonplaceholder.typicode.com/users/1/posts";

    }
}
