package validations;

public class CheckSymbolsValidation extends AbstractValidation {

    @Override
    boolean isValid() {
        return this.validatedValue.matches("^[a-zA-Z0-9_]*+ [a-zA-Z0-9_]*$");
    }
}