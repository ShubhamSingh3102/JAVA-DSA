package Bank;
import java.util.*;
public class Bank {
    public static class Account {
        public String name; // public access modifier...
        //        String name; // default access modifier....
        protected String email; // protected access modifier....sirf aapna package and dusre pacakage ka subclasses hi access kr skta hai...
        private String password; // private access modifier....sirf aapna class hi access kr skta hai...
        //for this we use function such as getter and setter to use and access private things in different classes....

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }
    }

    public static void main(String[] args) {
        Account account1 = new Account();
        account1.name = "College_Walter";
        account1.email = "collegewalter@gmail.com";
//        account1.password = "12345";//cannot be accessed because it is private access modifier....
        account1.setPassword("1234");
        System.out.println(account1.getPassword());
    }
}

