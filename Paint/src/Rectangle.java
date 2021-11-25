import java.awt.*;

public class Rectangle extends Figure{
    protected int height;
    protected int width;

    public void setBoundingBox(int heightBB,int widthBB){
        this.height=heightBB;
        this.width=widthBB;
    }


    public Rectangle(int px,int py, Color c){
        super(new Point(px,py),c);
        this.height=0;
        this.width=0;
    }

    @Override
    public void draw(Graphics g){
        g.setColor(getColor());
        g.fillRect(getX(),getY(),width,height);
    }
}
