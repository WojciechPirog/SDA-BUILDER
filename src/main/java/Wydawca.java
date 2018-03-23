public class Wydawca {
    String nazwa;
    String adres;

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public Wydawca(String nazwa, String adres) {
        this.nazwa = nazwa;
        this.adres = adres;
    }

    @Override
    public String toString() {
        return "wydawnictwo: " + getNazwa() + ", " + getAdres();
    }
}
