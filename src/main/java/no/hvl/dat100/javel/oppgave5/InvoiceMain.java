package no.hvl.dat100.javel.oppgave5;

import no.hvl.dat100.javel.oppgave3.Customer;
import no.hvl.dat100.javel.oppgave3.PowerAgreementType;
import no.hvl.dat100.javel.oppgave2.MonthPowerData;
import no.hvl.dat100.javel.oppgave4.Customers;
import no.hvl.dat100.javel.oppgave4.CustomersMain;

public class InvoiceMain {

    public static void main(String[] args) {

        System.out.println("==============");
        System.out.println("OPPGAVE 5");
        System.out.println("==============");
        System.out.println();


        Customer one = new Customer("Sander", "sander@gmail.com", 1, PowerAgreementType.SPOTPRICE);
        Customer two = new Customer("Sivert", "Sivert@gmail.com", 4, PowerAgreementType.NORGESPRICE);
        Customer three = new Customer("Tor-leif", "Tor.leif@gmail.com", 8000, PowerAgreementType.POWERSUPPORT);

        Invoice Cone = new Invoice(one, "January", CustomerPowerUsageData.usage_month_customer1, MonthPowerData.powerprices_month);
        Invoice Ctwo = new Invoice(two, "April", CustomerPowerUsageData.usage_month_customer2, MonthPowerData.powerprices_month);
        Invoice Cthree = new Invoice(three, "August", CustomerPowerUsageData.usage_month_customer3, MonthPowerData.powerprices_month);

        Cone.computeAmount();
        Ctwo.computeAmount();
        Cthree.computeAmount();

        Cone.printInvoice();
        Ctwo.printInvoice();
        Cthree.printInvoice();

    }
}
