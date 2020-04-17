import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TriangleTest {

    @Test
    void triangle() {
        double firstSide = 1;
        double secondSide = 1;
        double thirdSide = 1;
        String expect = "Tam giác đều";
        String result = Triangle.classifyTriangle(firstSide, secondSide, thirdSide);
        assertEquals(expect, result);
    }

    @Test
    void triangle1() {
        double firstSide = 1;
        double secondSide = 2;
        double thirdSide = 3;
        String expect = "Không phải tam giác";
        String result = Triangle.classifyTriangle(firstSide, secondSide, thirdSide);
        assertEquals(expect, result);
    }

    @Test
    void triangle2() {
        double firstSide = 1;
        double secondSide = 4;
        double thirdSide = 2;
        String expect = "Không phải tam giác";
        String result = Triangle.classifyTriangle(firstSide, secondSide, thirdSide);
        assertEquals(expect, result);
    }

    @Test
    void triangle3() {
        double firstSide = 4;
        double secondSide = 4;
        double thirdSide = 2;
        String expect = "Tam giác cân";
        String result = Triangle.classifyTriangle(firstSide, secondSide, thirdSide);
        assertEquals(expect, result);
    }
}