import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Window extends JFrame implements ActionListener {
    protected Drawing dessin = new Drawing();
    public Window(String Title,int x, int y){
        super(Title);
        this.setSize(x,y);
        //this.setDefaultLookAndFeelDecorated(true);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        Container contentPane1 = this.getContentPane();

        JMenuBar m = new JMenuBar();

        JMenu file = new JMenu("File");

        JMenuItem open = new JMenuItem("Open");
        JMenuItem New = new JMenuItem("New");
        JMenuItem Save = new JMenuItem("Save");
        JMenuItem Quit = new JMenuItem("Quit");

        file.add(New);
        file.add(open);
        file.add(Save);
        Save.setAccelerator(KeyStroke.getKeyStroke('S', Toolkit.getDefaultToolkit().getMenuShortcutKeyMaskEx(), false));
        file.addSeparator();
        file.add(Quit);
        m.add(file);

        JMenu apropos = new JMenu("A propos");
        JMenuItem Info = new JMenuItem("Info");
        apropos.add(Info);
        m.add(apropos);
        setJMenuBar(m);



        JPanel South = new JPanel();

        JButton rectangleButton= new JButton("Rectangle");
        JButton ellipseButton= new JButton("Ellipse");
        JButton circleButton= new JButton("Circle");
        JButton squareButton= new JButton("Square");

        JButton blackButton= new JButton("black");
        JButton redButton= new JButton("red");
        JButton blueButton= new JButton("blue");
        JButton greenButton= new JButton("green");
        JButton yellowButton= new JButton("yellow");
        JButton magentaButton = new JButton("magenta");
        JButton orangeButton = new JButton("orange");
        JButton roseButton = new JButton("pink");

        blackButton.setBackground(Color.BLACK);
        blackButton.setForeground(Color.white);
        redButton.setBackground(Color.red);
        blueButton.setBackground(Color.blue);
        greenButton.setBackground(Color.green);
        yellowButton.setBackground(Color.yellow);
        magentaButton.setBackground(Color.magenta);
        orangeButton.setBackground(Color.orange);
        roseButton.setBackground(Color.pink);

        JPanel westPanel = new JPanel();
        westPanel.setLayout(new GridLayout(2,4));
        westPanel.add(blackButton);
        westPanel.add(redButton);
        westPanel.add(greenButton);
        westPanel.add(blueButton);
        westPanel.add(yellowButton);
        westPanel.add(roseButton);
        westPanel.add(magentaButton);
        westPanel.add(orangeButton);

        JPanel eastPanel = new JPanel();
        eastPanel.setLayout(new GridLayout(2,2));
        eastPanel.add(rectangleButton);
        eastPanel.add(ellipseButton);
        eastPanel.add(squareButton);
        eastPanel.add(circleButton);


        New.addActionListener(this);
        open.addActionListener(this);
        Save.addActionListener(this);
        Quit.addActionListener(this);
        Info.addActionListener(this);
        rectangleButton.addActionListener(this);
        ellipseButton.addActionListener(this);
        squareButton.addActionListener(this);
        circleButton.addActionListener(this);
        blackButton.addActionListener(this);
        redButton.addActionListener(this);
        greenButton.addActionListener(this);
        blueButton.addActionListener(this);
        magentaButton.addActionListener(this);
        roseButton.addActionListener(this);
        orangeButton.addActionListener(this);
        yellowButton.addActionListener(this);


        contentPane1.add(South, "South");
        South.add(westPanel);
        South.add(eastPanel);
        contentPane1.add(dessin,"Center");


        this.setVisible(true);

    }

    public void actionPerformed(ActionEvent e)
    {
        String cmd=e.getActionCommand();
        switch (cmd)
        {
            //couleurs
            case "black" :
                dessin.setColor(Color.BLACK);
                System.out.println("black");
                break;
            case "red" :
                dessin.setColor(Color.red);
                System.out.println(cmd);
                break;
            case "green" :
                dessin.setColor(Color.green);
                System.out.println(cmd);
                break;
            case "yellow" :
                dessin.setColor(Color.yellow);
                System.out.println(cmd);
                break;
            case "blue" :
                dessin.setColor(Color.blue);
                System.out.println(cmd);
                break;
            case "magenta" :
                dessin.setColor(Color.magenta);
                System.out.println(cmd);
                break;
            case "orange" :
                dessin.setColor(Color.orange);
                System.out.println(cmd);
                break;
            case "pink" :
                dessin.setColor(Color.pink);
                System.out.println(cmd);
                break;
            //Au tour du Menu
            case "Quit" :
                System.exit(0);
                break;
            case "Info" :
                JOptionPane info = new JOptionPane();
                info.showInternalMessageDialog( info, "Welcome to the PHILIPPE Timothée PaintProject",
                        "information",JOptionPane.INFORMATION_MESSAGE);
                break;
            case "Save" :
                JOptionPane info2 = new JOptionPane();
                info2.showInternalMessageDialog( info2, "I couldn't make this button work properly, but hey at least the shortcut is working",
                        "Unfortunately",JOptionPane.INFORMATION_MESSAGE);
                break;
            case "New" :
                dessin.New();
                break;
            case "Open" :
                JOptionPane info3 = new JOptionPane();
                info3.showInternalMessageDialog( info3, "I couldn't make this button work properly",
                        "Sadly",JOptionPane.INFORMATION_MESSAGE);
                break;
            //on finit par les formes
            case "Circle" :
            case "Ellipse" :
            case "Square" :
            case "Rectangle" :
                dessin.setNomFigure(cmd);
                System.out.println(cmd);
                break;


        }
    }

}
