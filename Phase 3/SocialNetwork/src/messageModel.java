import java.util.ArrayList;
import java.util.HashMap;

public class messageModel {
    ArrayList<userMessage> userMessages = new ArrayList<>();
    HashMap<ArrayList<Message>,Integer> groupMessages = new HashMap<>(); //Messages , groupID


    public void createUserMessage(userMessage message){}
    public void createGroupMessage(Message message , int groupID){}

    public void deleteUserMessage(userMessage message){}
    public void deleteGroupMessage(Message message , int groupID){}

}
