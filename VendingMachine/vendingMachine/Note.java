package VendingMachine.vendingMachine;

public enum Note {

    ONE(1),
    FIVE(5),
    TEN(10),
    TWENTY(20);

    //we deined here final, because the value of enum is initialized only once and immutable.
    private final int value;

    Note(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return value;
    }
}
