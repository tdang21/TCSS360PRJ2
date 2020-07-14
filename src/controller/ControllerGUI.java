package controller;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import javax.swing.JFrame;
import javax.swing.JPanel;

import model.IntegratedSensorSuite;
import view.ViewGUI;

public class ControllerGUI extends JPanel implements PropertyChangeListener {
    
    IntegratedSensorSuite myISS;
    
    ViewGUI myView;
    
    public ControllerGUI(String theFilePath) {
        myISS = deserialization(theFilePath);
        myView = new ViewGUI(myISS);
    }

    /**
     * Creates and shows the GUI, which also calls the view panel.
     */
    public static void createAndShowGUI() {
        final JFrame window = new JFrame("Integrated Sensor Suite Console");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //TODO
    }
    
    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        // TODO Auto-generated method stub
        
    }

    /**
     * A method to deserialize the ISS model object. Can return null if no object is found.
     * @param theFilePath
     */
    public static IntegratedSensorSuite deserialization(String theFilePath) {
        IntegratedSensorSuite theSuite = null;
        
        try
        {    
            // Reading the object from a file 
            FileInputStream file = new FileInputStream(theFilePath); 
            ObjectInputStream in = new ObjectInputStream(file); 
              
            // Method for deserialization of object 
            theSuite = (IntegratedSensorSuite) in.readObject(); 
              
            in.close(); 
            file.close(); 
              
            System.out.println("Object has been deserialized"); 
            
            System.out.println(theSuite.toString());
        } 
          
        catch(IOException ex) 
        { 
            System.out.println("IOException is caught"); 
        } 
          
        catch(ClassNotFoundException ex) 
        { 
            System.out.println("ClassNotFoundException is caught"); 
        }
        return theSuite; 
    }
  
}

