package sg.edu.np.mad.practical2;

public class User {
    public String name;
    public String description;
    public int id;
    public boolean followed;

    public User() {
        this.name = "name";
        this.description = "description";
        this.id = 1;
        this.followed = false;
    }

    public User(String name, String description, int id, boolean followed) {
        this.name = name;
        this.description = description;
        this.id = id;
        this.followed = followed;
    }

    public void ToggleFollow() {
        followed = !followed;
    }
}
