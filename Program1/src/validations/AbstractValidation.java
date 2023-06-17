package validations;

public abstract class AbstractValidation {

    protected String validatedValue;

    void setValidateValue(String validatedValue) {
        this.validatedValue = validatedValue;
    }
    abstract boolean isValid();
}