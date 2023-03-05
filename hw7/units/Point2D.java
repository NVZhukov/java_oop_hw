package java_oop.homework.hw7.units;

public class Point2D {

    protected int x, y;

    public Point2D(int x, int y) {
        this.x = x;
        this.y = y;
    }


    protected double distanceToPlayer(Point2D a, Point2D b) {
        return Math.sqrt((a.x - b.x) * (a.x - b.x) + (a.y - b.y) * (a.y - b.y));
    }

    protected Point2D getDifPoints(Point2D opponent){
        return new Point2D(x - opponent.x,y - opponent.y);
    }

    protected boolean canMove(Point2D hero){
        return true;
    }
}
