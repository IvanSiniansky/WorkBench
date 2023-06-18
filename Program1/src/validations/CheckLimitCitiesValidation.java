package validations;

public class CheckLimitCitiesValidation extends AbstractValidation {

    @Override
    boolean isValid() {
        String[] massiv = this.validatedValue.split(" ");
        return massiv.length == 2;
    }
}