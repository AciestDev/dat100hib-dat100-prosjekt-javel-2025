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
            } else {
                System.out.println("tings");
            }
        }

        return count;
    }

    // c) return reference to customer with given id (if exists)
    public Customer getCustomer(int customer_id) {

        Customer c = null;

        int i = 0;


            do {
                if (customers[i] != null && customers[i].getCustomer_id() == customer_id) {
                    c = customers[i];
                } else if (customers[i] != null && customers[i].getCustomer_id() != customer_id && i < customers.length) {

                } else {
                    System.out.println("Customer: " + customer_id + " not found");
                }
                i++;
            } while (c == null && i < customers.length && customers[i] != null);

        return c;
    }

    // d) add a customer to the reference table
    public boolean addCustomer(Customer c) {

        boolean inserted = true;

        if (nextFreeIndex >= customers.length) {
            System.out.println("Doesn't work. Pls fix code lmao");
            inserted = false;
        } else if (customers[nextFreeIndex] == null) {
            customers[nextFreeIndex] = c;
        }

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

        for (int i = 0; i <= customers.length; i++) {
            if (customers[i] != null && customers[i].getCustomer_id() == customer_id) {
                c = customers[i];
                customers[i] = null;
                System.out.println("Customer with id: " + customer_id + " is removed. \nThis was the customers info:");

                for (int j = i; j < customers.length - 1; j++) {
                    customers[j] = customers[j + 1];
                }
                customers[customers.length - 1] = null;
                nextFreeIndex --;
                break;
            }
        }

        if (c == null) {
            System.out.println("Customer " + customer_id + " not found.");
        }

        return c;
    }

    // f) return reference table with all customers
    public Customer[] getCustomers() {

        Customer[] c = new Customer [customers.length];

        for (int i = 0; i < customers.length; i++) {
            c[i] = customers[i];
        }
        return c;
    }
}