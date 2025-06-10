public class Main {
    public static void main(String[] args) {

        UserAccount userAccount = new UserAccount();

        LoginPage loginPage = new LoginPage(userAccount.getLoginInfo());

    }
}
