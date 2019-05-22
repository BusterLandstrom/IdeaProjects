import javax.swing.JOptionPane;

public class Uppgift6 {
    public static void main(String[] args){
        int party = 7;
        int sovmorgon = 1;
        int måndag = 1;
        int tisdag = 2;
        int onsdag = 3;
        int torsdag = 4;
        int söndag = 7;
        String[] veckodag = {"Måndag","Tisdag","Onsdag","Torsdag","Fredag","Lördag","Söndag"};
        Object dag = JOptionPane.showInputDialog(null, "Vad är det för veckodag?","Veckodag",JOptionPane.QUESTION_MESSAGE,null,veckodag,veckodag[0]);

        if(dag.equals("Lördag")){
            for(int i = 0; i < sovmorgon; i++){
                System.out.println("sovmorgon");
            }
        } if(dag.equals("Fredag")){
            for(int i = 0; i < party; i++){
                System.out.println("party");
            }
        } if(dag.equals("Måndag")){
            for(int i = 0; i < måndag; i++){
                System.out.println("plugga");
            }
        } if(dag.equals("Tisdag")){
            for(int i = 0; i < tisdag; i++){
                System.out.println("plugga");
            }
        } if(dag.equals("Onsdag")){
            for(int i = 0; i < onsdag; i++){
                System.out.println("plugga");
            }
        } if(dag.equals("Torsdag")){
            for(int i = 0; i < torsdag; i++){
                System.out.println("plugga");
            }
        } if(dag.equals("Söndag")){
            for(int i = 0; i < söndag; i++){
                System.out.println("plugga");
            }
        }

    }
}
