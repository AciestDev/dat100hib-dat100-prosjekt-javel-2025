package no.hvl.dat100.javel.oppgave3;

import no.hvl.dat100.javel.oppgave4.Customers;
import no.hvl.dat100.javel.oppgave3.Customer;

import javax.swing.*;

public class CustomerMain {

    public static void main(String[] args) {

        System.out.println("==============");
        System.out.println("OPPGAVE 3");
        System.out.println("==============");
        System.out.println();

        int numOfCustomers = Integer.parseInt(JOptionPane.showInputDialog("How many customers? "));

        Customer[] customersOpg3 = new Customer[numOfCustomers];

        for (int i = 0; i < numOfCustomers; i++) {
            String name = JOptionPane.showInputDialog("What is the name of the customer? ");
            String email = JOptionPane.showInputDialog("What is the email of the customer? ");
            int id = Integer.parseInt(JOptionPane.showInputDialog("What is the customer_id of the customer? "));
            PowerAgreementType agreement = PowerAgreementType.valueOf(JOptionPane.showInputDialog("What is the powerAgreement of the customer? "));
            customersOpg3[i] = new Customer(name, email, id, agreement);
        }

        Customer customer1 = new Customer("Ole", "ole@gmail.com", 1, PowerAgreementType.NORGESPRICE);

        System.out.println(customer1.toString());

        for(Customer i : customersOpg3) {
            System.out.println(i.toString());
        }

        for(Customer j : customersOpg3) {
            System.out.println(j.getName() + "\n");

        }

        customer1.setCustomer_id(69);
        System.out.println(customer1.toString());

        Customer[] customertemp = new Customer[2];
        customertemp[0] = new Customer();
        System.out.println(customertemp[0].toString());
    }
}
