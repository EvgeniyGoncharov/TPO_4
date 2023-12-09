package testo;

import org.example.Model;

import static org.junit.Assert.assertEquals;

public class Implement {
    private Model model;
    private double result;

    public void initializeCalculator() {
        model = new Model();
    }

    public void enterData(String data) throws Exception {
        result = model.arithmeticParser(data);
    }

    public void checkResult(double expectedResult) {
        assertEquals(expectedResult, result, 0.001);
    }
}
