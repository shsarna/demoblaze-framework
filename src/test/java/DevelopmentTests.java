import org.testng.Assert;
import org.testng.annotations.Test;
import utils.Triangle;

public class DevelopmentTests {

    @Test
    public void developmentScenarioForScalene(){
        double sideA = 5.0;
        double sideB = 4.0;
        double sideC = 6.0;

        Triangle triangle = new Triangle(sideA, sideB, sideC);
        String triangleType = triangle.getTriangleType();
        System.out.println("utils.Triangle Type: " + triangleType);
        Assert.assertEquals(triangleType, "Scalene triangle");
    }

    @Test
    public void developmentScenarioForIsosceles(){
        double sideA = 5.0;
        double sideB = 5.0;
        double sideC = 6.0;

        Triangle triangle = new Triangle(sideA, sideB, sideC);
        String triangleType = triangle.getTriangleType();
        System.out.println("utils.Triangle Type: " + triangleType);
        Assert.assertEquals(triangleType, "Isosceles triangle");
    }

    @Test
    public void developmentScenarioForEquilateral(){
        double sideA = 5.0;
        double sideB = 5.0;
        double sideC = 5.0;

        Triangle triangle = new Triangle(sideA, sideB, sideC);
        String triangleType = triangle.getTriangleType();
        System.out.println("utils.Triangle Type: " + triangleType);
        Assert.assertEquals(triangleType, "Equilateral triangle");
    }
}
