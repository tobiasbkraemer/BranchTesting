public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound();

        Cat cat = new Cat();
        cat.makeSound();

        cat.eat("fish");
        dog.eat("dogfood");

    }
}
