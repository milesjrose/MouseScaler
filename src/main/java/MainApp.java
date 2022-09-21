import DisplayConnections.*;

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


        // test
        conManager.connect(0, 0, Direction.LEFT);
        ArrayList<DisplayConnection> connections  = conManager.getConnections();
        for (DisplayConnection connection: connections){
            for (Boundary boundary: connection.getBoundaries()){
                System.out.println(boundary.toString());
            }
        }


    }
}
