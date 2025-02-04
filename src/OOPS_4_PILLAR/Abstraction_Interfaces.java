package OOPS_4_PILLAR;

public class Abstraction_Interfaces {
    interface Animal{
        public void walks();
    }
    public static class Horse implements Animal{
        public void walks(){
            System.out.println("Walks on 4 legs");
        }
    }
    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.walks();
    }
}
