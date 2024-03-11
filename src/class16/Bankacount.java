package class16;

public class Bankacount {
        private String userName;
        private String password;
        private String name;
        private String address;
        private int age;
        private double accountBalance = 10;

        public void setUserName(String accountUserName) {
            if (accountUserName.length() < 16) {
                userName = accountUserName;
            } else {
                System.out.println("Username of this length is not allowed");
            }
        }

        public void setPassword(String accountPass) {
            if (accountPass.length() < 16) {
                password = accountPass;
            } else {
                System.out.println("Password of this length is not allowed");
            }
        }

        public void getBalance(String accountUserName, String accountPassword) {
            if (userName.equals(accountUserName) && password.equals(accountPassword)) {
                System.out.println(accountBalance);
            }
        }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        // account1.balance=12345554 not allowed because private
        Bankacount account1 = new Bankacount();
        account1.setUserName("sasha");
        account1.setUserName("pass123");
        account1.getBalance("asdfb", "asdf");
    }

}
