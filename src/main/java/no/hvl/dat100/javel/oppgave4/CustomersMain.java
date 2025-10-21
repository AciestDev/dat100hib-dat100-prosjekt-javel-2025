package no.hvl.dat100.javel.oppgave4;

import no.hvl.dat100.javel.oppgave3.Customer;
import no.hvl.dat100.javel.oppgave3.PowerAgreementType;

import javax.swing.*;

public class CustomersMain {

    private static Customer oneNewCustomer() {

        Customer c = new Customer();

        String name = JOptionPane.showInputDialog("What is the name of the customer? ");
        String email = JOptionPane.showInputDialog("What is the email of the customer? ");
        int id = Integer.parseInt(JOptionPane.showInputDialog("What is the customer_id of the customer? "));
        PowerAgreementType agreement = PowerAgreementType.valueOf(JOptionPane.showInputDialog("What is the powerAgreement of the customer? "));

        return c = new Customer(name, email, id, agreement);
    }

    public static void main(String[] args) {

        System.out.println("==============");
        System.out.println("OPPGAVE 4");
        System.out.println("==============");
        System.out.println();

        // a) Complete constructor
        Customers ppl = new Customers(5);

        Customer one = new Customer("Sander", "sander@gmail.com", 1, PowerAgreementType.SPOTPRICE);
        Customer two = new Customer("Sivert", "Sivert@gmail.com", 4, PowerAgreementType.NORGESPRICE);
        Customer three = new Customer("Tor-leif", "Tor.leif@gmail.com", 8000, PowerAgreementType.POWERSUPPORT);


        // b) count number of non-null references

        System.out.println("b)");
        System.out.println("This check on question b will be done again after customers are added " + ppl.countNonNull() + "\n");

        // c) return reference to customer with given id (if exists)
        System.out.println("c)");
        System.out.println("The check on question c will be done again after customers are added\n");

        // d) add a customer to the reference table

        System.out.println("d)");
        boolean customers1 = ppl.addCustomer(one);
        boolean customers2 = ppl.addCustomer(two);
        boolean customers3 = ppl.addCustomer(three);


        System.out.println("Customer 1: " + customers1);
        System.out.println("Customer 2: " + customers2);
        System.out.println("Customer 3: " + customers3 + "\n");



        // b and c revisited

        System.out.println("b & c)");
        System.out.println("There are: " + ppl.countNonNull() + " nonNull slots filled in the customers class");
        System.out.print("getCustomer test: \n" + ppl.getCustomer(4).toString() + "\n");

        // e) remove customer with given id from reference table

        System.out.println("e)");
        System.out.println(ppl.removeCustomer(1));




        // f) return reference table with all customers

        System.out.println("f)");

        for (int i = 0; i < ppl.getCustomers().length; i++) {
            System.out.println(ppl.getCustomers()[i].toString());
        }


    }
}
