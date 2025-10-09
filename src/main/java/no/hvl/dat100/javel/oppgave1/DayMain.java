package no.hvl.dat100.javel.oppgave1;

import no.hvl.dat100.javel.oppgave2.MonthlyPower;

import javax.swing.*;

public class DayMain {

    public static void main(String[] args) {

        // test data
        double[] powerusage_day = DayPowerData.powerusage_day;

        double[] powerprices_day = DayPowerData.powerprices_day;

        System.out.println("==============");
        System.out.println("OPPGAVE 1");
        System.out.println("==============");
        System.out.println();

        // a) print power prices during a day
        System.out.println("a)");
        System.out.println("The prices for this day is:");
        DailyPower.printPowerPrices(powerprices_day);
        System.out.println();
        System.out.println();

        // b) print power usage during a day
        System.out.println("b)");
        System.out.println("The usage for this day is:");
        DailyPower.printPowerUsage(powerusage_day);
        System.out.println();
        System.out.println();

        // c) compute power usage for a single day
        System.out.println("c) \n");
        double sumOfUsage = DailyPower.computePowerUsage(powerusage_day);
        System.out.println("The total sum of the power usage is: " + sumOfUsage + " kWh");
        System.out.println();

        // d) compute spot price for a single day
        System.out.println("d) \n");
        double sumOfSpotPrice = DailyPower.computeSpotPrice(powerusage_day, powerprices_day);
        System.out.println("The total cost of this day of eletric bill would be: " + sumOfSpotPrice + " NOK");
        System.out.println();

        // e) compute power support for a given usage and price
        /*
        System.out.println("e) \n");
        double usage = Double.parseDouble(JOptionPane.showInputDialog("Give me the power usage of one hour:"));
        double price = Double.parseDouble(JOptionPane.showInputDialog("Give me the price of that hour:"));
        double sumOfSupport1 = DailyPower.getSupport(usage,price);
        System.out.println("The total amount of support you will receive is: " + sumOfSupport1);
        System.out.println();
        */

        // f) compute power support for a single day
        System.out.println("f) \n");
        double sumOfSupport = DailyPower.computePowerSupport(powerusage_day,powerprices_day);
        System.out.println("The total amount of support you will receive is: " + sumOfSupport + " NOK");
        System.out.println();

        // g) compute norges pris for a single day
        System.out.println("g) \n");
        double sumOfNorgesprice = DailyPower.computeNorgesPrice(powerusage_day);
        System.out.println("The total cost from Norgespris would be: " + sumOfNorgesprice + " NOK");
        System.out.println();

        // h) compute peak usage during a single day
        System.out.println("h) \n");
        double biggestUsage = DailyPower.findPeakUsage(powerusage_day);
        System.out.println("The peak usage this day is: " + biggestUsage + " kWh");
        System.out.println();

        // i) find average usage during a single day
        System.out.println("i) \n");
        double avergeUsage = DailyPower.findAvgPower(powerusage_day);
        System.out.println("The average usage this day is: " + avergeUsage + " kWh");
        System.out.println();

    }
}
