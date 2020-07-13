package model;
/**
 * A sensor that returns the outside humidity level.
 * Refreshes every 
 * @author chanteltrainer
 * @version 7/12/2020
 */
public class HumiditySensor extends AbstractSensor {
    
    private Integer myHumidity;

    public HumiditySensor() {
        updateInterval = 50000; //Amount of time between each data refresh - 50s
        refreshData();
    }
    
    @Override
    public String getData() {
        return Integer.toString(myHumidity);
    }

    @Override
    public void refreshData() {
        setHumidity(random.nextInt(101)); //from 0-100, represents percentage
    }

    public Integer getHumidity() {
        return myHumidity;
    }

    public void setHumidity(Integer theHumidity) {
        myHumidity = theHumidity;
    }
}
