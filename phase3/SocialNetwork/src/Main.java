import javax.crypto.spec.PSource;
import java.util.Scanner;

public class Main {

    public static User currentUser = new User();
    public static UserModel userModel = new UserModel();
    public static NormalUserController normalUserController = new NormalUserController(userModel);
    public static PremiumUserController premiumUserController = new PremiumUserController(userModel);
    public static int currentController = 0;    //0 is normal , 1 is premium

    public static void firstMenu(){
        String c = "" ;
        Scanner input = new Scanner(System.in);
        while (true){
            System.out.println("choose:\n1-Login\n2-SignUp");
            c = input.nextLine();
            if(c.equals("1")){
                System.out.println("Enter your name :");
                String name = input.nextLine();
                System.out.println("Enter your password :");
                String password = input.nextLine();
                if(normalUserController.signIn(name ,password) >0){
                    System.out.println("Logged in successfully");
                    currentUser = userModel.getUserByName(name , password);
                    currentController = normalUserController.signIn(name ,password) == 1 ?  0 : 1;
                    break;
                }
                else{
                    System.out.println("ERROR");
                }
            }
            else if (c.equals("2")){
                User signUp = new User();
                System.out.println("Enter your name :");
                signUp.setUserName(input.nextLine());
                System.out.println("Enter your password :");
                signUp.setPassword(input.nextLine());
                System.out.println("Enter your ID :");
                signUp.setUserID(input.nextLine());
                System.out.println("Enter your Email :");
                signUp.setEmail(input.nextLine());
                System.out.println("Enter your Country :");
                signUp.setCountry(input.nextLine());
                System.out.println("Enter your Gender :");
                signUp.setGender(input.nextLine());
                System.out.println("Enter your DateOfBirth :");
                signUp.setDateOfBirth(input.nextLine());

                if(normalUserController.signUp(signUp)){
                    System.out.println("Logged up successfully");
                    currentUser = signUp;
                    currentController = 0;
                    break;
                }
                else{
                    System.out.println("ERROR");
                }
            }
            else{
                System.out.println("Error");
                continue;
            }
        }
    }
    public static void main(String[] args) {

        System.out.println("Welcome to our Social Network");
        firstMenu();

        while (true){
            System.out.println("Choose :\n1-sent friend request\n2-accept friend request");
            if(currentController == 0) System.out.println("3-Upgrade To Premium");
            else System.out.println("3-add ADS");
            System.out.println("4-Log out\n5-exit");
            String c = "";
            Scanner input = new Scanner(System.in);
            c = input.nextLine();
            if(c.equals("1")){
                System.out.println("Enter ID of User:");
                if(normalUserController.sendFriendRequest(currentUser,input.nextLine())){
                    System.out.println("Friend request sent");
                }
                else{
                    System.out.println("User doesn't exist");
                }
            }
            else if(c.equals("2")){
                if(currentUser.getFriendRequests().size() >0){
                    System.out.println("choose a request:");
                    for(int i=0; i<currentUser.getFriendRequests().size() ;++i){
                        System.out.println(i+" "+currentUser.getFriendRequests().get(i).getSender().getUserName() + " " + currentUser.getFriendRequests().get(i).getSender().getUserID());
                    }
                    String S = input.nextLine();
                    if(Integer.parseInt(S)<currentUser.getFriendRequests().size() && Integer.parseInt(S)>=0){
                        normalUserController.acceptRequest(currentUser,S);
                        System.out.println("You are now friends");
                    }
                    else{
                        System.out.println("Unknown input");
                    }
                }
                else {
                    System.out.println("No requests found");
                }
            }
            else if(c.equals("3")){
                System.out.println("choose payment method:\n1-Credit Card\n2-PayPal");
                String method = input.nextLine().equals("1") ? "Credit Card" : "PayPal";
                Payment payment = new Payment();
                System.out.println("you have "+payment.getPaymentMethods().get(method)+"\npress(1)to continue payment with 99$ for a year");
                if(input.nextLine().equals("1")){
                    if(payment.pay(method,99)){
                        normalUserController.upgradeToPremium(userModel,currentUser);
                        currentController = 1;
                    }
                    else{
                        System.out.println("not enough money");
                    }
                }
                else {
                    System.out.println("Payment cancelled");
                }
            }
            else if(c.equals("4")){
                firstMenu();
            }
            else if(c.equals("5")){
                break;
            }
            else{
                System.out.println("ERROR");
            }
        }
    }
}
