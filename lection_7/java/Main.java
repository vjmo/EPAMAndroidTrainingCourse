public class Main {
    public static void main(String[] args) throws InterruptedException {

        SideThread sideThreadOne = new SideThread("First");
        sideThreadOne.start();

        SideThread.sleep(5000);

        SideThread sideThreadTwo = new SideThread("Second");
        sideThreadTwo.start();
        sideThreadTwo.join();

        System.out.println("I'm ready");


    }
}
