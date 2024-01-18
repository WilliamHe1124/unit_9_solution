
/**
 * 在这里给出对类 circle 的描述。
 * 
 * @作者（你的名字）
 * @版本（一个版本号或者一个日期）
 */
public class circle extends shape
{
    private double radius;
    public circle(String circleColor, boolean circleFilled, double rad){
        super(circleColor, circleFilled);
        radius=rad;
    }
    
    public void calculateArea(){
        double area=radius*radius*Math.PI;
        System.out.println("The area of the circle is "+area+".");
    }
    
    public void calculatePerimeter(){
        double perimeter=radius*2*Math.PI;
        System.out.println("The perimeter of the circle is "+perimeter+".");
    }
    
    public void changeRadius(double newRadius){
        radius=newRadius;
    }
    
    public double getRadius(){
        return radius;
    }
}
