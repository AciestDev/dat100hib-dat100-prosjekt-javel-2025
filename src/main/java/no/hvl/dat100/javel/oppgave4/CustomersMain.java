package no.hvl.dat100.javel.oppgave4;

import no.hvl.dat100.javel.oppgave3.Customer;
import no.hvl.dat100.javel.oppgave3.PowerAgreementType;

public class CustomersMain {

    public static void main(String[] args) {

        System.out.println("==============");
        System.out.println("OPPGAVE 4");
        System.out.println("==============");
        System.out.println();

        // a) Complete constructor

        Customers ppl = new Customers(10);
        Customer[] test = ppl.getCustomers();

        for (int i = 0; i < test.length; i++) {
            test[i] = new Customer();
            System.out.println(test[i].toString());
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

        // b) count number of non-null references

        System.out.println(ppl.countNonNull());

        // c) return reference to customer with given id (if exists)

        // d) add a customer to the reference table

        // e) remove customer with given id from reference table

        //f
        /* Customer test = customers.getCustomer(2);

        if (test != null) {
            System.out.println(test.getCustomer_id());
        }
         */
    }
}
