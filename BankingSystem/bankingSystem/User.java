public class User implements UserObserver{
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private int age;
    private double balance;
    
    private Address address;

    public Address getAddress(){
        return address;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getEmail() {
        return email;
    }
    public String getPassword() {
        return password;
    }
    public int getAge() {
        return age;
    }
    public double getBalance() {
        return balance;
    }

    public Address getAddress(AddressBuilder builder){
        return this.address;
    }
    

    
    public void setAddress(AddressBuilder builder){
        this.address = new Address(builder);
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    @Override
    public String toString() {
        return "User [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", password=" + password
                + ", age=" + age + ", balance=" + balance + ", address=" + address + "]";
    }
    @Override
    public void update(String loanType, double interestRate) {
        System.out.println("Notification for " + firstName + " " + lastName + ": " +
                           "The interest rate for " + loanType + " is now " + interestRate + "%.");
    }


    

    
}
