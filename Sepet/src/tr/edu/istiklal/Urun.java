package tr.edu.istiklal;

public abstract class Urun {
   protected String urunAdi;
   protected double urunFiyati;

    public Urun(String urunAdi, double urunFiyati) {
        this.urunAdi = urunAdi;
        this.urunFiyati = urunFiyati;
    }
   

    public String getUrunAdi() {
        return urunAdi;
    }

    public double getUrunFiyati() {
        return urunFiyati;
    }
    
   public abstract double kdvHesapla(); 
    
   @Override
   public String toString() {
       return urunAdi;
   }
 
}