package no.hvl.dat100.javel.oppgave4;

import no.hvl.dat100.javel.oppgave3.Customer;
import no.hvl.dat100.javel.oppgave3.PowerAgreementType;

import javax.swing.*;

public class Customers {

    private Customer[] customers;
    private int nextFreeIndex = 0;

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

        int i = 0;

        do {
            if (customers[i].getCustomer_id() == customer_id && customers[i] != null) {
                c = customers[i];
            } else {
                System.out.println("Customer: " + customer_id + " no exist lol. Try a different customer bozo");
            }
            i++;
        } while (c == null && i < customers.length);

        return c;
    }

    // d) add a customer to the reference table
    public boolean addCustomer(Customer c) {

        boolean inserted = false;

        if (nextFreeIndex >= customers.length) {
            System.out.println("Doesn't work. Pls fix code lmao");
        }

        customers[nextFreeIndex] = c;

        do {
            nextFreeIndex++;
        } while (nextFreeIndex < customers.length && customers[nextFreeIndex] != null);
        /*
        switch (customers) {
            case null:
                inserted = true;
                customers = c;
                break;
            case !Boolean.parseBoolean(null):
                break;
            default:
                System.out.println("Doesn't work. Pls fix code lmao");
        }

        for(int i = 0; i < customers.length; i++) {
            if (customers[i] == null) {
                customers[i] = c;
                inserted = true;
            }
        }
         */
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

        return this.customers;
    }
}