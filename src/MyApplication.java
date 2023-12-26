import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MyApplication {
    public static void main(String... args) throws FileNotFoundException {
        //Create file and connect
        File file = new File("C:\\\\Doc\\\\java.txt");

        Scanner sc = new Scanner(file);
        Shape shape = new Shape();

        //read this file
        while (sc.hasNext()) {
            double x = sc.nextDouble();
            double y = sc.nextDouble();

            Point point = new Point(x, y);
            shape.addPoint(point);
        }
    }
}
