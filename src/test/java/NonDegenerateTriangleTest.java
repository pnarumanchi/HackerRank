import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NonDegenerateTriangleTest {

    private NonDegenerateTriangle nonDegenerateTriangleT;

    @BeforeEach
    void setUp() {
        nonDegenerateTriangleT  = new NonDegenerateTriangle();
    }

    @Test
    void solution1() {
        int [] testData1 = {7,10,7};
        int [] testData2 = {2,3,4};
        int [] testData3 = {2,7,4};

        String [] resultData = nonDegenerateTriangleT.solution(testData1, testData2, testData3);
        assertEquals(resultData.length, 3);
        Assertions.assertArrayEquals(resultData, new String []{"No","No", "Yes"});
    }

    @Test
    void solution2() {
        int [] testData1 = {10,1,9,4,5,6,10};
        int [] testData2 = {5,7,3,9,4,10,10};
        int [] testData3 = {5,4,8,10,1,8,8};

        String [] resultData = nonDegenerateTriangleT.solution(testData1, testData2, testData3);
        assertEquals(resultData.length, 7);
        Assertions.assertArrayEquals(resultData, new String []{"No","No", "Yes", "Yes", "No", "Yes", "Yes"});
    }

    @Test
    void solution3() {
        int [] testData1 = {1,3,6,2,6};
        int [] testData2 = {8,10,3,2,4};
        int [] testData3 = {7,3,7,9,10};

        String [] resultData = nonDegenerateTriangleT.solution(testData1, testData2, testData3);
        assertEquals(resultData.length, 5);
        Assertions.assertArrayEquals(resultData, new String []{"No","No", "Yes", "No", "No"});    }
}