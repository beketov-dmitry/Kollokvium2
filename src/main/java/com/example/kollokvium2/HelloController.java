package com.example.kollokvium2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    public TextField emailInput;
    public TextField dateInput;
    public TextField NameAndSurnameInput;
    public Button validate;
    public Label resultName;
    public Label resultDate;
    public Label resultEmail;

    public void validateAction(ActionEvent actionEvent) {
        ValidatorStrategy validatorStrategy;

        String EMAIL = emailInput.getText();
        String DATE = dateInput.getText();
        String NameAndSurname = validate.getText();

        validatorStrategy = ValidateChoose.getValidator("emailInput");
        resultEmail.setText(String.valueOf(validatorStrategy.validate(EMAIL)));
        validatorStrategy = ValidateChoose.getValidator("dateInput");
        resultDate.setText(String.valueOf(validatorStrategy.validate(DATE)));
        validatorStrategy = ValidateChoose.getValidator("NameAndSurnameInput");
        resultEmail.setText(String.valueOf(validatorStrategy.validate(NameAndSurname)));
    }
}