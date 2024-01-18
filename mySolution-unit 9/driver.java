
/**
 * 在这里给出对类 driver 的描述。
 * 
 * @作者（你的名字）
 * @版本（一个版本号或者一个日期）
 */
public class driver
{
    public static void main(String[] args){
        shape[] shapes=new shape[6];
        circle myCir=new circle("red", true, 5.0);
        shapes[0]=myCir;
        rectangle myRect=new rectangle("blue", false, 2.0, 4.0);
        shapes[1]=myRect;
        triangle myTrig=new triangle("green", true, 3.0, 4.0, 5.0);
        shapes[2]=myTrig;
        pentagon myPent=new pentagon("black", false, 3.0);
        shapes[3]=myPent;
        house myHouse=new house("white", true, 8.0);
        shapes[4]=myHouse;
        square mySqu=new square("yellow", false, 2.0);
        shapes[5]=mySqu;
        for (shape myShape:shapes){
            myShape.displayInfo();
            myShape.calculateArea();
            myShape.calculatePerimeter();
        }
        
    }
}
