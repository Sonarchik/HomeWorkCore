package First;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.file.Files;

public class Util {

     public static void sendPOST(String CREATE_USER_URL) throws IOException {
         URL url = new URL(CREATE_USER_URL);
         HttpURLConnection connection = (HttpURLConnection) url.openConnection();
         connection.setRequestMethod("POST");
         connection.setRequestProperty("Content-Type", "application/json");
         connection.setDoOutput(true);
         OutputStreamWriter osw = new OutputStreamWriter(connection.getOutputStream()) ;
         osw.write(Files.readString(new File("user.json").toPath()));
         osw.flush();
         osw.close();

         int responseCode = connection.getResponseCode();
         System.out.println("POST response code: " + responseCode);
         if (responseCode == HttpURLConnection.HTTP_CREATED) {
             BufferedReader in =
                     new BufferedReader(
                             new InputStreamReader(connection.getInputStream()));
             StringBuilder response = new StringBuilder();
             String inputLine;
             while ((inputLine = in.readLine()) != null) {
                 response.append(inputLine);
             }
             in.close();
             System.out.println(response);
         } else {
             System.out.println("POST request not worked");
         }
     }

    public static void sendPUT(String CREATE_USER_URL) throws IOException {
        URL url = new URL(CREATE_USER_URL);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("PUT");
        connection.setRequestProperty("Content-Type", "application/json");
        connection.setDoOutput(true);
        OutputStreamWriter osw = new OutputStreamWriter(connection.getOutputStream());
        osw.write(Files.readString(new File("userUpdate.json").toPath()));
        osw.flush();
        osw.close();

        int responseCode = connection.getResponseCode();
        System.out.println("PUT response code: " + responseCode);
        if (responseCode == HttpURLConnection.HTTP_OK) {
            BufferedReader in =
                    new BufferedReader(
                            new InputStreamReader(connection.getInputStream()));
            StringBuilder response = new StringBuilder();
            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();
            System.out.println(response);
        } else {
            System.out.println("PUT request not worked");
        }
    }

    public static void sendDELETE(String CREATE_USER_URL) throws IOException {
        URL url = new URL(CREATE_USER_URL);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("DELETE");
        connection.setRequestProperty("Content-Type", "application/json");
        connection.setDoOutput(true);

        int responseCode = connection.getResponseCode();
        System.out.println("DELETE response code: " + responseCode);
        if (responseCode == HttpURLConnection.HTTP_OK) {
            BufferedReader in =
                    new BufferedReader(
                            new InputStreamReader(connection.getInputStream()));
            StringBuilder response = new StringBuilder();
            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();
            System.out.println(response);
        } else {
            System.out.println("DELETE request not worked");
        }
    }

    public static void sendGET(String CREATE_USER_URL) throws IOException {
        URL url = new URL(CREATE_USER_URL);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        connection.setRequestProperty("Content-Type", "application/json");
        connection.setDoOutput(true);


        int responseCode = connection.getResponseCode();
        System.out.println("GET response code: " + responseCode);
        if (responseCode == HttpURLConnection.HTTP_OK) {
            BufferedReader in =
                    new BufferedReader(
                            new InputStreamReader(connection.getInputStream()));
            StringBuilder response = new StringBuilder();
            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();
            System.out.println(response);
        } else {
            System.out.println("GET request not worked");
        }
    }
}
