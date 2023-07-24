public class Duck extends Animal{
    public Duck(int age) {
        super(age);
    }

    @Override
    public void swim() {
        System.out.println(" Duck is swimming . ");
    }
}
