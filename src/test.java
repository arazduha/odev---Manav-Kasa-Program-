import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        //değişkenler tanımlandı
        double armut = 2.14, elma =3.67, domates=1.11, muz=0.95, patlican=5.0, tpl;
        double armuts, elmas, domatess, muzs, patlicans;
        double a1, a2, a3, a4, a5;

        Scanner inp = new Scanner(System.in);
        //değer gir - yarıçap

        System.out.print("Armut kac kilo= ");
        armuts= inp.nextDouble();
        a1 = armuts * armut;

        System.out.print("Elma kac kilo= ");
        elmas= inp.nextDouble();
        a2 = elmas * elma;

        System.out.print("Domates kac kilo= ");
        domatess= inp.nextDouble();
        a3 = domatess * domates;

        System.out.print("Muz kac kilo= ");
        muzs= inp.nextDouble();
        a4 = muzs * muz;

        System.out.print("Patlican kac kilo= ");
        patlicans= inp.nextDouble();
        a5 = patlicans * patlican;

      // formül
      tpl = (a1+a2+a3+a4+a5);

      System.out.println("Toplam tutar= " + tpl);
    }
}
