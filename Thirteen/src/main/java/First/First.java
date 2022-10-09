package First;

import java.io.IOException;

import static First.Util.*;

public class First {
    private static final String CREATE_USER_URL = "https://jsonplaceholder.typicode.com/users";
    private static final String CREATE_USER_UPDATE_URL = "https://jsonplaceholder.typicode.com/posts/1";
    private static final String GET_USER_ID = CREATE_USER_URL +"/2";
    private static final String GET_USERNAME = CREATE_USER_URL +"?username="+"Samantha";
    private static final String GET_TODOS = "https://jsonplaceholder.typicode.com/users/1/todos";


    public static void main(String[] args) throws IOException {

        System.out.println(sendRequest(CREATE_USER_URL, "POST"));
        System.out.println(sendRequest(CREATE_USER_UPDATE_URL, "PUT"));
        System.out.println(sendRequest(CREATE_USER_UPDATE_URL, "DELETE"));
        System.out.println(sendRequest(CREATE_USER_URL, "GET"));
        System.out.println(sendRequest(GET_USER_ID, "GET"));
        System.out.println(sendRequest(GET_USERNAME, "GET"));
        sendTodos(GET_TODOS,"GET");
    }
}
