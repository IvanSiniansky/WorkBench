package validations;

public class CheckDublicateValidation extends AbstractValidation {

    @Override
    boolean isValid() {
        String[] massiv = this.validatedValue.split(" ");
        String a = massiv[0];
        String b = massiv[1];
        return !a.equalsIgnoreCase(b);

    }
}