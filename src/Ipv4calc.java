import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collection;

import static javax.swing.JOptionPane.showMessageDialog;

public class Ipv4calc {
    private JPanel Ipv4calcp;
    private JTabbedPane zakldaki;
    private JPanel ads;




    private JPanel vlsm;
    private JPanel AdresSieci;
    private JTextField oktet1;
    private JTextField oktet2;
    private JTextField oktet3;
    private JTextField oktet4;
    private JButton liczButton;
    private JTextField adresrozgloszeniwoy;
    private JTextField liczbahostow;
    private JTextField adressieci;
    private JComboBox maska1;
    private JComboBox maska2;
    private JComboBox maska3;
    private JComboBox maska4;
    private JTextField oktet1vlsm;
    private JTextField oktet2vlsm;
    private JTextField oktet3vlsm;
    private JTextField oktet4vlsm;
    private int ao1, ao2, ao3, ao4, mo1, mo2, mo3, mo4;
    private Adresy adresy = new Adresy();
    private Maska maskaLabel = new Maska();
    private JButton addn;


    private JTextField mvlsm;
    private JPanel mvlsmp;
    private JLabel mvlsm2;
    private JLabel mvlsm3;
    private JLabel mvlsm4;
    private JLabel mvlsm1;
    private JPanel addn1;
    private JButton plus;
    private JTextPane listapods;
    private JButton wyswietlButton;
    private ArrayList<JTextField> polah;
    private ArrayList<String> podsieci;
    private ArrayList <Integer> liczbadosth;
    private int lh;
    private int wynik;
    private String lho;


    private int klik = 0;

    public void clear()
    {
        oktet1vlsm.setText("");
        oktet2vlsm.setText("");
        oktet3vlsm.setText("");
        oktet4vlsm.setText("");
        mvlsm.setText("");
        mvlsm1.setText("");
        mvlsm2.setText("");
        mvlsm3.setText("");
        mvlsm4.setText("");
        polah.clear();
        polah.removeAll(polah);
        podsieci.clear();
        podsieci.removeAll(podsieci);
        listapods.setText("");
        listapods.revalidate();
        listapods.repaint();
        vlsm.revalidate();
        vlsm.repaint();

    }

    public  void run() {
        JFrame frame = new JFrame("Ipv4calc");
        frame.setContentPane(new Ipv4calc().Ipv4calcp);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }




    public Ipv4calc() {
        polah = new ArrayList<JTextField>();
        podsieci = new ArrayList<String>();
        liczbadosth = new ArrayList<Integer>();



        maska1.addItem("0");
        maska1.addItem("128");
        maska1.addItem("192");
        maska1.addItem("224");
        maska1.addItem("240");
        maska1.addItem("248");
        maska1.addItem("252");
        maska1.addItem("254");
        maska1.addItem("255");



        maska2.addItem("0");
        maska2.addItem("128");
        maska2.addItem("192");
        maska2.addItem("224");
        maska2.addItem("240");
        maska2.addItem("248");
        maska2.addItem("252");
        maska2.addItem("254");
        maska2.addItem("255");


        maska3.addItem("0");
        maska3.addItem("128");
        maska3.addItem("192");
        maska3.addItem("224");
        maska3.addItem("240");
        maska3.addItem("248");
        maska3.addItem("252");
        maska3.addItem("254");
        maska3.addItem("255");


        maska4.addItem("0");
        maska4.addItem("128");
        maska4.addItem("192");
        maska4.addItem("224");
        maska4.addItem("240");
        maska4.addItem("248");
        maska4.addItem("252");
        maska4.addItem("254");
        maska4.addItem("255");

        liczButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                ao1 =Integer.parseInt(oktet1.getText());
                ao2 =Integer.parseInt(oktet2.getText());
                ao3 =Integer.parseInt(oktet3.getText());
                ao4 =Integer.parseInt(oktet4.getText());
                mo1= Integer.parseInt(maska1.getSelectedItem().toString());
                mo2= Integer.parseInt(maska2.getSelectedItem().toString());
                mo3= Integer.parseInt(maska3.getSelectedItem().toString());
                mo4= Integer.parseInt(maska4.getSelectedItem().toString());





                String adreso1 = String.valueOf(adresy.adressiecioktet(ao1,mo1));
                String adreso2 = String.valueOf(adresy.adressiecioktet(ao2,mo2));
                String adreso3 = String.valueOf(adresy.adressiecioktet(ao3,mo3));
                String adreso4 = String.valueOf(adresy.adressiecioktet(ao4,mo4));


                String adreso5 = String.valueOf(adresy.adresrozgloszeniowy(ao1,mo1));
                String adreso6 = String.valueOf(adresy.adresrozgloszeniowy(ao2,mo2));
                String adreso7 = String.valueOf(adresy.adresrozgloszeniowy(ao3,mo3));
                String adreso8 = String.valueOf(adresy.adresrozgloszeniowy(ao4,mo4));
                String liczbahostoww = String.valueOf(adresy.liczbahostow(mo1,mo2,mo3,mo4));

                if(ao1>255||ao1<0||ao2>255||ao2<0||ao3>255||ao3<0||ao4>255||ao4<0||mo1<0) {
                    JOptionPane.showMessageDialog(null, "Liczba każdego z oktetu musi być z przedziału od 1 do 255");

                }




                adressieci.setText(adreso1+"."+adreso2+"."+adreso3+"."+adreso4+"/"+ maskaLabel.maskadziesietnie(mo1,mo2,mo3,mo4));
                adresrozgloszeniwoy.setText(adreso5+"."+adreso6+"."+adreso7+"."+adreso8+"/"+ maskaLabel.maskadziesietnie(mo1,mo2,mo3,mo4));
                liczbahostow.setText(liczbahostoww);







            }
        });


        plus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                Vlsm vlsm1 = new Vlsm();

                addn1.setVisible(true);




                mvlsmp.revalidate();




              String maska=mvlsm.getText();




                for(int i=0; i<polah.size(); i++){

                    lh=Integer.parseInt(polah.get(i).getText());


                    if(lh<1)
                    {
                        JOptionPane.showMessageDialog(null, "Liczba hostów musi być większa od 0");
                        polah.get(i).remove(i);

                    }








                  else  if (lh <Math.pow(2,8)-1) {
                        String nowm = String.valueOf(vlsm1.przypiszmaskeoktet(lh));
                        mvlsm1.setText("255");
                        mvlsm2.setText("255");
                        mvlsm3.setText("255");
                        mvlsm4.setText(nowm);

                    } else if (lh <Math.pow(2, 16)-1) {
                        String nowm = String.valueOf(vlsm1.przypiszmaskeoktet(lh));
                        mvlsm1.setText("255");
                        mvlsm2.setText("255");
                        mvlsm3.setText(nowm);
                        mvlsm4.setText("0");
                    } else if (lh <Math.pow(2, 24)-1) {
                        String nowm = String.valueOf(vlsm1.przypiszmaskeoktet(lh));
                        mvlsm1.setText("255");
                        mvlsm2.setText(nowm);
                        mvlsm3.setText("0");
                        mvlsm4.setText("0");
                    } else if (lh <Math.pow(2, 32)-1) {

                        String nowm = String.valueOf(vlsm1.przypiszmaskeoktet(lh));
                        mvlsm1.setText(nowm);
                        mvlsm2.setText("0");
                        mvlsm3.setText("0");
                        mvlsm4.setText("0");
                    }

                }








            klik++;
                JTextField pole =new JTextField("Liczba hostów sieci nr "+klik);
                polah.add(pole);
                addn1.add(pole);
                addn1.revalidate();









                        String o1a = String.valueOf(adresy.adressiecioktet(Integer.parseInt(oktet1vlsm.getText()), Integer.parseInt(mvlsm1.getText())));
                        String o2a = String.valueOf(adresy.adressiecioktet(Integer.parseInt(oktet2vlsm.getText()), Integer.parseInt(mvlsm2.getText())));
                        String o3a = String.valueOf(adresy.adressiecioktet(Integer.parseInt(oktet3vlsm.getText()), Integer.parseInt(mvlsm3.getText())));
                        String o4a = String.valueOf(adresy.adressiecioktet(Integer.parseInt(oktet4vlsm.getText()), Integer.parseInt(mvlsm4.getText())));

                        String o1r = String.valueOf(adresy.adresrozgloszeniowy(Integer.parseInt(oktet1vlsm.getText()), Integer.parseInt(mvlsm1.getText())));
                        String o2r = String.valueOf(adresy.adresrozgloszeniowy(Integer.parseInt(oktet2vlsm.getText()), Integer.parseInt(mvlsm2.getText())));
                        String o3r = String.valueOf(adresy.adresrozgloszeniowy(Integer.parseInt(oktet3vlsm.getText()), Integer.parseInt(mvlsm3.getText())));
                        String o4r = String.valueOf(adresy.adresrozgloszeniowy(Integer.parseInt(oktet4vlsm.getText()), Integer.parseInt(mvlsm4.getText())));

                       String maskadz= String.valueOf(maskaLabel.maskadziesietnie(Integer.parseInt(mvlsm1.getText()),Integer.parseInt(mvlsm2.getText()),Integer.parseInt(mvlsm3.getText()),Integer.parseInt(mvlsm4.getText())));
                        lho= String.valueOf(adresy.liczbahostow(Integer.parseInt(mvlsm1.getText()),Integer.parseInt(mvlsm2.getText()),Integer.parseInt(mvlsm3.getText()),Integer.parseInt(mvlsm4.getText())));
                        podsieci.add(klik-1+": Adres sieci: "+o1a + "." + o2a + "." + o3a + "." + o4a +" / "+maskadz+ " Adres rozgłoszeniowy: "+o1r+"."+o2r+"."+o3r+"."+o4r+" Liczba dostępnych hostów : "+lho+"\n" );

                        wynik= wynik+Integer.parseInt(lho);
                       // System.out.println(wynik);
                if (Integer.parseInt(String.valueOf(wynik)) >= Math.pow(2, 32 - Integer.parseInt(mvlsm.getText())) - 1)
                {
                    JOptionPane.showMessageDialog(null, "zła maska maksymalna ilość hostów dla podanej maski to "+(Math.pow(2, 32 - Integer.parseInt(mvlsm.getText())) - 2)+ " uruchom program jescze raz");
                    Ipv4calcp.removeAll();
                }

                else







                listapods.setText(String.valueOf(podsieci));

                oktet1vlsm.setText(o1r);
                oktet2vlsm.setText(o2r);




                if(Integer.parseInt(lho)>Math.pow(2,8)-1||Integer.parseInt(o4r)>=255)
                {   oktet3vlsm.setText(String.valueOf(Integer.parseInt(o3r)+1));
                    oktet4vlsm.setText("0");
                }

                else
                    oktet4vlsm.setText(String.valueOf(Integer.parseInt(o4r)+1));

















                listapods.revalidate();



            }
        });
        addn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                if(Integer.parseInt(oktet1vlsm.getText())>255||Integer.parseInt(oktet1vlsm.getText())<0||Integer.parseInt(oktet2vlsm.getText())>255||Integer.parseInt(oktet2vlsm.getText())<0||Integer.parseInt(oktet3vlsm.getText())>255||Integer.parseInt(oktet3vlsm.getText())<0||Integer.parseInt(oktet4vlsm.getText())>255||Integer.parseInt(oktet4vlsm.getText())<0)
                {
                    JOptionPane.showMessageDialog(null, "Liczba każdego z oktetu musi być z przedziału od 1 do 255");


                }
                else



                 addn1.setVisible(true);







                mvlsmp.revalidate();


                }


        });



    }


}
