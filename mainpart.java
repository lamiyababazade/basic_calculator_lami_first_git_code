package basickalk;

import basickalk.kalkukyatordusturs;

import java.util.Scanner;
public class mainpart {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        kalkukyatordusturs k=new kalkukyatordusturs();
        menu m=new menu();
 int secim=99; //soruş

        do{
            switch (secim){
                case 99:
                    m.mennyutab();
                    System.out.println("riyazi emeliyyati secin=");
                    secim=sc.nextInt();
                    break;

                case 1:
                    k.toplama();
                    secim=99;
                    break;

                case 2:
                    k.çıxma();
                    secim=99;
                    break;
                case 3:
                    k.vurma();
                    secim=99;
                    break;
                case 4:
                    k.bolme();
                    secim=99;
                    break;
                default:
                    m.mennyutab();
                    System.out.println("wrong choice");
                    System.out.println("riyazi emeliyyati secin");
                    secim=sc.nextInt();
                    break;


            }

        }
        while (secim!=0);


    }

}
