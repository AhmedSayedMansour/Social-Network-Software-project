import java.util.ArrayList;

public class userMessage extends  Message{
    private ArrayList<User> receivers = new ArrayList<>();

    public ArrayList<User> getReceivers() {
        return receivers;
    }

    public void setReceivers(ArrayList<User> receivers) {
        this.receivers = receivers;
    }

}
