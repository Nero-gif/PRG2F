package Test;
public class BankovniUcet {
    private String cisloUctu;
    private double zustatek;
    private String mena;
    public BankovniUcet(String cisloUctu, double zustatek, String mena) {
        this.cisloUctu = cisloUctu;
        // Validace zůstatku
        if (zustatek >= 0) {
            this.zustatek = zustatek;
        } else {
            this.zustatek = 0;
        }
        this.mena = mena;
    }
    public BankovniUcet(String cisloUctu) {
        this(cisloUctu, 0, "CZK");
    }
    public String getCisloUctu() {
        return cisloUctu;
    }
    public double getZustatek() {
        return zustatek;
    }
    public String getMena() {
        return mena;
    }
    public void setZustatek(double zustatek) {
        if (zustatek >= 0) {
            this.zustatek = zustatek;
        }
    }
    public void vklad(double castka) {
        if (castka > 0) {
            this.zustatek += castka;
            System.out.println("Na účet " + cisloUctu + " bylo vloženo " + castka + " " + mena +
                    ". Nový zůstatek: " + zustatek + " " + mena);
        }
    }

    public static void main(String[] args) {
        BankovniUcet ucet = new BankovniUcet("123456789");
        ucet.vklad(1000);
        ucet.vklad(500);
        System.out.println("Aktuální zůstatek na účtu " + ucet.getCisloUctu() + ": " + ucet.getZustatek() + " " + ucet.getMena());
    }
}