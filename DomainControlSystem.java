import java.util.HashMap;
import java.util.Map;

public class DomainControlSystem {
        private Map<String, User> users;

        public DomainControlSystem(){
            this.users = new HashMap<>();
        }

        public void addUser(String username, String password){
            if (!users.containsKey(username)){
                User user = new User(username, password);
                users.put(username, user);
                System.out.println("User" + username + "added successfully");
            }else {
                System.out.println(username+ "already exists");
            }
        }
        public void removeUser(String username){
            if (users.containsKey(username)){
                users.remove(username);
                System.out.println(username + "removed successfully");
            }else {
                System.out.println(username + "does not exists");
            }
        }
        public User getUser(String username){
            return users.get(username);
        }
        public void addUserToGroup(String username, String group){
            User user = users.get(username);
            if (user != null){
                user.addGroup(group);
                System.out.println(username + "added to group" + group);
            }else {
                System.out.println(username + "does not exists");
            }
        }
}
