import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class testing {
    public User currentUser = new User("Ahmed20", "Ahmed", "2020", "gmail", "Male", "Giza", "20/7/1999");
    public User currentUser2 = new User("hema50", "hema", "5050", "gmail", "Male", "Giza", "30/8/1999");
    public UserModel userModel = new UserModel();
    public NormalUserController normalUserController = new NormalUserController(userModel);

    @Test
    public void signUp() {
        Assert.assertEquals(normalUserController.signUp(currentUser),true);
    }

    @Test
    public void sendFriendRequest() {
        normalUserController.signUp(currentUser);
        normalUserController.signUp(currentUser2);
        Assert.assertEquals(normalUserController.sendFriendRequest(currentUser,"hema50"),true);
    }

    @Test
    public void acceptRequest() {
        normalUserController.signUp(currentUser);
        normalUserController.signUp(currentUser2);
        normalUserController.sendFriendRequest(currentUser,"hema50");
        Assert.assertEquals(normalUserController.acceptRequest(currentUser2,"0"),true);
    }
}