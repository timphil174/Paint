import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.io.ObjectInputStream;
import java.io.FileInputStream;

public class Drawing extends JPanel implements MouseMotionListener, MouseListener {
    ArrayList<Figure> list ;
    protected Color couleur;
    protected String NomFigure;
    public int x,y;


    public Drawing(){
        super();
        this.couleur=Color.BLACK;
        this.list=new ArrayList<Figure>();
        this.NomFigure="Rectangle";
        this.addMouseListener(this);
        this.addMouseMotionListener(this);
    }

    public void setColor(Color c){
        this.couleur=c;
    }

    public void setNomFigure(String s){
        this.NomFigure=s;
    }


    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        x=e.getX();
        y=e.getY();
        switch(NomFigure){
            case "Rectangle" :
                list.add(new Rectangle(x,y,couleur));
                break;
            case "Ellipse" :
                list.add(new Ellipse(x,y,couleur));
                break;
            case "Square" :
                list.add(new Square(x,y,couleur));
                break;
            case "Circle" :
                list.add(new Circle(x,y,couleur));
                break;
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mouseDragged(MouseEvent e) {
        int width=e.getX()-this.x;
        int height=e.getY()-this.y;
        list.get(list.size()-1).setBoundingBox(height,width);
        repaint();
    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Figure f : list) {
            f.draw(g);
        }
    }
    /*public void save() {
        try {
            FileOutputStream fos = new FileOutputStream("sauve dessin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeInt(list.size());
            for (Figure f : list) {
                oos.writeObject(f);
            }
            oos.close();
        } catch (Exception e) {
            System.out.println("Problemos");
        }
    }*/

    public void New(){
        this.list=new ArrayList<>();
        this.repaint();
    }


}
