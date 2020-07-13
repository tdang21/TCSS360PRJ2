package model;

import java.util.Random;

/**
 * A sensor that returns the rain data.
 * 
 * @author Haoying Li
 * @version 7/12/2020
 */
public class RainSensor extends AbstractSensor {
    
    private double myDailyRain;
    private final double MAXDAILY = 99.99;
    
    private Random rand = new Random();

    public RainSensor() {
        updateInterval = 20000; // refresh rate 50s
        refreshData();
    }
    
    @Override
    public String getData() {
        return String.valueOf(myDailyRain);
    }

    @Override
    public void refreshData() {
        setDailyRain();
    }
    
    public void setDailyRain() {
        myDailyRain = MAXDAILY * rand.nextDouble();
    }
    
    public double getDailyRain() {
        return myDailyRain;
    }
}
