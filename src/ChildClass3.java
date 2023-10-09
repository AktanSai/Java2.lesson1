public class ChildClass3 extends ParentClass implements Printable{
    private double child3Field;

    public ChildClass3(int parentField, double child3Field) {
        super(parentField);
        this.child3Field = child3Field;
    }

    public double getChild3Field() {
        return child3Field;
    }

    @Override
    public void print() {
        System.out.println("ChildClass3 - ParentField: " + getParentField() + ", Child3Field: " + getChild3Field());
    }
}
