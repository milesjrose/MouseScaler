package DisplayConnections;

class DisplayConnection {
    public Display main;
    public Display second;
    public Direction direction;

    public DisplayConnection(Display main, Display second, Direction direction){
        this.main = main;
        this.second = second;
        this.direction = direction;
    }
}
