public class FirstLevel {
    private int firstField;
    private ComplexType complexField;
    private EnumType enumField;

    public FirstLevel(int firstField, ComplexType complexField, EnumType enumField) {
        this.firstField = firstField;
        this.complexField = complexField;
        this.enumField = enumField;
    }

    public int getFirstField() {
        return firstField;
    }

    public ComplexType getComplexField() {
        return complexField;
    }

    public EnumType getEnumField() {
        return enumField;
    }
}
