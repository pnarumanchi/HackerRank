import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountingValleysTest {

   private CountingValleys countingValleys;
    @BeforeEach
    void setUp() {
        countingValleys = new CountingValleys();
    }

    @Test
    void solution() {
        int n = 8;
        String steps = "UDDDUDUU";
        int resultData = countingValleys.solution(n, steps);
        assertEquals(resultData, 1);
    }
}