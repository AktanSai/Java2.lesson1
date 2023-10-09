public class ChildClass2 extends ParentClass implements Printable {
    private String child2Field;

    public ChildClass2(int parentField, String child2Field) {
        super(parentField);
        this.child2Field = child2Field;
    }

    public String getChild2Field() {
        return child2Field;
    }

    @Override
    public void print() {
        System.out.println("ChildClass2 - ParentField: " + getParentField() + ", Child2Field: " + getChild2Field());
    }
}
