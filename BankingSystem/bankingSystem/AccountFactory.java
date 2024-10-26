public class AccountFactory {
    public static Account createAccount(String type, User user){

        switch(type.toLowerCase()){

            case "saving":
                return new SavingAccount(user);

            case "open":
                return new OpenAccount(user);

            default:
                throw new IllegalArgumentException("Invalid Bank Type" + type);
        }
    }
}
