import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DateValidator implements ValidatorStrategy{
    private Pattern pattern;
    private Matcher matcher;

    private static final String DATE_PATTERN = "/^[0-9]{1,2}\\/[0-9]{1,2}\\/[0-9]{4}$/\n";

    public DateValidator() {
        pattern = Pattern.compile(DATE_PATTERN);
    }

    @Override
    public boolean validate(String data) {
        matcher = pattern.matcher(data);
        return matcher.matches();
    }
}
