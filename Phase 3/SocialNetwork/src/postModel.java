import java.util.ArrayList;
import java.util.HashMap;

public class postModel {

    ArrayList<Post> posts = new ArrayList<>();
    HashMap<HashTag ,ArrayList<Integer>> hashTags = new HashMap<>();

    public ArrayList<Post> getPosts() { return posts; }
    public void setPosts(ArrayList<Post> posts) { this.posts = posts; }
    public HashMap<HashTag, ArrayList<Integer>> getHashTags() { return hashTags; }
    public void setHashTags(HashMap<HashTag, ArrayList<Integer>> hashTags) { this.hashTags = hashTags; }

    public void createPost(Post post){}
    public void deletePost(Post post){}
    public Post getPost(int postID){return new Post();}
    public void updatePost(int postID , Post post){}
    public void categorizePost(HashTag hashTag ,int postID){}
    public ArrayList<Post> getPostsByHashTag (HashTag hashTag){return new ArrayList<Post>();}
    public int updateNumberOfLikes(int postID){return 0;}
    public int updateNumberOfShares(int postID){return 0;}

}
