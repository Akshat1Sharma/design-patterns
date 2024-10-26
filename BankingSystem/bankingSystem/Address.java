public class Address {
    private String line1;
    private String line2;
    private String line3;

    private String state;
    private String city;
    private String postalCode;
    private String country;

    public Address(AddressBuilder builder){
       this.line1 = builder.getLine1();
       this.line2 = builder.getLine2();
       this.line3 = builder.getLine3();

       this.city = builder.getCity();
       this.state = builder.getState();
       this.country = builder.getCountry();
       this.postalCode = builder.getPostalCode();
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

    @Override
    public String toString() {
        return "Address [line1=" + line1 + ", line2=" + line2 + ", line3=" + line3 + ", state=" + state + ", city="
                + city + ", postalCode=" + postalCode + ", country=" + country + "]";
    }

    
    

}
