package OOPS_4_PILLAR;

public class Multiple_Inheritance_by_using_Interfaces {
    interface Animal{
        public void walks();
    }
    interface Herbivore{

    }
    public static class Horse implements Abstraction_Interfaces.Animal,Herbivore { // dono class ki property ek saath le li horse ne....called multiple_Inheritance...
        public void walks(){
            System.out.println("Walks on 4 legs");
        }
    }
    public static void main(String[] args) {
        Abstraction_Interfaces.Horse horse = new Abstraction_Interfaces.Horse();
        horse.walks();
    }
}
