package First;

public class User {
    private final int userId;
    private final int id;
    private final String title;
    private final boolean completed;

    public User(int userId, int id, String title, boolean completed) {
        this.userId = userId;
        this.id = id;
        this.title = title;
        this.completed = completed;
    }
    @Override
    public String toString() {
        return "[" + " { " +
                "\"userId\" : " + userId +
                ", \"id\" : " + id +
                ", \"title\" : \"" + title + "\"" +
                ", \"completed\" :" + completed +
                "} " + "]";
    }
       public boolean isCompleted() {
        return completed;
    }
}
