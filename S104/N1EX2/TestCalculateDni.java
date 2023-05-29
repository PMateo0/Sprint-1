package S104.N1EX2;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCalculateDni {


    @ParameterizedTest
    @CsvSource({
            "12365498, P",
            "54651248, M",
            "46466616, S",
            "43547344, H",
            "45654456, P",
            "46345758, E",
            "35645645, S",
            "45654699, K",
            "54654523, Z",
            "64814847, L"
})

    void TestCalculate(String numDni, String letter){
        CalculateDni calculateDni = new CalculateDni();
        String newLetter = calculateDni.calculateLetter(numDni,calculateDni.addList());
        assertEquals(letter,newLetter);
    }
}
