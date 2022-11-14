public class Cat extends Animal {

    @Override
    public void makeSound() {
        System.out.println("Miav");
    }

    @Override
    public boolean eat(String foodType) {
        return true;
    }

    @Override
    public void showMood(boolean mood) {
        if (mood==true)
            System.out.println("spinder");
        else System.out.println("hvæser");
    }
}
