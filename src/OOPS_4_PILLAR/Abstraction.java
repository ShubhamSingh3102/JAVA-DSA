package OOPS_4_PILLAR;
public class Abstraction {
    abstract static class Animal{ // ek khayal(concept) h jisko saach nhi krna h....faltu cheez h and isko user ko nhi dikhana h
        abstract void walk();
        public void eat(){ //not pure abstraction...
            System.out.println("Animal eats");
        }
        public Animal(){ // constructor can also be used in abstraction...
            System.out.println("Animal constructor");
        }
    }
    public static class Horse extends Animal{
        public void walk(){

            System.out.println("Walks on 4 legs");
        }
    }
    public static class Chicken extends Animal{
        public void walk(){

            System.out.println("Walks on 2 legs");
        }
    }
    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.walk();
        Chicken chicken = new Chicken();
        chicken.walk();
        horse.eat();
    }
}
