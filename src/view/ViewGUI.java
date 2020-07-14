package view;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import javax.swing.JPanel;

import model.IntegratedSensorSuite;

public class ViewGUI extends JPanel implements PropertyChangeListener {
    
    IntegratedSensorSuite myISS;
    
    public ViewGUI(IntegratedSensorSuite theISS) {
        
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        // TODO Auto-generated method stub
        
    }
    

}
