import java.util.*;

public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> scores = new ArrayList();
        int score;
        do {
            System.out.println("input next score(-1 to quit): ");
            score = in.nextInt();
            if (score != -1) {
                int index = in.nextInt();

                for(int i = 0; i< scores.size(); i++){

                }
                scores.add(index, score);

                }
        } while (score != -1);
            for (int i = 0; i < scores.size() ; i++){
                System.out.println(scores.get(i));
        }
    }
}
