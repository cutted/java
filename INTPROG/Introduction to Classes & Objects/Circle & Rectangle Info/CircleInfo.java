import java.lang.Math.*;
import java.text.DecimalFormat;

public class CircleInfo {
    
    private float radius;
    private String info;
    private DecimalFormat format = new DecimalFormat("#.###");
    
    public CircleInfo(float radius ){
        this.radius = radius;
        this.info = "Area: " + format.format(calculateArea()) + ", Circumference: " + format.format(calculateCircumference()); 
    }
    
    public double calculateArea() {
        return Math.pow((this.radius * Math.PI) , 2);
    }
    
    public double calculateCircumference() {
        return this.radius * Math.PI * 2;
    }
    
    public String circleInfo() {
        return this.info;
    }
}
