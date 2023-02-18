import java.awt.*;
import java.util.Random;

public class Ball extends Rectangle {
    int xVelocity;
    int yVelocity;
    int initialSpeed=5;
    Random random;
    Ball(int x,int y,int width,int height)
    {
        super(x,y,width,height);
        random=new Random();
        int RandowXDirection=random.nextInt(2);
        if(RandowXDirection==0)
        {
            RandowXDirection--;
        }
        setXDirection(RandowXDirection);
        int RandomYDirection=random.nextInt(2);
        if(RandomYDirection==0)
        {
            RandomYDirection--;
        }
        setYDirection(RandomYDirection);
    }

    public  void setXDirection(int randowXDirection) {
        xVelocity=randowXDirection;
    }
    public void setYDirection(int randowYDirection) {
        yVelocity=randowYDirection;
    }
    public void move()
    {
        x+=xVelocity;
        y+=yVelocity;
    }
    public void draw(Graphics g)
    {
        g.setColor(Color.white);
        g.fillOval(x,y,width,height);

        g.drawLine(1000/2,0,1000/2,555);
    }
}