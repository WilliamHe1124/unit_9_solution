
/**
 * 在这里给出对类 rectangle 的描述。
 * 
 * @作者（你的名字）
 * @版本（一个版本号或者一个日期）
 */
public class rectangle extends shape
{
    double length;
    double width;
    boolean ifSquare;
    public rectangle(String rectColor, boolean rectFilled, double rectLength, double rectWidth){
        super(rectColor, rectFilled);
        length=rectLength;
        width=rectWidth;
        ifSquare=false;
    }
    
    public void calculateArea(){
        double area=length*width;
        if (!ifSquare) System.out.println("The area of the rectangle is "+area+".");
        else if (ifSquare) System.out.println("The area of the square is "+area+".");
    }
    
    public void calculatePerimeter(){
        double perimeter=length*2+width*2;
        if (!ifSquare) System.out.println("The perimeter of the rectangle is "+perimeter+".");
        else if (ifSquare) System.out.println("The perimeter of the square is "+perimeter+".");
    }
    
    public void changeLength(double newLength){
        length=newLength;
    }
    
    public void changeWidth(double newWidth){
        width=newWidth;
    }
    
    public double getLength(){
        return length;
    }
    
    public double getWidth(){
        return width;
    }
}
