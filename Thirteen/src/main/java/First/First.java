package First;

import java.io.IOException;

import static First.Util.*;

public class First {
    private static final String CREATE_USER_URL = "https://jsonplaceholder.typicode.com/users";
    private static final String CREATE_USER_UPDATE_URL = "https://jsonplaceholder.typicode.com/posts/1";
    private static final String GET_USER_ID = CREATE_USER_URL +"/2";
    private static final String GET_USERNAME = CREATE_USER_URL +"?username="+"Samantha";
    public static void main(String[] args) throws IOException {

        sendPOST(CREATE_USER_URL);
        sendPUT(CREATE_USER_UPDATE_URL );
        sendDELETE(CREATE_USER_UPDATE_URL);
        sendGET(CREATE_USER_URL);
        sendGET(GET_USER_ID);
        sendGET(GET_USERNAME);
    }
}
