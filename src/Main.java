public class Main {
    public static void main(String[] args) {
        Shark shark1 = new Shark(1);
        Shark shark2 = new Shark(2);
        Shark shark3 = new Shark(3);
        Shark shark4 = new Shark(4);
        Shark shark5 = new Shark(5);
        Shark [] sharks = {shark1, shark2, shark3,shark4, shark5};

        Duck duck1 = new Duck(6);
        Duck duck2 = new Duck(7);
        Duck duck3 = new Duck(8);
        Duck duck4 = new Duck(9);
        Duck duck5 = new Duck(10);
        Duck [] ducks ={duck1, duck2, duck3, duck4, duck5};

        Turtle turtle1 = new Turtle(11);
        Turtle turtle2 = new Turtle(12);
        Turtle turtle3 = new Turtle(13);
        Turtle turtle4 = new Turtle(14);
        Turtle turtle5 = new Turtle(15);
        Turtle [] turtles = {turtle1, turtle2 , turtle3 , turtle4, turtle5};




        Animal [] okeanarums = {shark1, shark2, shark3, shark4,shark5,
                                    duck1, duck2, duck3, duck4,duck5,
                                        turtle1, turtle2, turtle3,turtle4,turtle5} ;
        for (int i = 0; i <okeanarums.length ; i++) {
            okeanarums[i].swim();
        }

}       }