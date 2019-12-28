import java.util.ArrayList;

public abstract class UserController {

    private UserModel userModel = new UserModel();
    private messageModel messageModel = new messageModel();
    private postModel postModel = new postModel();
    private PageModel pageModel = new PageModel();
    private messageController messageController = new messageController(messageModel);
    private postController postController = new postController(postModel);
    private publicGroupController publicGroupController = new publicGroupController(userModel);
    private privateGroupController privateGroupController = new privateGroupController(userModel);
    private PageController pageController = new PageController(pageModel);

    public UserModel getUserModel() {
        return userModel;
    }

    public void setUserModel(UserModel userModel) {
        this.userModel = userModel;
    }

    public messageModel getMessageModel() {
        return messageModel;
    }

    public void setMessageModel(messageModel messageModel) {
        this.messageModel = messageModel;
    }

    public postModel getPostModel() {
        return postModel;
    }

    public void setPostModel(postModel postModel) {
        this.postModel = postModel;
    }

    public PageModel getPageModel() {
        return pageModel;
    }

    public void setPageModel(PageModel pageModel) {
        this.pageModel = pageModel;
    }

    public messageController getMessageController() {
        return messageController;
    }

    public void setMessageController(messageController messageController) {
        this.messageController = messageController;
    }

    public postController getPostController() {
        return postController;
    }

    public void setPostController(postController postController) {
        this.postController = postController;
    }

    public publicGroupController getPublicGroupController() {
        return publicGroupController;
    }

    public void setPublicGroupController(publicGroupController publicGroupController) {
        this.publicGroupController = publicGroupController;
    }

    public privateGroupController getPrivateGroupController() {
        return privateGroupController;
    }

    public void setPrivateGroupController(privateGroupController privateGroupController) {
        this.privateGroupController = privateGroupController;
    }

    public PageController getPageController() {
        return pageController;
    }

    public void setPageController(PageController pageController) {
        this.pageController = pageController;
    }

    UserController(UserModel userModel){
        this.userModel = userModel;
    }

    public Boolean signUp(User newUser) {
        if(newUser.getUserName() != null && newUser.getPassword() != null && newUser.getEmail() != null && newUser.getCountry()!= null && newUser.getDateOfBirth() != null && newUser.getGender() != null) {
            if(userModel.checkUserExistence(newUser.getUserID())==0){
                this.userModel.createUser(newUser);
                return true;
            }
            else{
                return false;
            }
        }
        return false;
    }

    public int signIn(String userName,String password){     //0:not found ,1:normal ,2:premium
        return userModel.checkUserExistence(userName,password);
    }

    public Boolean search(int userID) {
        return userModel.checkUserExistence(userID) > 0;
    }

    public boolean sendFriendRequest(User user1, int userID) {
        User user2 = new User();
        FriendRequest request = new FriendRequest(user1 , userModel.getUser(userID));
        if(userModel.checkUserExistence(userID) <= 0)   return false;
        if(!userModel.isFriends(user1,userModel.getUser(userID)) && user1.getUserID()!=userModel.getUser(userID).getUserID()){
            userModel.addToFriendRequests(userModel.getUser(userID),request);
            return true;
        }
        else
            return false;
    }

    public Boolean acceptRequest(User receiver,String num) {
        return userModel.removeRequest(receiver,receiver.getFriendRequests().get(Integer.parseInt(num)));
    }

}
