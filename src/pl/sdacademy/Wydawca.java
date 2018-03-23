package pl.sdacademy;

public class Wydawca {
    private String nazwa;
    private String adres;

    public Wydawca(String nazwa, String adres) {
        this.nazwa = nazwa;
        this.adres = adres;
    }

    public String getNazwa() {
        return nazwa;
    }

    public String getAdres() {
        return adres;
    }

    @Override
    public String toString() {
        return "Wydawca{" +
                "nazwa='" + nazwa + '\'' +
                ", adres='" + adres + '\'' +
                '}';
    }
}
