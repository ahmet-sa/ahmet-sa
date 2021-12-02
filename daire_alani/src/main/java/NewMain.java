
import java.util.Scanner;


public class NewMain {

    public static void main(String[] args) {
        int r;
        double alan,hacim,pi=3.14;
        Scanner input= new Scanner(System.in);
        System.out.println("daire yarı çapı giriniz");
        r=input.nextInt();
        alan=pi*r*r;
        hacim=(4*pi*r*r*r)/3;
        System.out.println("alan= "+alan);
        System.out.println("hacim= "+hacim);
                
        
    }
    
}
