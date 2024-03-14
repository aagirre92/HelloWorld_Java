package interfaces;

public class Fish implements Prey, Predator { //fish can be prey or predator
    @Override
    public void hunt() {
        System.out.println("*Fish is hunting...*");
    }

    @Override
    public void flee() {
        System.out.println("*Fish is running away....*");
    }
}
