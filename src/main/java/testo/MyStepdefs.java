package testo;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Controller;
import org.example.Model;
import org.example.View;

import static org.junit.Assert.assertEquals;

public class MyStepdefs {
    private Model model;
    private double result;

    private Controller controller;

    private View view;
    @Given("stack calc")
    public void first() {
        model = new Model();
    }

    @When("enter {string}")
    public void second(String arg0) throws Exception {
        result = model.arithmeticParser(arg0);
    }
    @Then("result {double}")
    public void third(double arg0) {
        assertEquals(arg0, result, 0.001);
    }


    @Given("open calculator")
    public void openCalculator() {
        controller = new Controller();
        view = Controller.view;
    }

    @When("push {string}")
    public void push(String arg0) {
        if(arg0.equals(view.plus.getText())){
            view.plus.doClick();
        }
        else if(arg0.equals(view.seven.getText()) ){
            view.seven.doClick();
        }
        else if(arg0.equals(view.three.getText())){
            view.three.doClick();
        }
        else if(arg0.equals(view.divide.getText()))
            view.divide.doClick();
        else if(arg0.equals(view.multiply.getText()) ){
            view.multiply.doClick();
        }
        else if(arg0.equals(view.two.getText())){
            view.two.doClick();
        }
        else if(arg0.equals(view.result.getText())){
            view.result.doClick();
        }
        else if(arg0.equals(view.zero.getText())){
            view.zero.doClick();
        }
    }
    @Then("result is {double}")
    public void resultIs(double arg0) {
        assertEquals(arg0, view.resVal, 0.001);
    }

    @Then("arithmetic error")
    public void arithmeticError() {
        ArithmeticException e = new ArithmeticException("Делить на ноль нельзя");
        assertEquals(view.strError, e.toString());
    }
}
