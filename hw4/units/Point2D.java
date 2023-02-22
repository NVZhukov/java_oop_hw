package java_oop.homework.hw4.units;

public class Point2D {

    protected int x,y;

    public Point2D() {
        this.x = x;
        this.y = y;
    }

    protected double distanceToPlayer(Point2D a, Point2D b){
        return Math.sqrt((a.x - b.x)*(a.x - b.x) + (a.y - b.y)*(a.y - b.y));
    }
}
