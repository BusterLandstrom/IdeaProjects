import javax.swing.*;
import java.awt.*;

public class Grafik extends Canvas {

    public Grafik() {
        setSize(800,600);
        JFrame frame = new JFrame("Grafik");
        frame.add(this);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public void paint(Graphics g){
        paintHouse(300,300,200,200,g);
    }

    public static void main(String[] args) {
        Grafik minGrafik = new Grafik();
    }

    private void paintHouse(int x, int y,int w, int h, Graphics g){
        paintBox(x,y,w,h,g);
        paintPolygon(x,y,g);
        paintDoor(x,y,w,h,g);
    }

    private void paintPolygon(int x, int y, Graphics g){
        g.setColor(new Color(0x000ff550f));
        int[] xcord = {x-1,x+100,x+200};
        int[] ycord = {y,y-100,y};
        g.fillPolygon(xcord,ycord, 3);
    }

    private void paintDoor(int x, int y, int w, int h, Graphics g){
        g.setColor(new Color(0x00FFFF555));
        int xrel = x+50;
        int yrel = y+66;
        int wrel = w-(w/2);
        int hrel = h-(h/3);
        g.fillRect(xrel,yrel,wrel,hrel);
    }

    private void paintBox(int x, int y, int w, int h, Graphics g){
        g.setColor(new Color(0x55FF00FF));
        g.fillRect(x,y,w,h);
    }

    private void paintOval(int x, int y,int w,int h, Graphics g){
        g.setColor(new Color(0x00FFFF));
        g.fillOval(x,y,w,h);
    }

}
