import java.util.ArrayList;

public class Shape {

    // container of Points (e.g. ArrayList<Point>)
    private ArrayList<Point> shapeList;

    public Shape(){
        shapeList = new ArrayList<>();
    }

    // addPoint(Point) - adds to the container
    public void addPoint(Point point) {
        shapeList.add(point);
    }
}
