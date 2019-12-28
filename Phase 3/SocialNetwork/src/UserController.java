import java.util.ArrayList;

public abstract class UserController {

    private UserModel userModel = new UserModel();

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
