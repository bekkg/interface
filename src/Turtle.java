public class Turtle extends  Animal {
    public Turtle(int age) {
        super(age);
    }

    @Override
    public void swim() {
        System.out.println( " Turtle is swimming .");
    }
}
