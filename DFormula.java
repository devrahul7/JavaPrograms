// Write a program to calculate, area of the triangle, and the Volume of the Cube and Cuboid.
// Formula: Volume of Cuboid = length*width*height; and Volume of Cube: side*side*side;

public class DFormula {
    public static void main(String[] args) {
        int length = 6;
        int width = 7;
        int height = 8;
        double side = 9;

        int AreaOfCube = (length * width * height);
        int AreaOfCuboid = (int) (side * side * side);

        System.out.println("Area of cube is: " + AreaOfCube);
        System.out.println("Area of cuboid is: " + AreaOfCuboid);

    }

}
