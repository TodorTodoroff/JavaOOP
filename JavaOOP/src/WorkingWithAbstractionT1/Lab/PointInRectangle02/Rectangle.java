package WorkingWithAbstractionT1.Lab.PointInRectangle02;

public class Rectangle {
    private final Point pointA;
    private final Point pointC;

    public Rectangle(Point pointA, Point pointC) {
        this.pointA = pointA;
        this.pointC = pointC;
    }

    public boolean contains(Point point) {
        return pointA.isGreaterOrEqualThan(point) && pointC.isLesserThanOrEqual(point);
//        return point.getX() >= pointA.getX() && point.getX() <= pointC.getX()
//                && point.getY() >= pointA.getY() && point.getY() <= pointC.getY();
    }

}
