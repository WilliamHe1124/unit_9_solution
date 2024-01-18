
/**
 * 在这里给出对类 triangle 的描述。
 * 
 * @作者（你的名字）
 * @版本（一个版本号或者一个日期）
 */
public class triangle extends shape
{
    private double side1;
    private double side2;
    private double side3;
    public triangle(String trigColor, boolean trigFilled, double s1, double s2, double s3){
        super(trigColor, trigFilled);
        side1=s1;
        side2=s2;
        side3=s3;
    }
    
    public void calculatePerimeter(){
        double perimeter=side1+side2+side3;
        System.out.println("The perimeter of the triangle is "+perimeter+".");
    }
    
    public void calculateArea(){
        double p=side1+side2+side3;
        double area=(p-side1)*(p-side2)*(p-side3)*p;
        area=Math.sqrt(area);
        System.out.println("The area of the triangle is "+area+".");
    }
    
    public void changeSide1(double newSide){
        side1=newSide;
    }
    
    public void changeSide2(double newSide){
        side2=newSide;
    }
    
    public void changeSide3(double newSide){
        side3=newSide;
    }
    
    public double getSide1(){
        return side1;
    }
    
    public double getSide2(){
        return side2;
    }
    
    public double getSide3(){
        return side3;
    }
}
