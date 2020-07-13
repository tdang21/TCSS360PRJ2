package model;
/**
 *  The sensor that returns the outside temperature.
 *  Sensor refreshes every 10s.
 * @author chanteltrainer
 * @version 7/12/2020
 */
public class TemperatureSensor extends AbstractSensor {

    private Integer myTemperature;
    
    /** Constructor for a TemperatureSensor.*/
    public TemperatureSensor() {
        updateInterval = 10000; //Amount of time between each data refresh - 10s
        refreshData();
    }
    
    @Override
    public String getData() {
        return Integer.toString(myTemperature);
    }

    @Override
    public void refreshData() {
        Integer temp = random.nextInt(150);
        if(random.nextBoolean()) {
            temp = -temp; //50% chance to be negative value
        }
        setTemperature(temp); //from 0-150, represented in degrees F. 
    }

    public Integer getTemperature() {
        return myTemperature;
    }

    public void setTemperature(Integer theTemp) {
        myTemperature = theTemp;
    }

}
