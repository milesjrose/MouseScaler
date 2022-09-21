package DisplayConnections;

import java.util.ArrayList;

public class DisplayConnection {
    public Display main;
    public Display second;
    public Direction direction;
    public ArrayList<Boundary> boundaries;

    public DisplayConnection(Display main, Display second, Direction direction){
        this.main = main;
        this.second = second;
        this.direction = direction;
        this.addConnectionsBounds();
    }

    public ArrayList<Boundary> getBoundaries(){return boundaries;}

    private void addConnectionsBounds() {
        int boundaryPixels = 10;
        Boundary boundary;
        Boundary boundary2;
        boundaries = new ArrayList<>();

        switch(direction){
            case TOP:
                // connect top of main to bottom of second
                // & vice versa
                int my1 = main.getBounds().y + main.getBounds().height;
                int my2 = my1 - boundaryPixels;
                int mt = second.getBounds().y + boundaryPixels;
                boundary  = new Boundary(my1, my2, mt, BoudaryType.Y);
                // do the opposite for second
                int sy1 = second.getBounds().y;
                int sy2 = sy1 + boundaryPixels;
                int st = main.getBounds().y + main.getBounds().height - boundaryPixels;
                boundary2  = new Boundary(sy1, sy2, st, BoudaryType.Y);
                boundaries.add(boundary);
                boundaries.add(boundary2);

                break;
            case BOTTOM:
                //connect bottom of main to top of second
                my1 = main.getBounds().y;
                my2 = my1 + boundaryPixels;
                mt = second.getBounds().y + second.getBounds().height - boundaryPixels;
                boundary  = new Boundary(my1, my2, mt, BoudaryType.Y);
                // & vice versa
                sy1 = second.getBounds().y + second.getBounds().height;
                sy2 = sy1 - boundaryPixels;
                st = main.getBounds().y + boundaryPixels;
                boundary2  = new Boundary(sy1, sy2, st, BoudaryType.Y);
                boundaries.add(boundary);
                boundaries.add(boundary2);

                break;
            case LEFT:
                //connect left of main to right of second
                int mx1 = main.getBounds().x;
                int mx2 = mx1 + boundaryPixels;
                mt = second.getBounds().x + second.getBounds().width - boundaryPixels;
                boundary = new Boundary(mx1, mx2, mt, BoudaryType.X);
                // & vice versa
                int sx1 = second.getBounds().x + second.getBounds().width;
                int sx2 = sx1 - boundaryPixels;
                st = main.getBounds().x + boundaryPixels;
                boundary2 = new Boundary(sx1, sx2 ,st, BoudaryType.X);
                boundaries.add(boundary);
                boundaries.add(boundary2);

                break;
            case RIGHT:
                //connect right of main to left of second
                mx1 = main.getBounds().x + main.getBounds().width;
                mx2 = mx1 - boundaryPixels;
                mt = second.getBounds().x + boundaryPixels;
                boundary = new Boundary(mx1, mx2, mt, BoudaryType.X);
                // & vice versa
                sx1 = second.getBounds().x;
                sx2 = sx1 + boundaryPixels;
                st = main.getBounds().x + main.getBounds().width - boundaryPixels;
                boundary2 = new Boundary(sx1, sx2, st, BoudaryType.X);
                boundaries.add(boundary);
                boundaries.add(boundary2);

                break;
        }

    }


}
