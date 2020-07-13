package model;

import java.io.Serializable;

/** The integrated sensor suite is a device that contains many connected sensors which collect data about their environments.
 * 
 * @author chanteltrainer
 * @version July 12, 2020
 */
public class IntegratedSensorSuite implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = 4721190505387048162L;

    /** The degree symbol for use in formatted strings regarding temperature or angles. */
    final static char DEGREE_SYMBOL = 0x00B0;
    
    //Serialized fields must be public. 
    public WindDirectionSensor myWindDirection;
    
    public WindSpeedSensor myWindSpeed;
    
    public HumiditySensor myHumidity;
    
    public TemperatureSensor myTemperature;
    
    //public transient RainCollectorSensor myRainSensor;
    
    /** Each Vantage Pro2 console can receive data from up to 8 different wireless transmitters.
     *  The default transmitter ID for the sensor suite is 1, and in most cases it is not necessary to change it.
     */
    public int myTransmitterId = 1;
    
    /** 
     * Constructor of a Integrated Sensor Suite which contains a variety of sensors and stores the current data. 
     * @param theTransmitterId
     */
    public IntegratedSensorSuite(int theTransmitterId) {
        myWindDirection = new WindDirectionSensor();
        myWindSpeed = new WindSpeedSensor();
        myHumidity = new HumiditySensor();
        myTemperature = new TemperatureSensor();
        //myRainSensor = new RainCollectorSensor();
        myTransmitterId = theTransmitterId;
    }

    /** Returns the transmitter ID. */
    public int getTransmitterId() {
        return myTransmitterId;
    };
    
    /** Changes the transmitter ID. */
    public void setTransmitterId(int theInt) {
        myTransmitterId = theInt;
    }
    
    @Override
    public String toString() {
        return "Wind Direction: " + myWindDirection.getData().toString() + ". Wind Speed: " + myWindSpeed.getData().toString() + ". Humidity: " 
                + myHumidity.getData().toString() + "%. Temperature: " + myTemperature + DEGREE_SYMBOL + "F. "; // + "RainAmount: " 
                //+ myRainAmount;
    }
    
}