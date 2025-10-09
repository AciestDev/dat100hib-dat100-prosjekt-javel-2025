package no.hvl.dat100.javel.oppgave2;

import no.hvl.dat100.javel.oppgave1.DailyPower;

public class MonthlyPower {

    // a) print power usage for a month
    public static void print_PowerUsage(double[][] usage) {

        for(int i = 0; i < usage.length; i++){
            DailyPower.printPowerUsage(usage[i]);
            // DailyPower.printUsage(usage[i], "kWh");
            System.out.println();
        }
    }

    // b) print power prices for a month
    public static void print_PowerPrices(double[][] prices) {

        for (int i = 0; i < prices.length; i++){
            DailyPower.printPowerPrices(prices[i]);
            //DailyPower.printUsage(prices[i], "NOK");
            System.out.println();
        }
    }

    // c) compute total power usage for a month
    public static double computePowerUsage(double[][] usage) {

        double sum = 0;

        for (int i = 0; i < usage.length; i++){
            sum = sum + DailyPower.computePowerUsage(usage[i]);
        }

        sum = Math.round(sum * 100.0) / 100.0;

        return sum;
    }

    // d) determine whether a given threshold in powerusage for the month has been exceeded
    public static boolean exceedThreshold(double[][] powerusage, double threshold) {

        return computePowerUsage(powerusage) < threshold;

    }

    // e) compute spot price
    public static double computeSpotPrice(double[][] usage, double[][] prices) {

        double price = 0;

        for (int i = 0; i < prices.length; i++){
            price = price + DailyPower.computeSpotPrice(usage[i], prices[i]);
        }
        price = Math.round(price * 100.0) / 100.0;
        return price;
    }

    // f) power support for the month
    public static double computePowerSupport(double[][] usage, double[][] prices) {

        double support = 0;

        for (int i = 0; i < prices.length; i++){
            support = support + DailyPower.computePowerSupport(usage[i], prices[i]);
        }

        support = Math.round(support * 100) / 100.0;

        return support;
    }

    // g) Norgesprice for the month
    public static double computeNorgesPrice(double[][] usage) {

        double price = 0;

        for (int i = 0; i < usage.length; i++){
            price = price + DailyPower.computeNorgesPrice(usage[i]);
            price = Math.round(price * 100.0) / 100.0;
        }
        price = Math.round(price * 100.0) / 100.0;

        return price;
    }
}
