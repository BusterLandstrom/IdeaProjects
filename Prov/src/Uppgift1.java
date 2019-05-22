import javax.swing.JOptionPane;

public class Uppgift1 {
    public static void main(String[] args){
        String name;
        name = JOptionPane.showInputDialog(null,"Vad heter du?","NAMN",JOptionPane.QUESTION_MESSAGE);
        name = name.toUpperCase();
        JOptionPane.showMessageDialog(null,"Lycka till " + name + "!","Lycka till!",JOptionPane.PLAIN_MESSAGE);
    }
}
