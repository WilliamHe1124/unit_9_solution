
/**
 * 在这里给出对类 house 的描述。
 * 
 * @作者（你的名字）
 * @版本（一个版本号或者一个日期）
 */
public class house extends triangle
{
    private double side;
    public house(String houseColor, boolean houseFilled, double houseSide){
        super(houseColor, houseFilled, houseSide, houseSide, houseSide);
        side=houseSide;
    }
    
    public void calculateArea(){
        double height=Math.sqrt(side*side-(side/2)*(side/2));
        double area=side*side+side*height*0.5;
        System.out.println("The area of the house is "+area+".");
    }
    
    public void calculatePerimeter(){
        double perimeter=side*5;
        System.out.println("The perimeter of the house is "+perimeter+".");
    }
    
    public void changeSide(double newSide){
        side=newSide;
    }
    
    public double getSide(){
        return side;
    }
}
