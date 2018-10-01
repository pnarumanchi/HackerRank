
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SockMerchantTest {
    private SockMerchant sockMerchant;

    @BeforeEach
    void setUp() {
        sockMerchant = new SockMerchant();
    }

    @Test
    void solution() {

        int numOfSocks = 9;
        int [] sockColors = {10, 20, 20, 10, 10, 30, 50, 10, 20};

        int resultData = sockMerchant.solution(numOfSocks, sockColors);
        assertEquals(resultData, 3);

    }
}