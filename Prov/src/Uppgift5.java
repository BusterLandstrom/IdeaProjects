import javax.swing.*;

public class Uppgift5 {
    public static void main(String[] args){
        int inmatat;
        inmatat = Integer.parseInt(JOptionPane.showInputDialog(null,"What is your age?","AGE",JOptionPane.QUESTION_MESSAGE));

        if (inmatat < 10){
            JOptionPane.showMessageDialog(null,"du är liten");
        } else if(inmatat > 65){
            JOptionPane.showMessageDialog(null,"du är gammal");
        } else {
            JOptionPane.showMessageDialog(null,"du är lagom");
        }
    }
}
