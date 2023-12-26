public class Point {
    private double x;
    private double y;

    //constructor having both parameters
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    //distance(Point dest) - distance from current point to the dest point
    public double distance(Point dest){
        double xDis = this.x - dest.x;
        double yDis = this.y - dest.y;

        return Math.sqrt(Math.pow(xDis,2.0) + Math.pow(yDis,2.0));
    }
}
