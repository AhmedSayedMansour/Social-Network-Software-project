import java.util.ArrayList;

public class Page {
    private int pageID;
    private int numberOfLikes = 0;
    private String name;
    private ArrayList<User> followers = new ArrayList<>();
    private ArrayList<Post> posts = new ArrayList<>();
    private ArrayList<User> Admins = new ArrayList<>();

    public ArrayList<User> getAdmins() {
        return Admins;
    }

    public void setAdmins(ArrayList<User> admins) {
        Admins = admins;
    }

    public int getPageID() {
        return pageID;
    }

    public void setPageID(int pageID) {
        this.pageID = pageID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfLikes() {
        return numberOfLikes;
    }

    public void setNumberOfLikes(int numberOfLikes) {
        this.numberOfLikes = numberOfLikes;
    }

    public ArrayList<User> getFollowers() {
        return followers;
    }

    public void setFollowers(ArrayList<User> followers) {
        this.followers = followers;
    }

    public ArrayList<Post> getPosts() {
        return posts;
    }

    public void setPosts(ArrayList<Post> posts) {
        this.posts = posts;
    }

}
