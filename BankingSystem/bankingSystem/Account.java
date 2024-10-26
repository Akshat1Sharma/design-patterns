public interface Account {
    public void openAccount();
    public void closeAccount();
    public double deposit(int amount);
    public void credit(int amount);

    public void showBalance();
}
