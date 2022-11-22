package calculator;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class MyStepdefs {
    private Calculator calculator;
    private int value1;
    private int value2;
    private double result;

    @Before
    public void before() { calculator = new Calculator();}

    @Given("Two input values, (-?\\d+) and (-?\\d+)$")
    public void inputValues(int arg0, int arg1) {
        value1 = arg0;
        value2 = arg1;
    }

    @When("I calculate sqrt of the division of the a by the b")
    public void divideAndSquareRoot() {
        if(value1 == 0 && value2 != 0){
            result = 0;
        }
        else if(value2 == 0){
            result = -1;
        }else{
            result = calculator.sqrt(calculator.divide(value1, value2));
        }

    }

    @Then("I expect the result ([-?[1-9]\\d*|0].*\\d*)$")
    public void iExpectTheResult(Double arg0) {
        Assert.assertEquals(arg0, result, 0.001);
    }
}
