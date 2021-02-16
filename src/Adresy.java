import javax.lang.model.type.NullType;
import java.security.PublicKey;

public class Adresy implements Zamien {


    public Adresy() {
    }

    @Override
   public String zamien(int o1) {
        String l1s = Integer.toBinaryString(o1);

         return l1s;

    }




   public int adressiecioktet(int adreso,int maskao)

    {
        Operacje operacje=new Operacje();

        int oktet=operacje.and(adreso,maskao);
        if(adreso<0||adreso>255||maskao<0||maskao>255)
            return 0;


        return oktet;

    }

    public int adressieckioktetjedynki(int os,int om)
    {
     int ok1=adresrozgloszeniowy(os,om);

            return Integer.bitCount(ok1);
    }



   public int adresrozgloszeniowy(int adreso, int maskao)

    {
        Operacje operacje=new Operacje();
        int mn=operacje.not(maskao);
        int oktet=mn+adressiecioktet(adreso,maskao);

        return oktet;


    }

   public int liczbahostow(int m1, int m2, int m3, int m4)
    {
        Maska maska=new Maska();

        double wynik= Math.pow(2,(32-(maska.maskadziesietnie(m1,m2,m3,m4))))-2;
        return (int) wynik;
    }









}