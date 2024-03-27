package pr1;

import java.util.function.Predicate;

public class PinValidator implements Predicate<String> {

    @Override
    public boolean test(String substr) {
        return substr.matches("^\\d{4}$|^\\d{6}$");
    }

    public static void main(String[] args) {
        PinValidator pinValidator = new PinValidator();

        System.out.println(pinValidator.test("7582"));
        System.out.println(pinValidator.test("15435"));
        System.out.println(pinValidator.test("aabre5"));
        System.out.println(pinValidator.test("642189"));
    }
}
