public class Post {
    int postID;
    private String content;
    private HashTag hashTag = new HashTag();

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getPostID() { return postID; }

    public void setPostID(int postID) { this.postID = postID; }

    public HashTag getHashTag() { return hashTag; }

    public void setHashTag(HashTag hashtag) { this.hashTag = hashtag; }

}
