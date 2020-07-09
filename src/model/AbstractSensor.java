package model;

import java.util.Random;

/** AbstractSensor includes behavior of a sensor within the Integrated Sensor Suite. 
 * @author chanteltrainer
 * @version 7/9/2020
 * */
public abstract class AbstractSensor {

    protected static Random random = new Random();
    
    /** This method will return the data collected by that sensor in String format. */ 
    public abstract String getData();
   
    /** This method will refresh the data to get a new reading according the the specifications and boundaries of that sensor */
    public abstract void refreshData();
   
  
}
