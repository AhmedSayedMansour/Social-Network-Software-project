import java.util.ArrayList;

public class privateGroupController extends groupController {
    private ArrayList<User> requests = new ArrayList<>();

    privateGroupController(UserModel userModel) {
        super(userModel);
    }

    public void requestToJoinGroup(int groupID , groupRequest request){}
    public void acceptRequest(int groupID,int requestNumber){}
    public void removeRequest(int groupID,int requestNumber){}
    public void leaveGroup(User user,int groupID){}
    public void showRequests(int groupID){}

}
