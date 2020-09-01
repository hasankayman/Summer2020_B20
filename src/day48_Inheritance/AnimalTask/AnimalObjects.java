package day48_Inheritance.AnimalTask;

public class AnimalObjects {

    public static void main(String[] args) {
        Dog dog1 = new Dog("Winston", "Medium", 3, 'M', "bulldog");
        System.out.println(dog1.name);
        System.out.println(dog1.size);
        dog1.bark();
        dog1.sleep();
        dog1.eat();
        System.out.println(dog1.age);
        System.out.println(dog1.gender);
        System.out.println(dog1);
        System.out.println("=================================================");

        Cat cat1 = new Cat("Seker", "Medium", 1, 'M',"shorhair");
        System.out.println(cat1.name);
        System.out.println(cat1.age);
        cat1.meow();
        cat1.sleep();
        cat1.eat();
        System.out.println(cat1);

    }
}
