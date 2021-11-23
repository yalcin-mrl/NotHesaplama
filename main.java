import java.util.Scanner;
public class main{
    public static void main(String []args){
        Scanner nots = new Scanner(System.in);
        double matNot,fizNot,kimNot,turNot,tarihNot,muzNot;
        System.out.println("Matematik notu gir: ");
        matNot = nots.nextDouble();
        System.out.println("fizik notu gir: ");
        fizNot = nots.nextDouble();
        System.out.println("Kimya notu gir: ");
        kimNot = nots.nextDouble();
        System.out.println("Turkce notu gir: ");
        turNot = nots.nextDouble();
        System.out.println("Tarih notu gir: ");
        tarihNot = nots.nextDouble();
        System.out.println("Muzik notu gir: ");
        muzNot = nots.nextDouble();
        double notOrt = (matNot+fizNot+kimNot+turNot+tarihNot+muzNot)/6;
        if(notOrt>=60){
            System.out.println(notOrt + "ile Geçti");
        }
        else{
            System.out.println(notOrt+" ile Kaldı");
        }
    }
}