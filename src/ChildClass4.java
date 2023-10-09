public class ChildClass4 extends ParentClass implements Printable{
    private boolean child4Field;

    public ChildClass4(int parentField, boolean child4Field) {
        super(parentField);
        this.child4Field = child4Field;
    }

    public boolean isChild4Field() {
        return child4Field;
    }

    @Override
    public void print() {
        System.out.println("ChildClass4 - ParentField: " + getParentField() + ", Child4Field: " + isChild4Field());
    }
}
