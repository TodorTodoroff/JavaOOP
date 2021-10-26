package WorkingWithAbstractionT1.Lab.PointInRectangle02;

public class Point {
    private final int x;
    private final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    public boolean isGreaterOrEqualThan(Point p){
        return p.x >= x && p.y >= y;
    }
    public boolean isLesserThanOrEqual(Point p){
        return p.x <= x && p.y <= y;
    }
}
