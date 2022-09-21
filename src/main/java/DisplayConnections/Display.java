package DisplayConnections;

import java.awt.*;

public class Display {

    private final String name;
    private final Integer height;
    private final Integer width;
    private final Integer refreshRate;

    private final java.awt.Rectangle bounds;

    public Display(GraphicsDevice display){
        this.name = display.getIDstring();
        this.height = display.getDisplayMode().getHeight();
        this.width = display.getDisplayMode().getWidth();
        this.refreshRate = display.getDisplayMode().getRefreshRate();
        this.bounds = display.getDefaultConfiguration().getBounds();
    }

    public String getComboName(){
        return this.name + ", " +
                this.height + "x" +
                this.width + ", " +
                this.refreshRate + "hz";
    }

    public java.awt.Rectangle getBounds(){
        return bounds;
    }

}
