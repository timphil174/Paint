import java.awt.*;

public abstract class Figure {
        protected java.awt.Color Color;
        private Color c;
        private Point a;

        public Figure(Point a, Color c){
                this.a =a;
                this.c=c;
        }
        public abstract void setBoundingBox(int heightBB, int widthBB);

        public abstract void draw(Graphics g);

        public Color getColor(){
                return c;
        }

        @Override
        public String toString(){
                return "le point d'origine est :  ("+a.getX()+", "+a.getY()+" ) ******* la couleur est :  "+c;
        }

        public int getX(){
                return a.getX();
        }
        public int getY(){
                return a.getY();
        }






}
