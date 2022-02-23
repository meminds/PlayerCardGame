
public class Futbolcu extends Sporcu{
    
    private int penalti;
    private int serbestAtis;
    private int kaleciyleKarsiKarsiya;
    private boolean kartKullanildiMi=false;
   
    public Futbolcu() {
    }
    
    public Futbolcu(String futbolcuAdi, String futbolcuTakim) {
        super(futbolcuAdi, futbolcuTakim);
    }

    public Futbolcu(int penalti, int serbestAtis, int kaleciyleKarsiKarsiya, String sporcuIsim, String sporcuTakim) {
        super(sporcuIsim, sporcuTakim);
        this.penalti = penalti;
        this.serbestAtis = serbestAtis;
        this.kaleciyleKarsiKarsiya = kaleciyleKarsiKarsiya;
    }

    public int getPenalti() {
        return penalti;
    }

    public void setPenalti(int penalti) {
        this.penalti = penalti;
    }

    public int getSerbestAtis() {
        return serbestAtis;
    }

    public void setSerbestAtis(int serbestAtis) {
        this.serbestAtis = serbestAtis;
    }

    public int getKaleciyleKarsiKarsiya() {
        return kaleciyleKarsiKarsiya;
    }

    public void setKaleciyleKarsiKarsiya(int kaleciyleKarsiKarsiya) {
        this.kaleciyleKarsiKarsiya = kaleciyleKarsiKarsiya;
    }

    @Override
    public boolean isKartKullanildiMi() {
        return kartKullanildiMi;
    }

    @Override
    public void setKartKullanildiMi(boolean kartKullanildiMi) {
        this.kartKullanildiMi = kartKullanildiMi;
    }
    
    

    @Override
    public int sporcuPuaniGoster(int tercih) {
        switch(tercih){
            case 1:
                return this.penalti;
            case 2:
                return this.serbestAtis;
            case 3:
                return this.kaleciyleKarsiKarsiya;
            
        }
         
       return -1;
        
        
    }
}
