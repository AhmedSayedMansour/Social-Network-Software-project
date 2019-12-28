public class NormalUserController extends UserController {


    NormalUserController(UserModel userModel) {
        super(userModel);
    }

    public Boolean upgradeToPremium(UserModel model, User user){
        return model.upgrade(user);
    }

}
