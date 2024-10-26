public class SavingAccount implements Account {

    private User user;

    public SavingAccount(User user){
        this.user = user;
    }


    @Override
    public void openAccount() {
        System.out.println("User : "+ user.getFirstName() +" Account is opened.");

    }

    @Override
    public void closeAccount() {
        System.out.println("User : "+ user.getFirstName() + " Account is closed");
        this.user = null;
    }

    @Override
    public double deposit(int amount) {

        if(this.user.getBalance() <= 0){
            System.out.println("Insufficient balance");
            return this.user.getBalance();
        }
        
        this.user.setBalance(this.user.getBalance() - amount);

        System.out.println("Amount : "+ amount +" deducted from user account");
        return (this.user.getBalance());
    }

    @Override
    public void credit(int amount) {
        this.user.setBalance(this.user.getBalance() + amount);
        System.out.println("Amount : "+ amount +" Added to user account");
    }

    @Override
    public void showBalance() {
       System.out.println(this.user.getFirstName() + " having amount "+ this.user.getBalance());
    }

}
