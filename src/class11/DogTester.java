package class11;
public class DogTester {

    public static void main(String[] args) {
        Dog obj1=new Dog();

        String name=obj1.age="33";
        obj1.sleep();
        obj1.name="one";
        Dog.legsofdog=4;
        System.out.println(Dog.legsofdog);
        obj1.color="red";
        System.out.println(obj1.color);
        Dog obj2=new Dog();
        obj2.color="white";
        System.out.println(obj2.color);
        System.out.println(Dog.legsofdog);
        System.out.println(obj2.legsofdog);

        obj1.sebastion("one");

    }
}
