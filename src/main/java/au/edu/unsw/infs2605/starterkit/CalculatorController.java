/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package au.edu.unsw.infs2605.starterkit;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author Erika
 */
public class CalculatorController {
    private float num1;
    private float num2;
    private float resultNum;
    @FXML
    Button btPlus;
    @FXML
    Button btSubtract;
    @FXML
    Button btMultiply;
    @FXML
    Button btDivision;
    @FXML
    Label result;
    @FXML
    TextField Number1;
    @FXML
    TextField Number2;
    @FXML
    private void getNum()
    {
        num1=Float.parseFloat(Number1.getText().trim());
        num2=Float.parseFloat(Number2.getText().trim());
    }
    @FXML
    private void Plus(ActionEvent event)
    {
        getNum();
        resultNum = num1 + num2;
        result.setText(Float.toString(resultNum));
    }
    @FXML
    private void Subtract(ActionEvent event)
    {
        getNum();
        resultNum = num1 - num2;
        result.setText(Float.toString(resultNum));
    }
    @FXML
    private void Multiply(ActionEvent event)
    {
        getNum();
        resultNum = num1 * num2;
        result.setText(Float.toString(resultNum));
    }
    @FXML
    private void Division(ActionEvent event)
    {
        getNum();
        resultNum = num1 / num2;
        result.setText(Float.toString(resultNum));
    }
}
