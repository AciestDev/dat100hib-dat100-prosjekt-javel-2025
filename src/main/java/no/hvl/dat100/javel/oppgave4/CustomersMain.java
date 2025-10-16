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
        Customers ppl = new Customers(10);
        Customer one = new Customer("Sander", "sander@gmail.com", 1, PowerAgreementType.SPOTPRICE);
        Customer two = new Customer("Sivert", "Sivert@gmail.com", 4, PowerAgreementType.NORGESPRICE);
        Customer three = new Customer("Tor-leif", "Tor.leif@gmail.com", 8000, PowerAgreementType.POWERSUPPORT);
        Customer four = new Customer();
        Customer five = new Customer();
        Customer six = new Customer();

        /*
        for (int i = 0; i < ppl.getCustomers().length; i++) {
            oneNewCustomer();
        }

        test[0].setName("Sander");
        test[0].setEmail("sander@gmail.com");
        test[0].setCustomer_id(4);
        test[0].setPowerAgreementType(PowerAgreementType.SPOTPRICE);

        test[1].setName("Tim");
        test[1].setEmail("tim@gmail.com");
        test[1].setCustomer_id(1);
        test[1].setPowerAgreementType(PowerAgreementType.NORGESPRICE);

        System.out.println(test[0].toString());
        System.out.println(test[1].toString());
         */

        // TODO If I set all to the default constructor first from Customer then this will give out a 10/10 or however many in the list
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
        boolean customers4 = ppl.addCustomer(four);
        boolean customers5 = ppl.addCustomer(five);
        boolean customers6 = ppl.addCustomer(six);

        System.out.println("Customer 1: " + customers1);
        System.out.println("Customer 3: " + customers3);
        System.out.println("Customer 6: " + customers6 + "\n");



        // b and c revisited

        System.out.println("b & c)");
        System.out.println("There are: " + ppl.countNonNull() + " nonNull slots filled in the customers class");
        Customer test = ppl.getCustomer(4);
        System.out.print("test: \n" + test.toString() + "\n");

        // e) remove customer with given id from reference table

        System.out.println("e)");
        System.out.println(three.toString());
        System.out.print(one.toString());
        ppl.removeCustomer(1);
        System.out.println(one.toString());
        System.out.println(three.toString() + "\n");


        //  TODO How do I fix it so it prints all of them while still keeping the ones not initialized actually not initialized. Look at question b for example of problem
        // f) return reference table with all customers

        System.out.println("f)");

        for (int i = 0; i < ppl.getCustomers().length; i++) {
            System.out.println(ppl.getCustomers()[i].toString() + "\n\n");
        }
    }
}
