
/**
 * 在这里给出对类 pentagon 的描述。
 * 
 * @作者（你的名字）
 * @版本（一个版本号或者一个日期）
 */
public class pentagon extends shape
{
    private double side;
    public pentagon(String pentColor, boolean pentFilled, double sideLength){
        super(pentColor, pentFilled);
        side=sideLength;
    }
    
    public void calculatePerimeter(){
        double perimeter=side*5;
        System.out.println("The perimeter of the pentagon is "+perimeter+".");
    }
    
    public void calculateArea(){
        double area=Math.sqrt(5);
        area*=2;
        area+=5;
        area*=5;
        area=Math.sqrt(area);
        area=area/4;
        area=area*side*side;
        System.out.println("The area of the pentagon is "+area+".");
    }
    
    public void changeSide(double newSide){
        side=newSide;
    }
    
    public double getSide(){
        return side;
    }
}
