import java.io.*;
import javax.swing.*;

public class Notepad2 {
    public static void main(String[] args){

        JFileChooser fc = new JFileChooser();
        int result = fc.showOpenDialog(null);
        String filename;

        if(result == JFileChooser.APPROVE_OPTION){
            filename = fc.getSelectedFile().getAbsolutePath();
        } else {
            filename = "example1.txt";
        }
        FileReader fr = null;
        try {
            fr = new FileReader(filename);
        } catch(FileNotFoundException e){
            e.printStackTrace();
        }
        BufferedReader inFile = new BufferedReader(fr);

        String filename2 = filename + "Copy";
        FileWriter fwr = null;
        try {
            fwr = new FileWriter(filename2);
        } catch (IOException e) {
            e.printStackTrace();
        }
        BufferedWriter bwr = new BufferedWriter(fwr);
        PrintWriter outFile = new PrintWriter(bwr);


        String line;
        try {
            while ((line = inFile.readLine()) != null) {
                outFile.println(line);
            }
            inFile.close();
            outFile.flush();
            outFile.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
