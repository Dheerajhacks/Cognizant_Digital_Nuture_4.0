public class Test {
    public static void main(String[] args) {
        System.out.println("\nProxy Design Principle\n");

        ProxyImage img1 = new ProxyImage("image1.jpg");
        ProxyImage img2 = new ProxyImage("image2.jpg");
        ProxyImage img3 = new ProxyImage("image1.jpg");

        img1.display();
        img2.display();
        img3.display();
    }
}
