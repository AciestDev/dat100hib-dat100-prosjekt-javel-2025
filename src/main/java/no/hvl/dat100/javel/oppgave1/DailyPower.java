package no.hvl.dat100.javel.oppgave1;

import java.util.stream.DoubleStream;


public class DailyPower {

    // a) print power prices during a day
    public static void printPowerPrices(double[] prices) {

        for (int i = 0; i<prices.length; i++){

            if(i % 6 != 0) {
                System.out.print(prices[i] + "NOK ");
            } else{
                System.out.println();
                System.out.print(prices[i] + "NOK  ");
            }
        }

    }

    // b) print power usage during a day
    public static void printPowerUsage(double[] usage) {

        for (int i = 0; i<usage.length; i++){

            if(i % 6 != 0) {
                System.out.print(usage[i] + "kWh ");
            } else{
                System.out.println();
                System.out.print(usage[i] + "kWh ");
            }
        }
    }

    // c) compute power usage for a single day
    public static double computePowerUsage(double[] usage) {

        return DoubleStream.of(usage).sum();
    }

    // d) compute spot price for a single day
    public static double computeSpotPrice(double[] usage, double[] prices) {

        double price = 0;

        for (int i = 0; i<prices.length; i++){
            price = price + usage[i] * prices[i];
        }

        price = Math.round(price * 100) / 100.0;

        return price;
    }

    // e) compute power support for a given usage and price
    private static final double THRESHOLD = 0.9375;
    private static final double PERCENTAGE = 0.9;

    private static double getSupport(double usage, double price) {

        double support = 0;

        double sum = usage * price;

        if (price > THRESHOLD) {

            support = sum * PERCENTAGE;
            support = Math.round(support * 100) / 100.0;
        }

        return support;
    }

    // f) compute power support for a single day
    public static double computePowerSupport(double[] usage, double[] prices) {

        double support = 0;

        for (int i = 0; i<prices.length; i++){
            support = support + getSupport(usage[i], prices[i]);
        }

        support = Math.round(support * 100) / 100.0;

        return support;
    }

    private static final double NORGESPRIS_KWH = 0.5;

    // g) compute norges pris for a single day
    public static double computeNorgesPrice(double[] usage) {

        double price = 0;

        for(int i = 0; i<usage.length; i++){
            price = price + usage[i] * NORGESPRIS_KWH;
            price = Math.round(price * 100.0) / 100.0;
        }
        price = Math.round(price * 100.0) / 100.0;

        return price;
    }

    // h) compute peak usage during a single day
    public static double findPeakUsage(double[] usage) {

        double temp_max = 0;

        for(int i = 0; i<usage.length; i++){
            if(usage[i] > temp_max){
                temp_max = usage[i];
            }
        }

        return temp_max;
    }

    public static double findAvgPower(double[] usage) {

        double average = 0;

        average = DoubleStream.of(usage).average().getAsDouble();

        average = Math.round(average * 100) / 100.0;

        return average;
    }
}