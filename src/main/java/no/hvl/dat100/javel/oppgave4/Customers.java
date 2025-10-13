package no.hvl.dat100.javel.oppgave4;

import no.hvl.dat100.javel.oppgave3.Customer;
import no.hvl.dat100.javel.oppgave3.PowerAgreementType;

import javax.swing.*;

public class Customers {

    private Customer[] customers;

    // a) Complete constructor
    public Customers(int size) {

        this.customers = new Customer[size];

    }

    // b) count number of non-null references
    public int countNonNull() {


        int count = 0;

        for(int i = 0; i < customers.length; i++) {
            if(customers[i] != null) {
                count++;
            }
        }

        return count;
    }

    // c) return reference to customer with given id (if exists)
    public Customer getCustomer(int customer_id) {

        Customer c = null;

            for (int i = 0; i < customers.length; i++) {
                if (customers[i].getCustomer_id() == customer_id && customers[i] != null) {
                    c = customers[i];
                }
            }

        return c;
    }

    // d) add a customer to the reference table

    // TODO check for valid answer then set to true if yes + test to see if it adds to customers
    public boolean addCustomer(Customer c) {

        boolean inserted = false;

        int answer = Integer.parseInt(JOptionPane.showInputDialog(
                "Do you want to add new customer or read from existing customer? \n " +
                "add = 1 \n read from existing user = 2"));

        if (answer == 1) {
            c.setName(JOptionPane.showInputDialog("What is the name of the customer? "));
            c.setEmail(JOptionPane.showInputDialog("What is the email of the customer? "));
            c.setCustomer_id(Integer.parseInt(JOptionPane.showInputDialog("What is the customer_id of the customer? ")));
            c.setPowerAgreementType(PowerAgreementType.valueOf(JOptionPane.showInputDialog("What is the powerAgreement of the customer? ")));
        } else if (answer == 2) {

        }

        return inserted;
    }

    // e) remove customer with given id from reference table
    public Customer removeCustomer(int customer_id) {

        Customer c = null;

        c = getCustomer(customer_id);
        c = new Customer();

        return c;
    }

    // f) return reference table with all customers
    public Customer[] getCustomers() {

        Customer[] customers = null;

        customers = this.customers;

        return customers;
    }
}