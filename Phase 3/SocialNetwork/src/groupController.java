public abstract class groupController {

    private UserModel userModel = new UserModel();
    groupController(UserModel userModel){
        this.userModel = userModel;
    }

    public UserModel getUserModel() { return userModel; }
    public void setUserModel(UserModel userModel) { this.userModel = userModel; }

    public void createGroup(Group group){}
    public void removeGroup(int groupID){}
    public void changeName(int groupID , String newName){}
    public void changeType(int groupID , String newType){}

    public void addAdmin(int groupID , User user){}
    public void removerAdmin(int groupID , User user){}
    public void addMember(int groupID , User user){}
    public void removeMember(int groupID , User user){}

    public void showPosts(int groupID){}
    public void addPost(int groupID , Post post){}
    public void removePost(int groupID , Post post){}
    public void updatePost(int groupID , Post post){}
}
