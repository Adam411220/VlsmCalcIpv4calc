public class Operacje implements Zamien {

    public int and(int l1, int l2)

    {
        int result=l1&l2;
        return result;
    }



    public int not(int l) {
        int result = 0;
        switch (l) {
            case 0:
                result=255;
                break;

            case 128:
                result=127;
                break;

            case 192:
                result=63;
                break;

            case 224:
                result=31;
                break;

            case 240:
                result=15;
                break;

            case 248:
                result=7;
                break;

            case 252:
                result=3;
                break;

            case 254:
                result=1;
                break;

            case 255:
                result=0;
                break;



        }

        return result;


    }


    @Override
    public String zamien(int o) {
        return null;
    }
}
