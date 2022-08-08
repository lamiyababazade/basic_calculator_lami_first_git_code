package basickalk;

import java.util.Scanner;
public class kalkukyatordusturs {

    public void toplama(){
        Scanner s1=new Scanner(System.in);
         double a1, b1,c1;
         System.out.print("1-ci ədədi daxil et=");
         a1=s1.nextDouble();
        System.out.print("2-ci ədədi daxil et=");
         b1=s1.nextDouble();
         c1=a1+b1;
         System.out.print("nəticə="+c1);
        System.out.println();
        System.out.println();
    }
    public void çıxma(){
        Scanner s2=new Scanner(System.in);
        double a2, b2,c2;
        System.out.print("1-ci ədədi daxil et=");
        a2=s2.nextDouble();
        System.out.print("2-ci ədədi daxil et=");
        b2=s2.nextDouble();
        c2=a2-b2;
        System.out.print("nəticə="+c2);
        System.out.println();
        System.out.println();

    }
    public void vurma(){
        Scanner s3=new Scanner(System.in);
        double a3, b3,c3;
        System.out.print("1-ci ədədi daxil et=");
        a3=s3.nextDouble();
        System.out.print("2-ci ədədi daxil et=");
        b3=s3.nextDouble();
        c3=a3*b3;
        System.out.print("nəticə="+c3);
        System.out.println();
        System.out.println();
    }
    public void bolme(){
        Scanner s4=new Scanner(System.in);
        double a4, b4,c4;
        System.out.print("1-ci ədədi daxil et=");
        a4=s4.nextDouble();
        System.out.print("2-ci ədədi daxil et=");
        b4=s4.nextDouble();
        if (b4==0){
            System.out.println("nəticə goes to infinity");
        }
        else {
            c4 = a4 / b4;
            System.out.print("nəticə=" + c4);
        }
        System.out.println();
        System.out.println();

    }

}
