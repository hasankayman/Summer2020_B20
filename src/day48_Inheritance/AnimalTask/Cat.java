package day48_Inheritance.AnimalTask;

public class Cat extends Animal {

    public void meow(){
        System.out.println(name + " is meowing");
    }
    public Cat(String name, String size, int age, char gender) {
        setInfo(name, size, age, gender);
    }

}
