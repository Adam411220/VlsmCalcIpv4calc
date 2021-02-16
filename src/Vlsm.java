public class Vlsm<liczbahostow> {
    private Adresy adresy = new Adresy();
    private Maska maska = new Maska();


    public double log2(int N) {

        double result =  (Math.log(N) / Math.log(2));

        return result;
    }


   public int  wyznaczliczbehostow(double liczbahostow)
    {

        for(int i=1; i<=32; i++)

        {

            if(liczbahostow+2<=Math.pow(2,i)) {
                liczbahostow = (int) Math.pow(2, i);
                break;
            }

        }
        return (int) liczbahostow;

        }

        public int wyznaczmaske(int liczbahostow)
        {
         int a=wyznaczliczbehostow(liczbahostow);
         int wynik= (int) (32-log2(a));
         return wynik;
        }







    public int przypiszliczbe(int l) {
        int result = 0;
        switch (l) {
            case 0:
                result = 0;
                break;

            case 1:
                result = 128;
                break;

            case 2:
                result = 192;
                break;

            case 3:
                result = 224;
                break;

            case 4:
                result = 240;
                break;

            case 5:
                result = 248;
                break;

            case 6:
                result = 252;
                break;

            case 7:
                result = 254;
                break;

            case 8:
                result = 255;
                break;


        }


        return result;
    }

    public int przypiszmaskeoktet(int liczbahostow)
    {
        int maska=wyznaczmaske(liczbahostow);
        int wynik;
        if (maska < 8 )
        {
            wynik=przypiszliczbe(maska);

        }
        else if (maska < 16 )
        {
            wynik=(przypiszliczbe(maska - 8));
        }
        else if (maska < 24)
        {
            wynik=(przypiszliczbe(maska - 16));
        }
        else  {

            wynik = (przypiszliczbe(maska - 24));
        }


        return wynik;

    }



}
