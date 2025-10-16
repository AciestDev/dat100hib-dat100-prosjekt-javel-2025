package no.hvl.dat100.javel.oppgave3;

public class Customer {

    private String name;
    private String email;
    private int customer_id;
    private PowerAgreementType powerAgreementType;


    public Customer() {
        name = null;
        email = null;
        customer_id = 0;
        powerAgreementType = null;
    }

    public Customer(String name, String email, int customer_id, PowerAgreementType agreement) {

        this.name = name;
        this.email = email;
        this.customer_id = customer_id;
        this.powerAgreementType = agreement;
    }

    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public int getCustomer_id() { return customer_id; }
    public PowerAgreementType getPowerAgreementType() {
        return powerAgreementType;
    }

    public void setName(String newName) { this.name = newName; }
    public void setEmail(String newEmail) { this.email = newEmail; }
    public void setCustomer_id(int newCustomer_id) {
        this.customer_id = newCustomer_id;
    }
    public void setPowerAgreementType(PowerAgreementType newPowerAgreementType) { this.powerAgreementType = newPowerAgreementType; }

    public String toString() {
        String print = "";

        print += "Name: " + name + "\n";
        print += "Email: " + email + "\n";
        print += "Customer_id: " + customer_id + "\n";
        print += "PowerAgreementType: " + powerAgreementType + "\n" + "\n";


        return print;
    }

}
