import java.util.Arrays;

public class Okeanar {
    private Shark [] sharks ;
    private  Duck [] ducks ;
    private  Turtle [] turtles ;

    public Okeanar(Shark[] sharks, Duck[] ducks, Turtle[] turtles) {
        this.sharks = sharks;
        this.ducks = ducks;
        this.turtles = turtles;
    }

    public Shark[] getSharks() {
        return sharks;
    }

    public void setSharks(Shark[] sharks) {
        this.sharks = sharks;
    }

    public Duck[] getDucks() {
        return ducks;
    }

    public void setDucks(Duck[] ducks) {
        this.ducks = ducks;
    }

    public Turtle[] getTurtles() {
        return turtles;
    }

    public void setTurtles(Turtle[] turtles) {
        this.turtles = turtles;
    }

    @Override
    public String toString() {
        return "\nOkeanar{" +
                "sharks=" + Arrays.toString(sharks) +
                ", ducks=" + Arrays.toString(ducks) +
                ", turtles=" + Arrays.toString(turtles) +
                '}';
    }
}
