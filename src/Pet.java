public abstract class Pet {
    private int age;
    private Color color;
    private Shelter shelter;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Shelter getShelter() {
        return shelter;
    }

    public void setShelter(Shelter shelter) {
        this.shelter = shelter;
    }
    private int generateDefaultAge(){
        age = 10;
        return age;
    }
    public String getInfo(){
        return "age: " + age +" color: " + Color.BLACK + " shelter: " + shelter.getName();
    }

}
