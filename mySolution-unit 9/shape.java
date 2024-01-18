
/**
 * 在这里给出对类 test 的描述。
 * 
 * @作者（你的名字）
 * @版本（一个版本号或者一个日期）
 */
import java.util.ArrayList;
public class shape
{
    private String color;
    private boolean filled;
    public shape(String col, boolean fil){
        color=col;
        filled=fil;
    }
    
    public void calculateArea(){
        
    }
    
    public void calculatePerimeter(){
        
    }
    
    public void displayInfo(){
        if (!filled) System.out.println("The shape is "+color+", unfilled.");
        else System.out.println("The shape is "+color+", filled.");
    }
    
    public String getColor(){
        return color;
    }
    
    public boolean getFilled(){
        return filled;
    }
    
    public void changeColor(String newColor){
        color=newColor;
    }
    
    public void changeFill(boolean renewFilled){
        filled=renewFilled;
    }
}
