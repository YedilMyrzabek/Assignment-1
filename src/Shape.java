import java.util.ArrayList;

public class Shape {

    // container of Points (e.g. ArrayList<Point>)
    private ArrayList<Point> shapeList;

    public Shape() {
        shapeList = new ArrayList<>();
    }

    // addPoint(Point) - adds to the container
    public void addPoint(Point point) {
        shapeList.add(point);
    }

    // calculatePerimeter()
    public double calculatePerimeter() {
        double perimeter = 0;

        for (int i = 0; i < shapeList.size() - 1; i++) {
            Point point1 = shapeList.get(i);
            Point point2 = shapeList.get(i + 1);

            perimeter += point1.distance(point2);
        }
        return perimeter + shapeList.getFirst().distance(shapeList.getLast());
    }

    // getAverageSide()
    public double getAverageSide() {
        return calculatePerimeter() / shapeList.size();
    }

    // getLongestSide()
    public double getLongestSide() {
        double longSide = 0;

        for (int i = 0; i < shapeList.size() - 1; i++) {
            Point cPoint = shapeList.get(i);
            Point nPoint = shapeList.get(i + 1);
            if (cPoint.distance(nPoint) > longSide) {
                longSide = cPoint.distance(nPoint);
            }
        }
        return longSide;
    }
}
