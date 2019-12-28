import java.util.ArrayList;

public class UserModel {
    private ArrayList<User> normalUsers = new ArrayList<>();
    private ArrayList<User> premiumUsers = new ArrayList<>();

    // CRUD => Create, Read, Update, Delete

    public ArrayList<User> getPremiumUsers() {
        return premiumUsers;
    }

    public void setPremiumUsers(ArrayList<User> premiumUsers) {
        this.premiumUsers = premiumUsers;
    }

    public ArrayList<User> getNormalUsers() {
        return normalUsers;
    }

    public void createUser(User user) {
        this.normalUsers.add(user);
    }

    public void addToFriendRequests(User receiver, FriendRequest request){
        receiver.addToFriendRequests(request);
    }

    public Boolean removeRequest(User receiver,FriendRequest request){
        return receiver.getFriendRequests().remove(request);
    }

    public int checkUserExistence(String userName, String password) {
        for(int i=0 ; i<normalUsers.size() ; ++i){
            if (normalUsers.get(i).getUserName().equals(userName) && normalUsers.get(i).getPassword().equals(password)){
                return 1;
            }
        }
        for(int i=0 ; i<premiumUsers.size() ; ++i){
            if (premiumUsers.get(i).getUserName().equals(userName) && premiumUsers.get(i).getPassword().equals(password)){
                return 2;
            }
        }
        return 0;
    }

    public int checkUserExistence(String userID) {
        for(int i=0 ; i<normalUsers.size() ; ++i){
            if (normalUsers.get(i).getUserID().equals(userID) ){
                return 1;
            }
        }
        for(int i=0 ; i<premiumUsers.size() ; ++i){
            if (premiumUsers.get(i).getUserID().equals(userID) ){
                return 2;
            }
        }
        return 0;
    }

    public User getUser(String userID) {
        for(int i=0 ; i<normalUsers.size() ; ++i) {
            if (normalUsers.get(i).getUserID().equals(userID)) {
                return normalUsers.get(i);
            }
        }
        for(int i=0 ; i<premiumUsers.size() ; ++i) {
            if (premiumUsers.get(i).getUserID().equals(userID)) {
                return premiumUsers.get(i);
            }
        }
        User user = new User();
        return user;
    }

    public User getUserByName(String name ,String password){
        for(int i=0 ; i<normalUsers.size() ; ++i) {
            if (normalUsers.get(i).getUserName().equals(name) && normalUsers.get(i).getPassword().equals(password)) {
                return normalUsers.get(i);
            }
        }
        for(int i=0 ; i<premiumUsers.size() ; ++i) {
            if (premiumUsers.get(i).getUserName().equals(name) && premiumUsers.get(i).getPassword().equals(password)) {
                return premiumUsers.get(i);
            }
        }
        User user = new User();
        return user;
    }

    public boolean isFriends(User user1,User user2){
        return user1.getFriends().contains(user2);
    }

    public void setNormalUsers(ArrayList<User> normalUsers) {
        this.normalUsers = normalUsers;
    }

    public Boolean upgrade(User user){
        premiumUsers.add(getUser(user.getUserID()));
        normalUsers.remove(getUser(user.getUserID()));
        return true;
    }
}
