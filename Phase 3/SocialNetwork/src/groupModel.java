import java.security.cert.CRLReason;
import java.util.ArrayList;

public class groupModel {
    ArrayList<Group> publicGroups = new ArrayList<>();
    ArrayList<Group> privateGroups = new ArrayList<>();

    public ArrayList<Group> getPublicGroups() { return publicGroups; }
    public void setPublicGroups(ArrayList<Group> publicGroups) { this.publicGroups = publicGroups; }
    public ArrayList<Group> getPrivateGroups() { return privateGroups; }
    public void setPrivateGroups(ArrayList<Group> privateGroups) { this.privateGroups = privateGroups; }

    public void createGroup(Group group){}
    public void deleteGroup(Group group){}
    public Group readGroup(int groupID) { return new Group(); }
    public void updateGroup(int groupID , Group group){}
}
