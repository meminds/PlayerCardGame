
import java.awt.Color;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class Test extends JFrame implements ActionListener{
    String sira="";
    public static Sporcu messi;
    public static Sporcu ronaldo;
    public static Sporcu kevin;
    public static Sporcu neymar;
    public static Sporcu curry;
    public static Sporcu lebron;
    public static Sporcu doncic;
    public static Sporcu harden;
    public static Sporcu bale;
    public static Sporcu mbappe;
    public static Sporcu salah;
    public static Sporcu under;
    public static Sporcu ante;
    public static Sporcu davis;
    public static Sporcu kyrie;
    public static Sporcu russel;
      JTextField textfield;
      JTextField textfield2;
      JTextField textfield3;
      JTextArea textarea;
      JLabel  label;
      JButton button1;
      int x=700;
      int y=750;
      Bilgisayar bil;
     public static Sporcu[] kartlarpc2=new Sporcu[8];
     public static Sporcu[] kartlar = new Sporcu[8];
       Oyuncu oyuncu;
       int tercihbot;
       int tercih ;
       int puan;
       int puan2;
       JButton[] oyuncukartlar= new JButton[8];
       JButton[] pckartlar= new JButton[8];
       Rectangle r;
       boolean oyunsirasi=false;
       
             
   public static void main(String[] args){
       boolean oyunBitti=false;
       
       
      messi = new Futbolcu(90, 85, 92, "Messi", "Barcelona");
      ronaldo = new Futbolcu(95,87,87,"Ronaldo","Juventus");
      kevin = new Futbolcu(90,82,89,"Kevin de Bruyne" , "Manchester City");
      neymar = new Futbolcu(92,81,93,"Neymar" , "Paris st German");
      curry = new Basketbolcu(88,95,92,"Stephen Curry" , "Golden State Warriors");
      lebron = new Basketbolcu(95,88,91,"Lebron James" , "Los Angeles Lakers");
      doncic = new Basketbolcu(83,90,88,"Luka Doncic","Dallas Mavericks");
      harden = new Basketbolcu(89,93,93,"James Harden","Houston Rockets");
      
      
      bale = new Futbolcu(87,84,83,"Gareth Bale", "Real Madrid");
      mbappe = new Futbolcu(82,79,92,"Mbappe","Paris St German");
      salah = new Futbolcu(86,87,91,"Mohammed Salah","Liverpool");
      under = new Futbolcu(85,89,82,"Cengiz Under","Leicester City");
      ante = new Basketbolcu(93,88,88,"Giannis Antetokounmpo","Milwaukee Bucks");
      davis = new Basketbolcu(92,82,86,"Anthony Davis","Los Angeles Lakers");
      kyrie = new Basketbolcu(88,92,95,"Kyrie Irving","Brooklyn Nets");
      russel = new Basketbolcu(92,90,89,"Russel Westbrook","Washington Wizards");
       
       kartlar[0]=messi;
       kartlar[1]=ronaldo;
       kartlar[2]=kevin;
       kartlar[3]=neymar;
       kartlar[4]=curry;
       kartlar[5]=lebron;
       kartlar[6]=doncic;
       kartlar[7]=harden;
       
       Oyuncu.setKartlar(kartlar);
       
    
       kartlarpc2[0]=bale;
       kartlarpc2[1]=mbappe;
       kartlarpc2[2]=salah;
       kartlarpc2[3]=under;
       kartlarpc2[4]=ante;
       kartlarpc2[5]=davis;
       kartlarpc2[6]=kyrie;
       kartlarpc2[7]=russel;
        KartPickup kart = new KartPickup();
       
      
       
       
       
    
       
       
       
   
  }

    public Test(Oyuncu oyuncu) {
        bil= new Bilgisayar(-1, "Bilgisayar", 0);
        ImageIcon simg = new ImageIcon("logo.jpg");
        ImageIcon bg = new ImageIcon(getClass().getResource("/img/19201080f.jpg"));
       
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setIconImage(simg.getImage());
        this.setTitle("Kart Oyunu ");
        
       this.oyuncu=oyuncu;
        
        
        pckartlar[0] = new JButton(new ImageIcon(getClass().getResource("/img/bale.jpg")));
        pckartlar[1] = new JButton(new ImageIcon(getClass().getResource("/img/mbappe.jpg")));
        pckartlar[2] = new JButton(new ImageIcon(getClass().getResource("/img/salah.jpg")));
        pckartlar[3] = new JButton(new ImageIcon(getClass().getResource("/img/under.jpg")));
        pckartlar[4] = new JButton(new ImageIcon(getClass().getResource("/img/ante.jpg")));
        pckartlar[5] = new JButton(new ImageIcon(getClass().getResource("/img/davis.jpg")));
        pckartlar[6] = new JButton(new ImageIcon(getClass().getResource("/img/kyrie.jpg")));
        pckartlar[7] = new JButton(new ImageIcon(getClass().getResource("/img/russel.jpg")));
        
        for(int i = 0 ; i < pckartlar.length;i++){
            this.add(pckartlar[i]);
        }
        
        
        //action command
        
        oyuncukartlar[0] = new JButton(new ImageIcon(getClass().getResource("/img/messi.png")));
        oyuncukartlar[1] = new JButton(new ImageIcon(getClass().getResource("/img/ronaldo.png")));
        oyuncukartlar[2] = new JButton(new ImageIcon(getClass().getResource("/img/debruyne.png")));
        oyuncukartlar[3] = new JButton(new ImageIcon(getClass().getResource("/img/neymar.png")));
        oyuncukartlar[4] = new JButton(new ImageIcon(getClass().getResource("/img/curry2.jpg")));
        oyuncukartlar[5] = new JButton(new ImageIcon(getClass().getResource("img/lebron.jpg")));
        oyuncukartlar[6] = new JButton(new ImageIcon(getClass().getResource("/img/doncic.jpg")));
        oyuncukartlar[7] = new JButton(new ImageIcon(getClass().getResource("/img/harden2.jpg")));
        
        oyuncukartlar[0].setActionCommand("messi");
        oyuncukartlar[1].setActionCommand("ronaldo");
        oyuncukartlar[2].setActionCommand("debruyne");
        oyuncukartlar[3].setActionCommand("neymar");
        oyuncukartlar[4].setActionCommand("curry");
        oyuncukartlar[5].setActionCommand("lebron");
        oyuncukartlar[6].setActionCommand("doncic");
        oyuncukartlar[7].setActionCommand("harden");
        
        
        
   
        
        for(int i = 0 ; i<oyuncukartlar.length;i++){
            oyuncukartlar[i].setBounds(500+(i*140), 750, 120, 200);
            oyuncukartlar[i].addActionListener(this);
            oyuncukartlar[i].setFocusable(false);
            oyuncukartlar[i].setVisible(true);
            this.add(oyuncukartlar[i]);
            
            
            
        }       
        
        textfield = new JTextField("Adınız : " + oyuncu.getOyuncuAdi());
        textfield2 = new JTextField("Skor : "+ oyuncu.getSkor());
        textfield3 = new JTextField("PC Skor : "+bil.getSkor());
        textfield.setBounds(100, 100, 200, 20);
        textfield.setOpaque(false);
        textfield2.setOpaque(false);
        textfield3.setOpaque(false);
        textfield.setFont(new Font(null , Font.BOLD,20));
        textfield2.setFont(new Font(null , Font.BOLD,20));
        textfield3.setFont(new Font(null , Font.BOLD,20));
        textfield.setForeground(Color.WHITE);
        textfield2.setForeground(Color.WHITE);
        textfield3.setForeground(Color.WHITE);
        textfield.setBorder(BorderFactory.createEmptyBorder());
        textfield2.setBorder(BorderFactory.createEmptyBorder());
        textfield3.setBorder(BorderFactory.createEmptyBorder());
        textfield.setEditable(false);
        textfield2.setEditable(false);
        textfield3.setEditable(false);
        textfield2.setBounds(100, 130, 200, 20);
        textfield3.setBounds(1600, 100, 200, 20);
        
        textarea = new JTextArea();
        textarea.setBounds(850, 100, 200, 200);
        textarea.setBackground(Color.gray);
        textarea.setVisible(true);
        textarea.setForeground(Color.RED);
        textarea.setFont(new Font(null,Font.ITALIC,20));
        this.add(textarea);
        
        this.add(textfield);
        this.add(textfield2);
        this.add(textfield3);
        
        label = new JLabel(bg);
        label.setBounds(0, 0, 1920, 1080);
      
     
        
       
        
        
        
        
        this.add(label);
        this.setSize(1920, 1080);
        this.setVisible(true);
        
        
        
        
        
    }
   
  public static int pozisyon(String secim){
      if(secim.equals("Futbolcu")){
          int tercih = 1 + (int)(Math.random() * ((3 - 1) + 1));
          
          return tercih;
      }
      else if(secim.equals("Basketbolcu")){
          int tercih = 1 + (int)(Math.random() * ((3 - 1) + 1));
          
          return tercih;
      }
      
      return -1 ;
      
  }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        
        
        if(!oyunsirasi){
            
      
        if(e.getActionCommand().equals("messi")){
            r=oyuncukartlar[0].getBounds();
            oyuncukartlar[0].setVisible(false);
            oyuncukartlar[0].setBounds(400, 400, 120, 200);
            oyuncukartlar[0].setVisible(true);
           
            tercih=0;
            int pozisyon;
            int puan;
            pozisyon = pozisyon("Futbolcu");
            puan = messi.sporcuPuaniGoster(pozisyon);
            if(pozisyon==1){
                textarea.setText("Penaltı \n" + " Messi : " + puan + "\n");
            }
            else if(pozisyon==2){
                textarea.setText("Serbest Atış\n" + " Messi : " + puan + "\n");
            }
            else if(pozisyon==3){
                textarea.setText("Kaleciyle Karşı Karşıya\n" + " Messi : " + puan + "\n");
            }
            
           int botpuani = botOyunda(0,pozisyon,puan);
            check(botpuani, puan);
            oyunsirasi=true;
            
        }
        if(e.getActionCommand().equals("ronaldo")){
            r=oyuncukartlar[1].getBounds();
            oyuncukartlar[1].setVisible(false);
            oyuncukartlar[1].setBounds(400, 400, 120, 200);
            oyuncukartlar[1].setVisible(true);
            tercih=1;
            int pozisyon;
            int puan;
            pozisyon = pozisyon("Futbolcu");
           puan = ronaldo.sporcuPuaniGoster(pozisyon);
           if(pozisyon==1){
                textarea.setText("Penaltı \n" + " Ronaldo : " + puan + "\n");
            }
            else if(pozisyon==2){
                textarea.setText("Serbest Atış\n" + " Ronaldo : " + puan + "\n");
            }
            else if(pozisyon==3){
                textarea.setText("Kaleciyle Karşı Karşıya\n" + " Ronaldo : " + puan + "\n");
            }
            int botpuani = botOyunda(1,pozisyon,puan);
            check(botpuani, puan);
            oyunsirasi=true;
        }
        if(e.getActionCommand().equals("debruyne")){
            r=oyuncukartlar[2].getBounds();
            oyuncukartlar[2].setVisible(false);
            oyuncukartlar[2].setBounds(400, 400, 120, 200);
            oyuncukartlar[2].setVisible(true);
            tercih = 2 ;
            int pozisyon;
            int puan;
            pozisyon = pozisyon("Futbolcu");
             puan = kevin.sporcuPuaniGoster(pozisyon);
             if(pozisyon==1){
                textarea.setText("Penaltı \n" + " Kevin de Bruyne : " + puan + "\n");
            }
            else if(pozisyon==2){
                textarea.setText("Serbest Atış\n" + " Kevin de Bruyne : " + puan + "\n");
            }
            else if(pozisyon==3){
                textarea.setText("Kaleciyle Karşı Karşıya\n" + " Kevin de Bruyne : " + puan + "\n");
            }
            int botpuani = botOyunda(2,pozisyon,puan);
           
            check(botpuani, puan);
            oyunsirasi=true;
        }
        if(e.getActionCommand().equals("neymar")){
            r=oyuncukartlar[3].getBounds();
            oyuncukartlar[3].setVisible(false);
            oyuncukartlar[3].setBounds(400, 400, 120, 200);
            oyuncukartlar[3].setVisible(true);
            tercih=3;
            int pozisyon;
            int puan;
            pozisyon = pozisyon("Futbolcu");
            puan = neymar.sporcuPuaniGoster(pozisyon);
            if(pozisyon==1){
                textarea.setText("Penaltı \n" + " Neymar : " + puan + "\n");
            }
            else if(pozisyon==2){
                textarea.setText("Serbest Atış\n" + " Neymar : " + puan + "\n");
            }
            else if(pozisyon==3){
                textarea.setText("Kaleciyle Karşı Karşıya\n" + " Neymar : " + puan + "\n");
            }
            int botpuani = botOyunda(3,pozisyon,puan);
            check(botpuani, puan);
            oyunsirasi=true;
        }
        
     }  
        
      else if(oyunsirasi){
           
      
        if(e.getActionCommand().equals("curry")){
            r=oyuncukartlar[4].getBounds();
            oyuncukartlar[4].setVisible(false);
            oyuncukartlar[4].setBounds(400, 400, 120, 200);
            oyuncukartlar[4].setVisible(true);
            int pozisyon;
            int puan;
            tercih=4;
            pozisyon = pozisyon("Basketbolcu");
            puan = curry.sporcuPuaniGoster(pozisyon);
            if(pozisyon==1){
                textarea.setText("Üçlük \n" + " Curry : " + puan + "\n");
            }
            else if(pozisyon==2){
                textarea.setText("İkilik\n" + " Curry : " + puan + "\n");
            }
            else if(pozisyon==3){
                textarea.setText("Serbest Atış\n" + " Curry : " + puan + "\n");
            }
            int botpuani = botOyunda(4,pozisyon,puan);
            check(botpuani, puan);
            oyunsirasi=false; 
        }
        if(e.getActionCommand().equals("lebron")){
            r=oyuncukartlar[5].getBounds();
            oyuncukartlar[5].setVisible(false);
            oyuncukartlar[5].setBounds(400, 400, 120, 200);
            oyuncukartlar[5].setVisible(true);
            int pozisyon;
            int puan;
            tercih=5;
            pozisyon = pozisyon("Basketbolcu");
            puan = lebron.sporcuPuaniGoster(pozisyon);
            if(pozisyon==1){
                textarea.setText("Üçlük \n" + " Lebron : " + puan + "\n");
            }
            else if(pozisyon==2){
                textarea.setText("İkilik\n" + " Lebron : " + puan + "\n");
            }
            else if(pozisyon==3){
                textarea.setText("Serbest Atış\n" + " Lebron : " + puan + "\n");
            }
            int botpuani = botOyunda(5,pozisyon,puan);
            check(botpuani, puan);
            oyunsirasi=false;
        }
        if(e.getActionCommand().equals("doncic")){
            r=oyuncukartlar[6].getBounds();
            oyuncukartlar[6].setVisible(false);
            oyuncukartlar[6].setBounds(400, 400, 120, 200);
            oyuncukartlar[6].setVisible(true);
            int pozisyon;
            int puan;
            tercih=6;
            pozisyon = pozisyon("Basketbolcu");
            puan = doncic.sporcuPuaniGoster(pozisyon);
             if(pozisyon==1){
                textarea.setText("Üçlük \n" + " Doncic : " + puan + "\n");
            }
            else if(pozisyon==2){
                textarea.setText("İkilik\n" + " Doncic : " + puan + "\n");
            }
            else if(pozisyon==3){
                textarea.setText("Serbest Atış\n" + " Doncic : " + puan + "\n");
            }
            int botpuani = botOyunda(6,pozisyon,puan);
            check(botpuani, puan);
            oyunsirasi=false;
        }
        if(e.getActionCommand().equals("harden")){
            r=oyuncukartlar[7].getBounds();
            oyuncukartlar[7].setVisible(false);
            oyuncukartlar[7].setBounds(400, 400, 120, 200);
            oyuncukartlar[7].setVisible(true);
            int pozisyon;
            int puan;
            tercih=7;
            pozisyon = pozisyon("Basketbolcu");
            puan = harden.sporcuPuaniGoster(pozisyon);
             if(pozisyon==1){
                textarea.setText("Üçlük \n" + " Harden : " + puan + "\n");
            }
            else if(pozisyon==2){
                textarea.setText("İkilik\n" + " Harden : " + puan + "\n");
            }
            else if(pozisyon==3){
                textarea.setText("Serbest Atış\n" + " Harden : " + puan + "\n");
            }
            int botpuani = botOyunda(7,pozisyon,puan);
            check(botpuani, puan);
            oyunsirasi=false;
        }
        
        
     }  
   
        
         
        
    }
    
    public int botOyunda(int a,int pozisyon,int oyuncupuan){
        int puan=0;
        if(a<4){
            //Futbol Oyunu
            boolean bitti=true;
         
            while(bitti){
                 tercihbot = 0 + (int)(Math.random() * ((3 - 0) + 1));
                
                if(kartlarpc2[tercihbot].isKartKullanildiMi()==false){
                    
                   puan =  kartlarpc2[tercihbot].sporcuPuaniGoster(pozisyon);
                   textarea.setText("\n"+textarea.getText()+ kartlarpc2[tercihbot].getSporcuIsim() + ": "+puan);
                    pckartlar[tercihbot].setVisible(true);
                    pckartlar[tercihbot].setBounds(1250, 400, 120, 200);
                   
                    
                     
                    bitti=false;
                }
                
                
            }
            return puan;  
            
        }
        else{
           boolean bitti = true ; 
           while(bitti){
               tercihbot=4+(int)(Math.random() * ((7-4)+1)); 
                       
                     if(kartlarpc2[tercihbot].isKartKullanildiMi()==false){
                    
                   puan =  kartlarpc2[tercihbot].sporcuPuaniGoster(pozisyon);
                   textarea.setText("\n"+textarea.getText()+ kartlarpc2[tercihbot].getSporcuIsim() + ": "+puan);
                    pckartlar[tercihbot].setVisible(true);
                    pckartlar[tercihbot].setBounds(1250, 400, 120, 200);
                    
                   
                    
                     
                    bitti=false;
                }   
      
                       
           }
           return puan;
           
           
           
        }
        
       
        
    }
   
    // basketbol futbol aynı anda çalışmamalı buda dikkat
    // gösterimler. 
    
   public void check(int pcpuan,int oyuncupuan){
        if(pcpuan > oyuncupuan){
             bil.setSkor(bil.getSkor()+10);
            kartlarpc2[tercihbot].setKartKullanildiMi(true);
          // oyuncukartlar[tercih].setVisible(false);
          //   pckartlar[tercihbot].setVisible(false);
             kartlar[tercih].setKartKullanildiMi(true);
             textfield3.setText("PC Skor : "+bil.getSkor());
            textarea.setText(textarea.getText() + " \n Kazanan PC");
            if(bil.getSkor()+oyuncu.getSkor()==80){
                if(bil.getSkor()>oyuncu.getSkor()){
                    JOptionPane.showMessageDialog(null, "Kazanan : Bilgisayar " + bil.getSkor() + " \n" + "Oyuncu : "+ oyuncu.getSkor(), "Oyun Bitti", JOptionPane.INFORMATION_MESSAGE);
                this.dispose();
                }
                else if(oyuncu.getSkor()>bil.getSkor()){
                      JOptionPane.showMessageDialog(null, "Kazanan : Oyuncu " + oyuncu.getSkor() + " \n" + "Bilgisayar : "+ bil.getSkor(), "Oyun Bitti", JOptionPane.INFORMATION_MESSAGE);
                this.dispose();
                }
                else{
                     JOptionPane.showMessageDialog(null, "BERABERE Oyuncu: " + oyuncu.getSkor() + " \n" + "Bilgisayar : "+ bil.getSkor(), "Oyun Bitti", JOptionPane.INFORMATION_MESSAGE);
                this.dispose();
                }
                
            }
            
             
        }
        else if(oyuncupuan > pcpuan){
            oyuncu.setSkor(oyuncu.getSkor()+10);
            kartlarpc2[tercihbot].setKartKullanildiMi(true);
         //  pckartlar[tercihbot].setVisible(false);
           //oyuncukartlar[tercih].setVisible(false);
            kartlar[tercih].setKartKullanildiMi(true);
            System.out.println(oyuncu.skorGoster());
             textfield2.setText("Skor : "+ oyuncu.getSkor());
             System.out.println(oyuncu.getSkor());
             textarea.setText(textarea.getText() + "\n Kazanan Oyuncu");
             if(bil.getSkor()+oyuncu.getSkor()==80){
                if(bil.getSkor()>oyuncu.getSkor()){
                    JOptionPane.showMessageDialog(null, "Kazanan : Bilgisayar " + bil.getSkor() + " \n" + "Oyuncu : "+ oyuncu.getSkor(), "Oyun Bitti", JOptionPane.INFORMATION_MESSAGE);
                this.dispose();
                }
                else if(oyuncu.getSkor()>bil.getSkor()){
                      JOptionPane.showMessageDialog(null, "Kazanan : Oyuncu " + oyuncu.getSkor() + " \n" + "Bilgisayar : "+ bil.getSkor(), "Oyun Bitti", JOptionPane.INFORMATION_MESSAGE);
                this.dispose();
                }
                else{
                     JOptionPane.showMessageDialog(null, "BERABERE Oyuncu: " + oyuncu.getSkor() + " \n" + "Bilgisayar : "+ bil.getSkor(), "Oyun Bitti", JOptionPane.INFORMATION_MESSAGE);
                this.dispose();
                }
                
            }
        }
        else{
            oyuncukartlar[tercih].setBounds(r);
            textarea.setText(textarea.getText()+"\n BERABERE");
            
            
        }
        
        
        
        
    }
    
    
   
   
}
