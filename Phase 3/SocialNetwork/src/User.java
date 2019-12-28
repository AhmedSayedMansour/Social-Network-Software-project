import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;

public class User {
    private int userID;
    private String userName;
    private String password;
    private String email;
    private String gender;
    private String country;
    private String dateOfBirth;
    private ArrayList<User> friends = new ArrayList<>();
    private ArrayList<FriendRequest> friendRequests = new ArrayList<>();
    private ArrayList<Post> posts = new ArrayList<>();
    private ArrayList<Message> messages = new ArrayList<>();



    public User(int userID, String userName, String password, String email, String gender, String country, String dateOfBirth) {
        this.userID = userID;
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.gender = gender;
        this.country = country;
        this.dateOfBirth = dateOfBirth;
    }
    public User(){
    }


    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {  this.userID = userID; }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public ArrayList<User> getFriends() {
        return friends;
    }

    public void setFriends(ArrayList<User> friends) {
        this.friends = friends;
    }

    public ArrayList<FriendRequest> getFriendRequests() {
        return friendRequests;
    }

    public void setFriendRequests(ArrayList<FriendRequest> friendRequests) {
        this.friendRequests = friendRequests;
    }

    public void addToFriends(User user1){
        friends.add(user1);
    }

    public void addToFriendRequests(FriendRequest user1){
        friendRequests.add(user1);
    }

    public void removeFromFriendRequests(FriendRequest user1){
        friendRequests.remove(user1);
    }

    public ArrayList<Post> getPosts() {
        return posts;
    }

    public void setPosts(ArrayList<Post> posts) {
        this.posts = posts;
    }

    public ArrayList<Message> getMessages() {
        return messages;
    }

    public void setMessages(ArrayList<Message> messages) {
        this.messages = messages;
    }

}
