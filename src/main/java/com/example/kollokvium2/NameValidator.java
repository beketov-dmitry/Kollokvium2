import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NameValidator implements ValidatorStrategy{

    private Pattern pattern;
    private Matcher matcherName;
    private Matcher matcherSurName;

    private static final String NAME_PATTERN = "^[a-zA-Zа-яА-Я]+$";

    public NameValidator() {
        pattern = Pattern.compile(NAME_PATTERN);
    }
    @Override
    public boolean validate(String data) {
        String[] DATA = data.split(" ");
        matcherName = pattern.matcher(DATA[0]);
        matcherSurName = pattern.matcher(DATA[1]);
        return matcherSurName.matches() && matcherName.matches();
    }
}
