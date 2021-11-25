import java.awt.*;

public class Ellipse extends Figure{
    protected int semiAxisX;
    protected int semiAxisY;

    public Ellipse(int px,int py, Color c){
        super(new Point(px,py),c);
        this.semiAxisY=0;
        this.semiAxisX=0;
    }

    public void setBoundingBox(int heightBB,int widthBB) {
        this.semiAxisX = widthBB;
        this.semiAxisY = heightBB;
    }

    public int getSemiAxisX(){
        return semiAxisX;
    }

    public int getSemiAxisY(){
        return semiAxisY;
    }

    public void draw(Graphics g){
        g.setColor(this.Color);
        g.fillOval(getX(),getY(),getSemiAxisX(),getSemiAxisY());
    }

}
