public class messageController {

    private messageModel messageModel = new messageModel();

    public messageController(messageModel messageModel) {
        this.messageModel = messageModel;
    }

    public messageModel getModel() {
        return messageModel;
    }

    public void setModel(messageModel model) {
        this.messageModel = model;
    }

    public void sendMessage(userMessage message){}
    public void sendMessageToGroup(Message message , int groupID){}

    public void deleteMessage(userMessage message){}
    public void deleteMessageFromGroup(Message message , int groupID){}

}
