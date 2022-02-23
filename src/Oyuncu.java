
public class Oyuncu {
    
    private int oyuncuID;
    private String oyuncuAdi;
    private int skor;
    private static Sporcu[] kartlar = new Sporcu[10];
    //kartlistesi yazılacak.

    
    public Oyuncu() {
    }

    public Oyuncu(int oyuncuID, String oyuncuAdi, int skor) {
        this.oyuncuID = oyuncuID;
        this.oyuncuAdi = oyuncuAdi;
        this.skor = skor;
    }

    public int getOyuncuID() {
        return oyuncuID;
    }

    public void setOyuncuID(int oyuncuID) {
        this.oyuncuID = oyuncuID;
    }

    public String getOyuncuAdi() {
        return oyuncuAdi;
    }

    public void setOyuncuAdi(String oyuncuAdi) {
        this.oyuncuAdi = oyuncuAdi;
    }

    public int getSkor() {
        return skor;
    }

    public void setSkor(int skor) {
        this.skor = skor;
    }

    public static Sporcu[] getKartlar() {
        return kartlar;
    }

    public static void setKartlar(Sporcu[] kartlar) {
        Oyuncu.kartlar = kartlar;
    }
    
    
    
    public int skorGoster(){
        return skor;
    }
    public void kartSec(int secim){
        
    }
    
    
}
