public abstract class  Animal implements  Swimable {

    private  int age ;

    public Animal(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "\nAnimal{" +
                "age=" + age +
                '}';
    }
}
