package model;

import java.util.Random;

/**
 *  The sensor that returns the radiation dose.
 *  
 * @author Haoying Li
 * @version 7/12/2020
 */
public class UVSensor extends AbstractSensor {

    private double myRadiationDose;
    private final double MAXRADIATIONDOSE = 199;
    
    private Random rand = new Random();
    
    /** Constructor for an UVSensor.*/
    public UVSensor() {
        updateInterval = 50000; // refresh rate 50s
        refreshData();
    }
    
    @Override
    public String getData() {
        return String.valueOf(myRadiationDose);
    }

    @Override
    public void refreshData() {
        setRadiationDose(); 
    }
    
    public void setRadiationDose() {
        myRadiationDose = MAXRADIATIONDOSE * rand.nextDouble();
    }
    
    public double getRadiationDose() {
        return myRadiationDose;
    }
}
