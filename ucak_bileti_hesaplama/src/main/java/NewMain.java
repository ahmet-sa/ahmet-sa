
import java.util.Scanner;


public class NewMain {

    public static void main(String[] args) {
     
        Scanner input =new Scanner(System.in);
        int km,yas,tip;
        System.out.println("Mesafayi giriniz");
        km=input.nextInt();
        System.out.println("yaş giriniz");
        yas=input.nextInt();
        System.out.println("yolculuk tipini seçiniz \n 1=tek yön \n 2.gidiş dönüş");
        tip=input.nextInt();
        double normal_fiyat,yas_indirimi = 0,tip_indirimi;
        if(km>0 && yas>0 && (tip==1 || tip==2)){
                normal_fiyat= km*0.1;
                if(yas<12)
                yas_indirimi=normal_fiyat*0.5;
                else if(yas>=12 && yas<=24) 
                yas_indirimi=normal_fiyat*0.1;
                  else if(yas>=65 ) 
                yas_indirimi=normal_fiyat*0.3; 
                normal_fiyat-=yas_indirimi;
                if(tip==2){
                tip_indirimi=normal_fiyat*0.2;
                normal_fiyat=(normal_fiyat-tip_indirimi)*2;
                }
                System.out.println("bilet tutarı= "+normal_fiyat);
                
        } else
            System.out.println("girdiler yalnış tekrar deneyiniz");
    }
    
}
