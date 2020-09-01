package day48_Inheritance.AnimalTask;

public class Dog extends Animal {
//           sub          super

    /*
    variables:4  --> name, age, size, gender
    methods:3
    */
    public void bark() {
        System.out.println(name + " is barking");
    }

    public Dog(String name, String size, int age, char gender, String breed) {
        setInfo(name, size, age, gender, breed);
    }
}
