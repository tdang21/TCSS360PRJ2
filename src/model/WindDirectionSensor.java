package model;

/**
 *  The sensor that returns wind direction data 0 - 360 degrees of a compass.
 * @author chanteltrainer
 * @version 7/9/20
 */
public class WindDirectionSensor extends AbstractSensor {

    private Integer myWindDirection;
    
    /** Constructor for a WindDirectionSensor.*/
    public WindDirectionSensor() {
        refreshData();
    }
    
    @Override
    public String getData() {
        return Integer.toString(myWindDirection);
    }

    @Override
    public void refreshData() {
        setWindDirection(random.nextInt(361)); //from 0-360, represented in degrees. 
    }

    public Integer getWindDirection() {
        return myWindDirection;
    }

    public void setWindDirection(Integer theWindDirection) {
        this.myWindDirection = theWindDirection;
    }

}
