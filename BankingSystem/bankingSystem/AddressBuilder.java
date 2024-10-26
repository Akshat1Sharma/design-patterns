public class AddressBuilder {

    private String line1;
    private String line2;
    private String line3;

    private String state;
    private String city;
    private String postalCode;
    private String country;

    public AddressBuilder setLine1(String line1) {
        this.line1 = line1;
        return this;
    }
    public AddressBuilder setLine2(String line2) {
        this.line2 = line2;
        return this;
    }
    public AddressBuilder setLine3(String line3) {
        this.line3 = line3;
        return this;
    }
    public AddressBuilder setState(String state) {
        this.state = state;
        return this;
    }
    public AddressBuilder setCity(String city) {
        this.city = city;
        return this;
    }
    public AddressBuilder setPostalCode(String postalCode) {
        this.postalCode = postalCode;
        return this;
    }
    public AddressBuilder setCountry(String country) {
        this.country = country;
        return this;
    }

    


    public String getLine1() {
        return line1;
    }
    public String getLine2() {
        return line2;
    }
    public String getLine3() {
        return line3;
    }
    public String getState() {
        return state;
    }
    public String getCity() {
        return city;
    }
    public String getPostalCode() {
        return postalCode;
    }
    public String getCountry() {
        return country;
    }
    public AddressBuilder build(){
        return this;
    }

    
}
