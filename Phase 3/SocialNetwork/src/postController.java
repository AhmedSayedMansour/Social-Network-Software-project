public class postController {

    postModel postModel = new postModel();

    public postController(postModel postModel) {
        this.postModel = postModel;
    }

    public postModel getPostModel() { return postModel; }
    public void setPostModel(postModel postModel) { this.postModel = postModel; }

    public void writePost(String content , String hashTag){}
    public void deletePost(int postID){}
    public void updatePost(int postID){}
    public int pressLike(int postID){return 0;}
    public int pressShare(int postID){return 0;}

}
