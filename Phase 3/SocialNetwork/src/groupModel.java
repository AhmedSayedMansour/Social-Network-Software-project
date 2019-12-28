import java.security.cert.CRLReason;
import java.util.ArrayList;

public class groupModel {
    ArrayList<Group> publicGroups = new ArrayList<>();
    ArrayList<Group> privateGroups = new ArrayList<>();

    public void createGroup(Group group){}
    public void deleteGroup(Group group){}
    public Group readGroup(int groupID)
    {   
        Group ret = new Group();
        return ret;
    }
    public void updateGroup(int groupID , Group group){}
}
