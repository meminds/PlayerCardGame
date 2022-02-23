
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.ImageObserver;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class KartPickup extends JFrame implements ActionListener {
    String oyuncuadi;
    int futbol=0;
    int basket=0;
 
    JButton basla;
    JButton sifirla;
    JTextField textfield;
    JTextField textfield2;
    JLabel label;
    JButton[] kartlar= new JButton[8];
    
    ArrayList<Integer> kartindex = new ArrayList<>();
    
    public KartPickup(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        
        
        
        ImageIcon simg = new ImageIcon("logo.jpg");
        ImageIcon bgimg = new ImageIcon("background.jpg");
        label = new JLabel(bgimg);
        label.setSize(800, 600);
        this.setIconImage(simg.getImage());
        
        this.setTitle("Kart Oyunu");
        
       
        /*
        kartlar[0] = new JButton("Messi",new ImageIcon(getClass().getResource("/img/messi.png")));
        kartlar[1] = new JButton("Ronaldo",new ImageIcon(getClass().getResource("/img/ronaldo.png")));
        kartlar[2] = new JButton("Kevin de Bruyne",new ImageIcon(getClass().getResource("/img/debruyne.png")));
        kartlar[3] = new JButton("Neymar",new ImageIcon(getClass().getResource("/img/neymar.png")));
        kartlar[4] = new JButton("Stephen Curry",new ImageIcon(getClass().getResource("/img/curry2.jpg")));
        kartlar[5] = new JButton("Lebron James",new ImageIcon(getClass().getResource("img/lebron.jpg")));
        kartlar[6] = new JButton("Luka Doncic",new ImageIcon(getClass().getResource("/img/doncic.jpg")));
        kartlar[7] = new JButton("James Harden",new ImageIcon(getClass().getResource("/img/harden2.jpg")));
       
       
        kartlar[0].setBounds(10, 20, 120, 200);
        kartlar[1].setBounds(140, 20, 120, 200);
        kartlar[2].setBounds(270, 20, 120, 200);
        kartlar[3].setBounds(400, 20, 120, 200);
        kartlar[4].setBounds(10, 300, 120, 200);
        kartlar[5].setBounds(140, 300, 120, 200);
        kartlar[6].setBounds(270, 300, 120, 200);
        kartlar[7].setBounds(400, 300, 120, 200);*/
        
        basla = new JButton("Başla");
      //  sifirla = new JButton("Sıfırla");
        textfield = new JTextField();
        textfield.setEditable(true);
        textfield2=new JTextField("Adınız : ");
        textfield2.setEditable(false);
        textfield2.setVisible(true);
      /*
          for(int i = 0 ; i <kartlar.length;i++){
            kartlar[i].addActionListener(this);
            kartlar[i].setFocusable(false);
            this.add(kartlar[i]);
        }
         */
      
        basla.addActionListener(this);
   
      
        
       
        textfield.setBounds(300, 170, 200, 20);
        textfield2.setBounds(250,170,50,20);
        textfield2.setBorder(BorderFactory.createEmptyBorder());
        textfield2.setForeground(Color.WHITE);
        textfield2.setFont(new Font(null,Font.BOLD,14));
        textfield2.setOpaque(false);
       
        textfield.setBorder(BorderFactory.createEmptyBorder());
        
        basla.setBounds(350, 200, 80, 20);

        
        
         
                 
        
        
        
       
        
        this.add(basla);
        this.add(textfield);
        
        this.add(textfield2);
         this.add(label);
        this.setSize(800, 600);
        this.setVisible(true);
        
        
      
    }

    
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        
      
        
        if(e.getSource()==basla){
          Oyuncu oyuncu = new Oyuncu(0,textfield.getText(),0);
           this.dispose();
           Test oyun=new Test(oyuncu);
            
            
        }
        
        
        
        
    }
    
   
    
    
}
