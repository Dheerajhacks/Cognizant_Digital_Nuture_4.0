package Code;
public class Test {
    public static void main(String[] args) {
        Computer computer = new Computer.Builder()
                .setCpu("Intel i7")
                .setRam(16)
                .setStorage(512)
                .setOs("Windows 10")
                .build();

        System.out.println("\nBuilder Pattern Example\n");
        System.out.println("Computer Specifications:");
        System.out.println("CPU: " + computer.cpu);
        System.out.println("RAM: " + computer.ram + " GB");
        System.out.println("Storage: " + computer.storage + " GB");
        System.out.println("OS: " + computer.os);
        System.out.println();
    }
}
