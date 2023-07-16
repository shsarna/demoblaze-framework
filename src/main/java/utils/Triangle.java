package utils;

public class Triangle {
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public String getTriangleType() {
        if (!isValidTriangle()) {
            return "Not a valid triangle";
        }

        if (sideA == sideB && sideB == sideC) {
            return "Equilateral triangle";
        } else if (sideA == sideB || sideA == sideC || sideB == sideC) {
            return "Isosceles triangle";
        } else {
            return "Scalene triangle";
        }
    }

    private boolean isValidTriangle() {
        return sideA + sideB > sideC && sideA + sideC > sideB && sideB + sideC > sideA;
    }
}