public class RealImage implements Image{
    private String imgName;
    
    public RealImage(String imgName) {
        this.imgName = imgName;
    }

    public void display() {
        System.out.println("Displaying image: " + imgName + "\n");
    }
}
