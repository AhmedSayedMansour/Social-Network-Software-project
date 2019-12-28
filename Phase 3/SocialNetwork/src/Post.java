public class Post {
    private int postID;
    private int numberOfLikes = 0;
    private int numberOfShares = 0;
    private String content;
    private HashTag hashTag = new HashTag();

    public int getNumberOfLikes() { return numberOfLikes; }
    public void setNumberOfLikes(int numberOfLikes) { this.numberOfLikes = numberOfLikes; }
    public int getNumberOfShares() { return numberOfShares; }
    public void setNumberOfShares(int numberOfShares) { this.numberOfShares = numberOfShares; }
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
