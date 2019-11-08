public class RectInfo {
    
    private float height;
    private float width;
    
    public RectInfo(float height, float width ) {
        this.height = height;
        this.width = width;
    }
    
    public double calculateArea() {
        return (this.height * this.width);
    }
    
    public double calculatePerimeter() {
        return (this.height * 2) + (this.width * 2);
    }
}
