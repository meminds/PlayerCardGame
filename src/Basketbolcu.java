
public class Basketbolcu extends Sporcu {
    
    private int ikilik;
    private int ucluk;
    private int serbestAtis;
    private boolean kartKullanildiMi=false;
    

    public Basketbolcu() {
    }

    public Basketbolcu(String basketbolcuAdi, String  basketbolcuTakim) {
        super(basketbolcuAdi,  basketbolcuTakim);
    }

    public Basketbolcu(int ikilik, int ucluk, int serbestAtis, String sporcuIsim, String sporcuTakim) {
        super(sporcuIsim, sporcuTakim);
        this.ikilik = ikilik;
        this.ucluk = ucluk;
        this.serbestAtis = serbestAtis;
    }

    public int getIkilik() {
        return ikilik;
    }

    public void setIkilik(int ikilik) {
        this.ikilik = ikilik;
    }

    public int getUcluk() {
        return ucluk;
    }

    public void setUcluk(int ucluk) {
        this.ucluk = ucluk;
    }

    public int getSerbestAtis() {
        return serbestAtis;
    }

    public void setSerbestAtis(int serbestAtis) {
        this.serbestAtis = serbestAtis;
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
                return this.ikilik;
            case 2:
                return this.ucluk;
            case 3:
                return this.serbestAtis;
            
        }
         
       
        return -1 ;
    }
    
    
    
    
    
    
        
}
