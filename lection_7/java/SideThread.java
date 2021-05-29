public class SideThread extends Thread {

    String name;

    public SideThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i <= 1000; i++) {
            System.out.println("My name is " + name + " " + i);
        }
    }
}
