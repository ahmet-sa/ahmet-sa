
import java.util.Scanner;


public class NewMain {

  
    public static void main(String[] args) {
       int quiz,vize,finall ;
       double ort;
       Scanner input=new Scanner(System.in);
        System.out.println("quiz notunu gir");
        quiz=input.nextInt();
        
        System.out.println("vize notunu gir");
        vize=input.nextInt();
        
        System.out.println("final notunu gir");
        finall=input.nextInt();
        
        ort=(quiz*0.30+(vize*0.3)+(finall*0.4));
        System.out.println("ortalamanız="+ort );
        String sonuc=(ort>=60) ? "gectiniz":"kaldınız";
        System.out.println(sonuc);
        
        
        
    }
    
}
