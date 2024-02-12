package ISP;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

@DisplayName("Math Students Test")
public class TestCalculators {

    @Test
    @DisplayName("Elementary Student Test")
    public void testElementaryStudent() {
        ElementaryMathStudent elementaryStudent = new ElementaryMathStudent();

        assertEquals(42, elementaryStudent.Calculate("add", 40, 2));
        assertEquals(38, elementaryStudent.Calculate("subtract", 40, 2));
        assertEquals(80, elementaryStudent.Calculate("multiply", 40, 2));
        assertEquals(20d, elementaryStudent.Calculate("divide", 40, 2));
    }

    @Test
    @DisplayName("Advanced Student Test")
    public void testAdvancedStudent() {
        // var advancedStudent = new AdvancedMathStudent();

        // assertEquals(42, advancedStudent.Calculate("add", 40, 2));
        // assertEquals(38, advancedStudent.Calculate("subtract", 40, 2));
        // assertEquals(80, advancedStudent.Calculate("multiply", 40, 2));
        // assertEquals(20d, advancedStudent.Calculate("divide", 40, 2));
        // assertEquals(1600d, advancedStudent.Calculate("power", 40, 2));
        // assertEquals(7d, advancedStudent.Calculate("squareroot", 49));
    }

}
