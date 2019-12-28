import java.util.ArrayList;
import java.util.HashMap;

public class messageModel {
    ArrayList<userMessage> userMessages = new ArrayList<>();
    HashMap<ArrayList<Message>,Integer> groupMessages = new HashMap<>(); //Messages , groupID

    public ArrayList<userMessage> getUserMessages() {
        return userMessages;
    }

    public void setUserMessages(ArrayList<userMessage> userMessages) {
        this.userMessages = userMessages;
    }

    public HashMap<ArrayList<Message>, Integer> getGroupMessages() {
        return groupMessages;
    }

    public void setGroupMessages(HashMap<ArrayList<Message>, Integer> groupMessages) {
        this.groupMessages = groupMessages;
    }

    public void createUserMessage(userMessage message){}
    public void createGroupMessage(Message message , int groupID){}

    public void deleteUserMessage(userMessage message){}
    public void deleteGroupMessage(Message message , int groupID){}

}
