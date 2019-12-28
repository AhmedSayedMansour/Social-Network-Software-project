import java.util.ArrayList;
import java.util.HashMap;

public class postModel {

    ArrayList<Post> posts = new ArrayList<>();
    HashMap<HashTag,ArrayList<Integer>> hashTags = new HashMap<>();

    public void createPost(Post post){}
    public void deletePost(Post post){}
    public Post getPost(int postID){return new Post();}
    public void updatePost(int postID , Post post){}
    public void categorizePost(HashTag hashTag , int postID){}
    public ArrayList<Post>  getPostsByHashTag (HashTag hashTag){return new ArrayList<Post>();}

}
