package no.hvl.dat100.javel.oppgave4;

import no.hvl.dat100.javel.oppgave3.Customer;

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
                break;
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
            System.out.println("add customer does not work because the list is full");
            inserted = false;
            return inserted;
        } else if (customers[nextFreeIndex] == null) {
            customers[nextFreeIndex] = c;
        }

        do {
            nextFreeIndex++;
        } while (nextFreeIndex < customers.length && customers[nextFreeIndex] != null);

        return inserted;
    }

    // e) remove customer with given id from reference table
    public Customer removeCustomer(int customer_id) {

        Customer c = null;

        for (int i = 0; i < customers.length; i++) {
            if (customers[i] != null && customers[i].getCustomer_id() == customer_id) {
                c = customers[i];
                customers[i] = null;
                System.out.println("Customer with id: " + customer_id + " is removed. \nThis was the customers info:\n\n");

                for (int j = i; j < customers.length - 1; j++) {
                    if (customers[j+1] != null) {
                        customers[j] = customers[j + 1];
                    } else if(customers[j] != null && customers[j+1] == null) {
                        customers[j] = null;
                        nextFreeIndex --;
                        break;
                    }
                }
                break;
            } else if (customers[i] == null || customers[i].getCustomer_id() != customer_id){
                    System.out.println("Customer " + customer_id + " not found.");
                    break;
            }
        }



        return c;
    }

    // f) return reference table with all customers
    public Customer[] getCustomers() {

        Customer[] c =  new Customer[countNonNull()];

        for (int i = 0; i < customers.length; i++) {
            if (customers[i] != null) {
                c[i] = customers[i];
            } else {
                break;
            }
        }
        return c;
    }
}