package First;

public class Todo {
    private final int userId;
    private final int id;
    private final String title;
    private final boolean completed;

    public Todo(int userId, int id, String title, boolean completed) {
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

    public int getUserId() {
        return userId;
    }

    public int getId() {
        return id;
    }

    public boolean isCompleted() {
        return completed;
    }
}
