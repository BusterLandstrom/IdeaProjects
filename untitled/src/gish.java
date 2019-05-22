import java.util.Scanner;

public class gish{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        float x = 0;
        int yuh;
        System.out.println("Vad är det för övre grads gränsen?");
        float g = in.nextFloat();
        System.out.println("Vad är det för periodsnummer? (OBS! Använd endast komman inte punkter!)");
        float f = in.nextFloat();
        float tot = g/f;
        for(int i = 0; i < 2 ; i++){
            if(tot > g){
                x -= 1;
                System.out.println(x);
                break;
            } else {
                x = (f*2);
                yuh = (intMath.floor(x);
                System.out.println(yuh);
                break;
            }
        }
    }
}