package com.example.kollokvium2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator implements ValidatorStrategy {
    private Pattern pattern;
    private Matcher matcher;
    private static final String EMAIL_PATTERN = "[a-zA-Z0-9]+@[a-zA-Z0-9]+\\.[a-zA-Z0-9]+";

    public EmailValidator() {
        pattern = Pattern.compile(EMAIL_PATTERN);
    }

    public boolean validate(String data) {
        matcher = pattern.matcher(data);
        return matcher.matches();
    }
}
