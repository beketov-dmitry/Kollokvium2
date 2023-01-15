package com.example.kollokvium2;

public class ValidateChoose {
    public static ValidatorStrategy getValidator(String nameOfFiend){
        if(nameOfFiend == "emailInput"){
            return new EmailValidator();
        } else if (nameOfFiend == "dateInput"){
            return new DateValidator();
        } else {
            return new NameValidator();
        }
    }
}
