
//Subject Interface in observer interface

public interface LoanInterestNotifier {
    
    void attach(UserObserver observer);
    void detach(UserObserver observer);
    void notifyObservers(String loanType, double interestRate);
}
