public class Main {
    public static void main(String[] args) {
        DomainControlSystem domainControlSystem  =new DomainControlSystem();

        domainControlSystem.addUser("user1" , "password1");
        domainControlSystem.addUser("user2", "password2");

        domainControlSystem.addUser("user1", "group1");
        domainControlSystem.addUser("user2", "group2");

        User user1 = domainControlSystem.getUser("user1");
        if (user1 != null){
            System.out.println("User: " + user1.getUsername());
            System.out.println("Password: " + user1.getPassword());
            System.out.println("Groups: " + user1.getGroups());
        }
    }
}
