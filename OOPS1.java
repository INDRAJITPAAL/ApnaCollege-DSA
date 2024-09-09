public class OOPS1 {
    public static void main(String[] args) {
        BankAccount myAcc = new BankAccount();
        // myAcc.setUserName("Indrajit pal");
        System.out.println(myAcc.userName);
    }

}
class BankAccount {
    public String userName="indrajit pal";
    public String password = "123sldfj";

    void setPassword(String newPassword) {
        password = newPassword;
    }

    void setUserName(String newUserName) {
        userName = newUserName;
    }

}