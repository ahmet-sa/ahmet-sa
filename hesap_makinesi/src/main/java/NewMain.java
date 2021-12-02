
import java.util.Scanner;


public class NewMain {

    
    public static void main(String[] args) {
       double sayi1,sayi2;
       int tercih;
       Scanner input=new Scanner(System.in);
        System.out.println(" 1. sayıyı giriniz");
        sayi1=input.nextDouble();
        System.out.println(" 2. sayıyı giriniz");
        sayi2=input.nextDouble();  
        System.out.println("hangi işlem yapmak istersiniz");
        System.out.println("1-toplama\n2-cıkarma\n3-çarpma\n4-bölme\n seçiniz");
        tercih=input.nextInt();
       if(tercih ==1){
       System.out.println("toplam="+(sayi1+sayi2));
       }
       else if(tercih ==2){
       System.out.println("fark="+(sayi1-sayi2));
       }
       else if(tercih ==3){
       System.out.println("carpım="+(sayi1*sayi2));
       }
       else if(tercih ==4){
       System.out.println("bölüm="+(sayi1/sayi2));
       }
       

}
   } 
}
