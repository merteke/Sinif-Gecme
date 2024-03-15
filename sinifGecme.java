import java.util.*;


public class sinifGecme {

    public static void main(String[] args){

        Scanner input=new Scanner(System.in);
        
        double mat,fizik,turkce,kimya,muzik;
        int ders=0;

        double toplam=0;
        double ort;

        System.out.println("Matematik notunu giriniz");
        mat=input.nextDouble();
        System.out.println("Fizik notunu giriniz");
        fizik=input.nextDouble();
        System.out.println("Turkce notunu giriniz");
        turkce=input.nextDouble();
        System.out.println("Kimya notunu giriniz");
        kimya=input.nextDouble();
        System.out.println("Muzik notunu giriniz");
        muzik=input.nextDouble();

        if(mat<=100 && mat>=0){
            toplam+=mat;
            ders++;
        }
        if(fizik<=100 && fizik>=0){
            toplam+=fizik;
            ders++;
            
        }
        if(kimya<=100 && kimya>=0){
            toplam+=kimya;
            ders++;
            
        }
        if(turkce<=100 && turkce>=0){
            toplam+=turkce;
            ders++;
            
        }
        if(muzik<=100 && muzik>=0){
            toplam+=muzik;
            ders++;
            
        }

        ort=toplam/ders;

        System.out.println("Ogrencinin genel ortalamasi="+ort);

        if(ort>=55){
            System.out.println("Ogrenci sinifi basariyla gecti!");

        }
        else{
            System.out.println("Ogrenci sinifta kaldi!");
        }
    }

}
