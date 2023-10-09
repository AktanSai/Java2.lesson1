public class SecondLevel extends FirstLevel {
    private int secondField;

    public SecondLevel(int firstField, ComplexType complexField, EnumType enumField, int secondField) {
        super(firstField, complexField, enumField);
        this.secondField = secondField;
    }

    public int getSecondField() {
        return secondField;
    }

    public void methodA() {
        System.out.println("Метод A класса SecondLevel");
    }

    public final void methodB() {
        System.out.println("Финальный метод B класса SecondLevel");
    }
}
