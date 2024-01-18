
/**
 * 在这里给出对类 square 的描述。
 * 
 * @作者（你的名字）
 * @版本（一个版本号或者一个日期）
 */
public class square extends rectangle
{
    public square(String squareColor, boolean squareFilled, double side){
        super(squareColor, squareFilled, side, side);
        ifSquare=true;
    }
    
    public void changeSide(double newSide){
        length=newSide;
        width=newSide;
    }
    
    public double getSide(){
        return length;
    }
}
