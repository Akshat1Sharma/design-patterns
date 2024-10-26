public class Client {
    public static void main(String[] args) {
        
        //Create Two Address Using Address Builder
        AddressBuilder address1 = new AddressBuilder()
                                      .setCity("srgh")
                                      .setCountry("IN")
                                      .setLine1("P.b.school")
                                      .setLine2("road no 14")
                                      .setPostalCode("333029")
                                      .setState("RJ")
                                      .build();
                                      
        AddressBuilder address2 = new AddressBuilder()
                                      .setCity("SIKR")
                                      .setCountry("IN")
                                      .setLine1("SCM.school")
                                      .setLine2("road no 111")
                                      .setLine3("line3")
                                      .setPostalCode("333012")
                                      .setState("PB")
                                      .build();

        
        //Create Two Users
        User user1 = new User();
        user1.setAddress(address1);
        user1.setAge(18);
        user1.setBalance(0);
        user1.setEmail("dummy@gmail.com");
        user1.setFirstName("akshat");
        user1.setLastName("dummy");
        user1.setPassword("password");

        User user2 = new User();
        user2.setAddress(address2);
        user2.setAge(39);
        user2.setBalance(0);
        user2.setEmail("yahho@gmail.com");
        user2.setFirstName("john");
        user2.setLastName("dum");
        user2.setPassword("passw");

        //Show the Users Objects

        System.out.println("User 1 Details: " + user1 + "\n");

        System.out.println("User 2 Details: " + user2);


        //Open saving acccount for user1 and open for user2
        Account savingUser1= AccountFactory.createAccount("saving", user1);
        Account openUser2 = AccountFactory.createAccount("open", user2);


        //Apply some operation on user1
        savingUser1.openAccount();
        savingUser1.showBalance();
        savingUser1.deposit(1000);
        savingUser1.credit(500);
        savingUser1.showBalance();

        System.out.println();

        //Apply some operation on user2
        openUser2.openAccount();
        openUser2.showBalance();
        openUser2.deposit(2000);
        openUser2.credit(1000);
        openUser2.showBalance();


        //User1 is insterated in Gold loan and User 2 is insterated in House load interest rate
        //Use Observer pattern to notify User about those Information

        System.out.println();
        //Use observer pattern to notify User about loan interst rate
        LoanInterestNotifierImpl notifier = new LoanInterestNotifierImpl();
        notifier.attach(user1);
        notifier.attach(user2);

        //Notify user about interest rates
        notifier.notifyObservers("Gold Loan",7.8);
        notifier.notifyObservers("Home Loan",6.0);

    }
    
}
