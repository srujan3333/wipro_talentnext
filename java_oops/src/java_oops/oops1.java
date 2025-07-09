package java_oops;
public class oops1 {
    double width;
    double height;
    double depth;

    oops1(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    double getVolume() {
        return width * height * depth;
    }

    public static void main(String[] args) {
        oops1 myBox = new oops1(5.0, 3.0, 4.0);
        double volume = myBox.getVolume();
        System.out.println("Volume of the box is: " + volume);
    }
}
