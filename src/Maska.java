import java.util.GregorianCalendar;

public class Maska {
    public Maska() {
    }

    public int przypiszjedynki(int l) {
        int result = 0;
        switch (l) {
            case 0:
                result = 0;
                break;

            case 128:
                result = 1;
                break;

            case 192:
                result = 2;
                break;

            case 224:
                result = 3;
                break;

            case 240:
                result = 4;
                break;

            case 248:
                result = 5;
                break;

            case 252:
                result = 6;
                break;

            case 254:
                result = 7;
                break;

            case 255:
                result = 8;
                break;


        }


        return result;


    }

    public int maskadziesietnie(int l1, int l2, int l3, int l4) {
        int a = przypiszjedynki(l1);
        int b = przypiszjedynki(l2);
        int c = przypiszjedynki(l3);
        int d = przypiszjedynki(l4);

        return a + b + c + d;


    }


    public int maskajedynki(int l1, int l2, int l3, int l4) {
        int a, b, c, d;
        a = Integer.bitCount(l1);
        b = Integer.bitCount(l2);
        c = Integer.bitCount(l3);
        d = Integer.bitCount(l4);

        return a + b + c + d;

    }







}
