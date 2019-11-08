public class Main {

    public static void main(String[] args) {
        System.out.println("#-----Circle Info Class-----#");
        CircleInfo ci = new CircleInfo(5);
        System.out.println(ci.calculateArea());
        System.out.println(ci.calculateCircumference());
        System.out.println(ci.circleInfo());
        
        System.out.println("#-----Rectangle Info Class-----#");
        RectInfo ri = new RectInfo(10, 25);
        System.out.println(ri.calculateArea());
        System.out.println(ri.calculatePerimeter());
        
    }  
}
