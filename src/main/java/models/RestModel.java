package models;

public class RestModel {

    private String id;
    private String user_id;
    private String title;

    public RestModel(String user_id, String title) {
        this.user_id = user_id;
        this.title = title;
    }

    public String getId() {
        return id;
    }

    public String getUser_id() {
        return user_id;
    }

    public String getTitle() {
        return title;
    }
}
