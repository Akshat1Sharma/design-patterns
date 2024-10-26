import java.util.ArrayList;
import java.util.List;


//Concrete or Implementator Subject interface
public class LoanInterestNotifierImpl implements LoanInterestNotifier {

    private List<UserObserver> observers = new ArrayList<>();

    @Override
    public void attach(UserObserver observer) {
        observers.add(observer);
    }

    @Override
    public void detach(UserObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String loanType, double interestRate) {
        for (UserObserver observer : observers) {
            observer.update(loanType, interestRate);
        }
    }

}
