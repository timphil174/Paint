import java.awt.*;

public class Square extends Rectangle{
    @Override
    public void setBoundingBox(int heightBB, int widthBB) {

        super.setBoundingBox(heightBB, heightBB);
    }

    public Square(int px, int py, Color c){

        super(px,py,c);
    }
}
