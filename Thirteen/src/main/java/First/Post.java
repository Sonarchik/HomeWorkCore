package First;

public class Post {
    int postId;
    int id;
    String name;
    String email;
    String body;

    public Post(int postId, int id, String name, String email, String body) {
        this.postId = postId;
        this.id = id;
        this.name = name;
        this.email = email;
        this.body = body;
    }

    @Override
    public String toString() {
        return "[" + " { " +
                "\"postId\" : " + postId +
                ", \"id\" : " + id +
                ", \"name\" : \"" + name + "\"" +
                ", \"email\" : \"" + email + "\"" +
                ", \"body\" : \"" + body + "\"" +
                "} " + "]";
    }
}
