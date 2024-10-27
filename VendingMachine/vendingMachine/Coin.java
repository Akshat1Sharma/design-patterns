package VendingMachine.vendingMachine;

public enum Coin {

    /* These are U.S. coins
        Penny – worth 1 cent (0.01 USD).
        Nickel – worth 5 cents (0.05 USD).
        Dime – worth 10 cents (0.10 USD).
        Quarter – worth 25 cents (0.25 USD).
    */
    
    PENNY(0.01),
    NICKEL(0.05),
    DIME(0.1),
    QUARTER(0.25);

    private final double value;

    Coin(double value){
        this.value = value;
    }

    public double getValue(){
        return value;
    }
}
