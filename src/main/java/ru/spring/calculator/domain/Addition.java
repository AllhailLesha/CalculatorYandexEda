package ru.spring.calculator.domain;

import java.text.DecimalFormat;
import java.util.concurrent.ThreadLocalRandom;

public class Addition {
    private double distanceToRestaurant;
    private double distanceToCustomer;

    public double getDistanceToRestaurant() {
        return distanceToRestaurant;
    }

    public double getDistanceToCustomer() {
        return distanceToCustomer;
    }

    public void setDistanceToRestaurant(double distanceToRestaurant) {
        this.distanceToRestaurant = distanceToRestaurant;
    }

    public void setDistanceToCustomer(double distanceToCustomer) {
        this.distanceToCustomer = distanceToCustomer;
    }

    public double getFullDistance() {
        return distanceToRestaurant + distanceToCustomer;
    }

    public String getShippingPrice() {
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        return decimalFormat.format(getFullDistance() * 15 * getDemandFactor());
    }

    public double getDemandFactor() {
        return ThreadLocalRandom.current().nextDouble(1.1, 3);
    }
}
