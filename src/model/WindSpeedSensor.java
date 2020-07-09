package model;

/** The sensor which returns wind speed data, 0 - 200 MPH. 
 * 
 * @author chanteltrainer
 *
 */
public class WindSpeedSensor extends AbstractSensor {
    
    private Integer myWindSpeed;
    
    public WindSpeedSensor() {
        refreshData();
    }
    
    @Override
    public String getData() {
        return Integer.toString(myWindSpeed);
    }

    @Override
    public void refreshData() {
        myWindSpeed = random.nextInt(200); //0-200 MPH
        
    }
    
    public Integer getSpeed() {
        return myWindSpeed;
    }

    public void setWindSpeed(Integer theWindSpeed) {
        myWindSpeed = theWindSpeed;
    }

}
