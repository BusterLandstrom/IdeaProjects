public class Uppgift4 {
    public static void main(String[] args){
        int veckor = 0;
        int två = 2;
        int kvalster = 1;
        boolean slut = false;
        while(slut == false) {
            if (kvalster <= 100000) {
                System.out.println("nr kvalster under " + veckor + " veckor är " + kvalster + "st");
                kvalster = kvalster * två;
                veckor++;
            } else {
                System.out.println("totalet veckor är " + veckor + " för över 100000 st kvalster");
                slut = true;
            }
        }
    }
}
