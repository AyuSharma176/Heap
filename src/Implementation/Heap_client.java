package Implementation;

public class Heap_client {
    public static void main(String[] args) {
        Heap hp = new Heap();
        hp.add(10);
        hp.add(20);
        hp.add(30);
        hp.add(5);
        hp.add(7);
        hp.add(3);
        hp.add(2);
        hp.add(-10);
        hp.add(-20);
        hp.Display();
        System.out.println(hp.remove());
        hp.Display();
        System.out.println(hp.minimum());
    }
}
