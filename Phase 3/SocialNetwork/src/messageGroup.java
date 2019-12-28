import java.util.ArrayList;

public class messageGroup {
    int groupID;
    ArrayList<Message> messages = new ArrayList<>();
    ArrayList<User> members = new ArrayList<>();

    public int getGroupID() {
        return groupID;
    }

    public void setGroupID(int groupID) {
        this.groupID = groupID;
    }

    public ArrayList<Message> getMessages() {
        return messages;
    }

    public void setMessages(ArrayList<Message> messages) {
        this.messages = messages;
    }

    public ArrayList<User> getMembers() {
        return members;
    }

    public void setMembers(ArrayList<User> members) {
        this.members = members;
    }


}
