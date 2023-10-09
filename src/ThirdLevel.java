public class ThirdLevel extends SecondLevel{
    private int thirdField;

    public ThirdLevel(int firstField, ComplexType complexField, EnumType enumField, int secondField, int thirdField) {
        super(firstField, complexField, enumField, secondField);
        this.thirdField = thirdField;
    }

    public int getThirdField() {
        return thirdField;
    }

    @Override
    public void methodA() {
        System.out.println("Переопределенный метод A класса ThirdLevel");
    }
}
