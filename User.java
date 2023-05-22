import java.util.ArrayList;
import java.util.List;

class User {
    private String username;
    private String password;
    private List<String> groups;

    public User (String username, String  password){
        this.username = username;
        this.password = password;
        this.groups= new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public List<String> getGroups() {
        return groups;
    }
    public void addGroup(String group){
        groups.add(group);
    }
}
