import javax.swing.*;
import java.text.DecimalFormat;

public class Uppgift2 {
    public static void main(String[] args){
        double nr1;
        double slutnr;

        nr1 = Double.parseDouble(JOptionPane.showInputDialog(null,"Number?","nr",JOptionPane.QUESTION_MESSAGE));


        slutnr = Math.sqrt(nr1);
        DecimalFormat numberFormat = new DecimalFormat("#.0000");

        JOptionPane.showMessageDialog(null,"This is the square root of " + nr1 + ": " + numberFormat.format(slutnr),"sqrt",JOptionPane.PLAIN_MESSAGE);


    }
}
