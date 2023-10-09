public class Main {
    public static void main(String[] args) {
        Shelter shelter = new Shelter("AM5", "Morozova");
        Shelter shelter2 = new Shelter("AM6", "Kuzova");
        Shelter shelter3 = new Shelter("AM7", "Alamana");
    Dog dog = new Dog("Vasya", "Labrador", "StandUp", null);
    Dog dog2 = new Dog("Vasya", "Labrador", Color.BROWN, shelter2);
    Dog dog3 = new Dog("Vasya", "Labrador", Color.BLACK, shelter2, "RunOver");

    Dog[] dogs = {dog, dog2, dog3,};
    Shelter[] shelters = {shelter, shelter2, shelter3};

        for (int i = 0; i < dogs.length; i++) {
            System.out.println(dogs[i].getInfo() + shelters[i].getInfoShelter());
        }




//    HomeWork
        ComplexType complexObject = new ComplexType(42);
        EnumType enumObject = EnumType.OPTION1;

        SecondLevel objectA = new SecondLevel(1, complexObject, enumObject, 2);
        ThirdLevel objectB = new ThirdLevel(3, complexObject, enumObject, 4, 5);
        ThirdLevel objectC = new ThirdLevel(6, complexObject, enumObject, 7, 8);

        System.out.println("Свойства объекта objectA:");
        System.out.println("First Field: " + objectA.getFirstField());
        System.out.println("Complex Field Value: " + objectA.getComplexField().getValue());
        System.out.println("Enum Field: " + objectA.getEnumField());
        System.out.println("Second Field: " + objectA.getSecondField());

        System.out.println("\nСвойства объекта objectB:");
        System.out.println("First Field: " + objectB.getFirstField());
        System.out.println("Complex Field Value: " + objectB.getComplexField().getValue());
        System.out.println("Enum Field: " + objectB.getEnumField());
        System.out.println("Second Field: " + objectB.getSecondField());
        System.out.println("Third Field: " + objectB.getThirdField());

        System.out.println("\nСвойства объекта objectC:");
        System.out.println("First Field: " + objectC.getFirstField());
        System.out.println("Complex Field Value: " + objectC.getComplexField().getValue());
        System.out.println("Enum Field: " + objectC.getEnumField());
        System.out.println("Second Field: " + objectC.getSecondField());
        System.out.println("Third Field: " + objectC.getThirdField());

        System.out.println("\nВызов методов объекта objectA:");
        objectA.methodA();
        objectA.methodB();

        System.out.println("\nВызов методов объекта objectB:");
        objectB.methodA();
        objectB.methodB();

        System.out.println("\nВызов методов объекта objectC:");
        objectC.methodA();
        objectC.methodB();




        Printable object2 = createObject("2й");
        Printable object3 = createObject("3й");
        Printable object4 = createObject("4й");

        object2.print();
        object3.print();
        object4.print();

    }
    public static Printable createObject(String className) {
        switch (className) {
            case "2й":
                return new ChildClass2(10, "Child2Value");
            case "3й":
                return new ChildClass3(20, 3.14);
            case "4й":
                return new ChildClass4(30, true);
            default:
                throw new IllegalArgumentException("Неверное имя класса: " + className);
        }
    }
}