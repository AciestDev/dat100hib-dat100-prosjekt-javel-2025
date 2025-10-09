package no.hvl.dat100.javel.oppgave2;

import no.hvl.dat100.javel.oppgave1.DailyPower;
import no.hvl.dat100.javel.oppgave1.DayPowerData;

import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MonthMain {
    public static void main(String[] args) {

        // test data
        double[][] power_prices_month = MonthPowerData.powerprices_month;

        double[][] power_usage_month = MonthPowerData.powerusage_month;

        System.out.println("==============");
        System.out.println("OPPGAVE 2");
        System.out.println("==============");
        System.out.println();

        // a) print power usage for a month
        System.out.println("a)");
        System.out.println("All power usages that month: ");
        MonthlyPower.print_PowerUsage(power_usage_month);
        System.out.println();
        System.out.println();

        // b) print power prices for a month
        System.out.println("b)");
        System.out.println("All power prices that month: ");
        MonthlyPower.print_PowerPrices(power_prices_month);
        System.out.println();
        System.out.println();

        // c) compute total power usage for a month
        System.out.println("c) \n");
        double sumOfPowerUsage = MonthlyPower.computePowerUsage(power_usage_month);
        System.out.println("This is all the total power usage this month:" + sumOfPowerUsage + " kWk \n");

        // d) determine whether a given threshold in powerusage for the month has been exceeded
        System.out.println("d) \n");
        double threshold = Double.parseDouble(JOptionPane.showInputDialog("Give me a power limit of the month"));
        if (MonthlyPower.exceedThreshold(power_usage_month, threshold)) {
            System.out.println("The power threashold of "+ threshold + "kWh was exceeded\n");
        } else {
            System.out.println("The power threashold of " + threshold + "kWh was not exceeded\n");
        }

        // e) compute spot price
        System.out.println("e) \n");
        double sumOfSpotPrice = MonthlyPower.computeSpotPrice(power_usage_month, power_prices_month);
        System.out.println("The sum of the spot prices this month is: " + sumOfSpotPrice + " NOK\n");

        // f) power support for the month
        System.out.println("f) \n");
        double sumOfSupport = MonthlyPower.computePowerSupport(power_usage_month, power_prices_month);
        System.out.println("The sum of the support this month is: " + sumOfSupport + " NOK\n");

        // g) Norgesprice for the month
        System.out.println("g) \n");
        double sumOfNorgesPris = MonthlyPower.computeNorgesPrice(power_usage_month);
        System.out.println("The total cost from Norgespris with 0.5NOK/kWh would be: " + sumOfNorgesPris + " NOK");
    }
}