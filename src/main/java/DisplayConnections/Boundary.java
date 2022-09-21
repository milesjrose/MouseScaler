package DisplayConnections;

public class Boundary {
    private final Integer x1;
    private final Integer x2;
    private final Integer t;

    private final BoudaryType type;

    public Boundary(int x1, int x2, int t, BoudaryType type){
        this.x1 = x1;
        this.x2 = x2;
        this.t = t;
        this.type = type;
    }

    @Override
    public String toString(){
        return this.x1 + ", " + this.x2 + ", " +  this.t + ", " + this.type.toString();
    }
}
