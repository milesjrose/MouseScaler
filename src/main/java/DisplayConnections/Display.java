package DisplayConnections;

import java.awt.*;
import java.util.ArrayList;

public class Display {

    private String name;
    private Integer height;
    private Integer width;
    private Integer refreshRate;

    private java.awt.Rectangle bounds;

    public Display(GraphicsDevice display){
        this.name = display.getIDstring();
        this.height = display.getDisplayMode().getHeight();
        this.width = display.getDisplayMode().getWidth();
        this.refreshRate = display.getDisplayMode().getRefreshRate();
        this.bounds = display.getDefaultConfiguration().getBounds();
    }

    public String getComboName(){
        String comboName =
                this.name + ", " +
                this.height + "x" +
                this.width + ", " +
                this.refreshRate + "hz";
        return comboName;
    }

    public java.awt.Rectangle getBounds(){
        return bounds;
    }

}
