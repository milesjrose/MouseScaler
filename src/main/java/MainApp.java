import DisplayConnections.ConnectionManager;
import DisplayConnections.Display;

import java.awt.*;
import java.util.ArrayList;

public class MainApp {
    public static void main(String[] args){

        //set up connection manager
        GraphicsEnvironment g = GraphicsEnvironment.getLocalGraphicsEnvironment();
        GraphicsDevice[] devices = g.getScreenDevices();
        ConnectionManager conManager = new ConnectionManager(devices);

        //setup GUI
        GUI gui = new GUI("Mouse Fixer", conManager);
        gui.updateMonitorBoxes();



    }
}
