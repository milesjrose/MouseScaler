package DisplayConnections;

import java.awt.*;
import java.util.ArrayList;

public class ConnectionManager {
    private ArrayList<Display> displays;
    private ArrayList<DisplayConnection> connections;

    public ConnectionManager(GraphicsDevice[] devices){
        this.displays = new ArrayList<>();
        this.connections = new ArrayList<>();
        for (GraphicsDevice device : devices){
            displays.add(new Display(device));
        }

    }

    public ArrayList<Display> getDisplays(){
        return displays;
    }

    public void connect(Integer display1No, Integer display2No, Direction direction){
        //add error checking
        connections.add(new DisplayConnection(displays.get(display1No), displays.get(display2No), direction));
    }

    public void clearConnections(){
        connections.clear();
    }

}
